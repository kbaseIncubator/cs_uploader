package us.kbase.cs.upload;

import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;

import us.kbase.cs.orm.Dumper;
import us.kbase.common.service.UObject;
import us.kbase.kbasenetworks.Dataset;
import us.kbase.kbasenetworks.Edge;
import us.kbase.kbasenetworks.Network;
import us.kbase.kbasenetworks.Node;

/**
 * Generates CSV files and uploader script for the Network WS object
 * 
 * @author Pavel Novichkov <psnovichkov@lbl.gov>
 * @version 1.0
 */

public class NetworksCSLoader {

	Pattern PATTERN_GENOME = Pattern.compile("(kb\\|g\\.[0-9]+).+");

	public static String sourceDirectory = "/kb/cds/networks/json/";
	public static String targetDirectory = "/kb/cds/networks/";
	public static String filePrefix = "netdataset";
	public static String scriptName = "networks_load.sh";
	
	Node[] clusterNodes = null;
	Node[] featureNodes = null;

	
	public void load() throws Exception{		

		Dumper.setTargetDirectory(targetDirectory);
		
		NetworkBundle bundle = new NetworkBundle();		
		Dumper.init(bundle);
		
		load(bundle);
		
		Dumper.close(bundle);
		Dumper.createImportScript(bundle, scriptName);
	};	
	
	private void load(NetworkBundle bundle) throws Exception {
		
		File[] files = new File(sourceDirectory).listFiles( LoaderUtil.buildFileNameFilter(filePrefix));		
		for(int i = 0; i < files.length; i++){
			LoaderUtil.printFileProgress(filePrefix, files, i);
			String json = FileUtils.readFileToString(files[i]);
			try{
				load(bundle, UObject.transformStringToObject(json, Network.class), files[i]);
			} catch(Exception e){
				System.out.println("Can not load netowrk from file: " + files[i].getName() + ": " + e.getMessage());
				e.printStackTrace();
			}
		}
	}


	private void load(NetworkBundle bundle, Network network, File file) throws Exception {

		
		List<Dataset> datasets = network.getDatasets();
		if(datasets == null || datasets.size() == 0){
			throw new Exception("No datasets in network: " + network.getId());
		}
		if(datasets.size() > 1){
			throw new Exception("More than one dataset in the netotwork: " + network.getId());
		}
		
		Dataset dataset = datasets.get(0);
		
		String _fake_sourceDescription = "";
		String _fake_sourceName = "";
		String _fake_sourceUrl = "";
		String associationDatasetUrl = "file://" + file.getPath();
		
		bundle.scSource
			.withDescription(_fake_sourceDescription)
			.withId(dataset.getSourceRef())			
			.withName(_fake_sourceName)
			.withUrl(_fake_sourceUrl)
			.push();		
		
		bundle.scAssociationDataset
			.withAssociation_type(dataset.getNetworkType())
			.withData_source(dataset.getSourceRef())
			.withDescription(dataset.getName() + "; " + dataset.getDescription())
			.withId(dataset.getId())
			.withUrl(associationDatasetUrl)
			.push();
		
		bundle.scAssociationDataset
			.flush();
		
		bundle.scIsSourceForAssociationDataset
			.withFrom_link(dataset.getSourceRef())
			.withTo_link(dataset.getId())
			.push();		
		
		
		
		for(String taxon: dataset.getTaxons()){
			bundle.scIsDatasetFor
				.withFrom_link(dataset.getId())
				.withTo_link(taxon)
				.push();			
		}
		bundle.scIsDatasetFor
			.flush();
		
		
		// Instead, find out kb genome ids
/*		
		HashSet<String> genomeIds = getGenomeIds(network);
		for(String genomeId: genomeIds){
			bundle.scIsDatasetFor
				.withFrom_link(dataset.getId())
				.withTo_link(genomeId)
				.push();			
		}	
*/		
			
		
		
		populateNodes(network);
		
		// Add all clusters
		for(Node clusterNode: clusterNodes){
			
			if(clusterNode != null){
				bundle.scAssociation
					.withConfidence(null)
					.withDescription(clusterNode.getType())
					.withDirectional((byte) 0)
					.withId(clusterNode.getEntityId())
					.withName(clusterNode.getName())
					.withUrl(null)
					.push();
									
				bundle.scIsGroupingOf
					.withFrom_link(dataset.getId())
					.withTo_link(clusterNode.getEntityId())
					.push();						
			}
		}
		
//		System.out.println("Cluster nodes: exported ");		
		
		
		for(Edge edge: network.getEdges()){			
			
			
			int nodeIndex1 = nodeIndex(edge.getNodeId1());
			int nodeIndex2 = nodeIndex(edge.getNodeId2());

			Node clusterNode = clusterNodes[nodeIndex1];
			if(clusterNode == null){
				clusterNode = clusterNodes[nodeIndex2];
			}
			Node featureNode1 = featureNodes[nodeIndex1];
			Node featureNode2 = featureNodes[nodeIndex2];
						
			if(clusterNode != null){				
				Node featureNode = featureNode1 != null? featureNode1 : featureNode2;
				
				Integer _fake_stochiometry = 0;
				Integer _fake_rank = 0;
			
				bundle.scAssociationFeature
					.withFrom_link(clusterNode.getEntityId())
					.withRank(_fake_rank )
					.withStoichiometry(_fake_stochiometry )
					.withStrength(edge.getStrength() != null ? edge.getStrength().floatValue(): null )
					.withTo_link(featureNode.getEntityId())
					.push();				
			} else{
				
				bundle.scAssociation
					.withConfidence(edge.getConfidence() != null ? edge.getConfidence().floatValue(): null)
					.withDescription(null)
					.withDirectional(edge.getDirected().equalsIgnoreCase("true")? (byte) 1 : 0)
					.withId(edge.getId())
					.withName(edge.getName())
					.withUrl(null)
					.push();
							
				bundle.scIsGroupingOf
					.withFrom_link(dataset.getId())
					.withTo_link(edge.getId())
					.push();	
				
				Integer _fake_stochiometry = 0;
				Integer _fake_rank1 = 1;
				Integer _fake_rank2 = 2;
				
				bundle.scAssociationFeature
					.withFrom_link(edge.getId())
					.withRank(_fake_rank1 )
					.withStoichiometry(_fake_stochiometry )
					.withStrength(edge.getStrength() != null ? edge.getStrength().floatValue(): null )
					.withTo_link(featureNode1.getEntityId())
					.push();
			
				bundle.scAssociationFeature
					.withFrom_link(edge.getId())
					.withRank(_fake_rank2 )
					.withStoichiometry(_fake_stochiometry )
					.withStrength(edge.getStrength() != null ? edge.getStrength().floatValue(): null )
					.withTo_link(featureNode2.getEntityId())
					.push();						
			}
		}
		
				
		// Not needed
		//bundle.scDetectedWithMethod;
		//bundle.scAssociationDetectionType;
		//bundle.scPublishedAssociation;
		//bundle.scPublication;		
	}


	private void populateNodes(Network network) {
//		System.out.println("populateNodes: started");
		int maxIndex = 0;
		for(Node node: network.getNodes()){
			int index = nodeIndex(node.getId());
			if(index > maxIndex) maxIndex = index;
		}
		
		maxIndex++;

//		System.out.println("populateNodes: maxIndex = " + maxIndex);
//		System.out.println("populateNodes: size = " + network.getNodes().size());

		clusterNodes = new Node[maxIndex];
		featureNodes = new Node[maxIndex];
		
		for(Node node: network.getNodes()){
			int index = nodeIndex(node.getId());
			if(node.getType().equals("GENE") || node.getType().equals("PROTEIN")){
				featureNodes[index] = node;
			} else{
				clusterNodes[index] = node;
			}			
		}
//		System.out.println("populateNodes: done ");		
	}
	
	private int nodeIndex(String nodeId){
		int pos = nodeId.lastIndexOf(".");
		return Integer.parseInt(nodeId.substring(pos+1));		
	}

	private HashSet<String> getGenomeIds(Network network) {
		HashSet<String> genomeIds = new HashSet<String>();
		for(Node node: network.getNodes()){
			Matcher mt = PATTERN_GENOME.matcher(node.getEntityId());
			if(mt.matches()){
				genomeIds.add(mt.group(1));
			}
		}
		return genomeIds;
	}

	public static void main(String[] args) throws Exception {
		
		if(args.length > 0 ){
			sourceDirectory = args[0];
		}
		if(args.length > 1 ){
			targetDirectory = args[1];
		}
		if(args.length > 2){
			filePrefix = args[2];
		}
		if(args.length > 3){
			scriptName = args[3];
		}
		
		new NetworksCSLoader().load();
	}
}

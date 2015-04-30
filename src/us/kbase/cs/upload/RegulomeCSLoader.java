package us.kbase.cs.upload;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

import us.kbase.cs.orm.Dumper;
import us.kbase.common.service.UObject;
import us.kbase.kbaseregulation.Effector;
import us.kbase.kbaseregulation.Gene;
import us.kbase.kbaseregulation.Genome;
import us.kbase.kbaseregulation.RegulatedOperon;
import us.kbase.kbaseregulation.Regulator;
import us.kbase.kbaseregulation.Regulome;
import us.kbase.kbaseregulation.Regulon;
import us.kbase.kbaseregulation.TranscriptionFactor;

/**
 * Generates CSV files and uploader script for the Regulome WS object
 * 
 * @author Pavel Novichkov <psnovichkov@lbl.gov>
 * @version 1.0
 */

public class RegulomeCSLoader {
	
	public static String sourceDirectory = "/kb/cds/regulome/json/";
	public static String targetDirectory = "/kb/cds/regulome/cds/";
	public static String filePrefix = "kb";
	public static String scriptName = "regulomes_load.sh";
	
	public void load() throws Exception{		

		Dumper.setTargetDirectory(targetDirectory);
		
		RegulomeBundle bundle = new RegulomeBundle();		
		Dumper.init(bundle);
		
		load(bundle);
		
		Dumper.close(bundle);
		Dumper.createImportScript(bundle, scriptName);
	}

	private void load(RegulomeBundle bundle) throws IOException {
		
		File[] files = new File(sourceDirectory).listFiles( LoaderUtil.buildFileNameFilter(filePrefix));		
		for(int i = 0; i < files.length; i++){
			LoaderUtil.printFileProgress(filePrefix, files, i);
			String json = FileUtils.readFileToString(files[i]);
			try{
				load(bundle, UObject.transformStringToObject(json, Regulome.class));
			} catch(Exception e){
				System.out.println("Can not load netowrk from file: " + files[i].getName() + ": " + e.getMessage());
			}
		}
	}

	private void load(RegulomeBundle bundle, Regulome regulome) throws Exception {
		
		Genome genome = regulome.getGenome();
		
		bundle.scSource
			.withDescription("The RegPrecise is a database for capturing, visualization and analysis of transcription factor regulons that were reconstructed by the comparative genomic approach")
			.withId(regulome.getRegulomeSource())
			.withName(regulome.getRegulomeSource())
			.withUrl("http://regprecise.lbl.gov/")
			.push();
			
		/**
		 * from-link	string	id of the source Regulome.
		 * to-link	string	id of the target Source.
		 */
		bundle.scRegulomeSource
			.withFrom_link(regulome.getRegulomeId())
			.withTo_link(regulome.getRegulomeSource())
			.push();
		
		bundle.scRegulome
			.withCreation_date(null)
			.withDescription(regulome.getRegulomeSource() + ": regulome of " + genome.getGenomeName())
			.withId(regulome.getRegulomeId())
			.push();
		
		/**
		 * from-link	string	id of the source Regulome.
		 * to-link	string	id of the target Genome.
		 */
		bundle.scRegulomeHasGenome
			.withFrom_link(regulome.getRegulomeId())
			.withTo_link(genome.getGenomeId())
			.push();

		for(Regulon regulon: regulome.getRegulons()){
			
			Regulator regulator = regulon.getRegulator();
			
			/**
			 * from-link	string	id of the source Regulome.
			 * to-link	string	id of the target Regulon.
			 */
			bundle.scRegulomeHasRegulon
				.withFrom_link(regulome.getRegulomeId())
				.withTo_link(regulon.getRegulonId())
				.push();
			
			bundle.scRegulon
				.withDescription(regulator.getRegulatorName() + " - " + genome.getGenomeName())
				.withId(regulon.getRegulonId())
				.push();
			
			/**
			 * from-link	string	id of the source Regulator.
			 * to-link	string	id of the target Regulon.
			 */
			bundle.scIsRegulatorForRegulon
				.withFrom_link(regulator.getRegulatorId())
				.withTo_link(regulon.getRegulonId())
				.push();
			
			bundle.scRegulator
				.withId(regulator.getRegulatorId())
				.withName(regulator.getRegulatorName())
				.withRfam_id(regulator.getRfamId())
				.withTaxonomy(regulator.getTaxonomy())
				.withTf_family(regulator.getTfFamily())
				.withType(regulator.getRegulationType())
				.push();

			List<Effector> effectors = regulon.getEffectors();			
			if(effectors != null)
			for(Effector effector: effectors){
				/**
				 * from-link	string	id of the source Regulon.
				 * to-link	string	id of the target Effector.
				 */			
				bundle.scHasEffector
					.withFrom_link(regulon.getRegulonId())
					.withTo_link(effector.getEffectorId())
					.push();
				
				bundle.scEffector
					.withEffector_class(effector.getEffectorClass())
					.withId(effector.getEffectorId())
					.withName(effector.getEffectorName())
					.push();				
			}
			
			
			List<TranscriptionFactor> tfs = regulon.getTfs();
			if(tfs != null)
			for(TranscriptionFactor tf: tfs){
				/**
				 * from-link	string	id of the source Feature.
				 * to-link	string	id of the target Regulon.
				 */
				bundle.scFeatureIsTranscriptionFactorFor
					.withFrom_link(tf.getTranscriptionFactorId())
					.withTo_link(regulon.getRegulonId())
					.push();
			}
			
			List<RegulatedOperon> operons = regulon.getOperons();
			if(operons != null)
			for(RegulatedOperon operon: operons){
				
				/**
				 * from-link	string	id of the source Regulon.
				 * to-link	string	id of the target Operon.
				 */
				bundle.scRegulonHasOperon
					.withFrom_link(regulon.getRegulonId())
					.withTo_link(operon.getOperonId())
					.push();
				
				bundle.scOperon
					.withId(operon.getOperonId())
					.push();
				
				int i = 0;
				for(Gene gene: operon.getGenes()){
					/**
					 * from-link	string	id of the source Feature.
					 * rank	int	The rank (order) of this feature in the operon.
					 * to-link	string	id of the target Operon.
					 */
					bundle.scIsInOperon
						.withFrom_link(gene.getGeneId())
						.withRank(i++)
						.withTo_link(operon.getOperonId())
						.push();
				}
			}
		}
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
		
		new RegulomeCSLoader().load();
	}	
}

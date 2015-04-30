package us.kbase.cs.upload;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.Map.Entry;

import org.apache.commons.io.FileUtils;

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;
import us.kbase.common.service.JsonClientException;
import us.kbase.common.service.UObject;
import us.kbase.idserverapi.IDServerAPIClient;
import us.kbase.kbaseexpression.ExpressionOntologyTerm;
import us.kbase.kbaseexpression.ExpressionPlatform;
import us.kbase.kbaseexpression.ExpressionReplicateGroup;
import us.kbase.kbaseexpression.ExpressionSample;
import us.kbase.kbaseexpression.ExpressionSeries;
import us.kbase.kbaseexpression.Person;
import us.kbase.kbaseexpression.Protocol;
import us.kbase.kbaseexpression.Strain;

/**
 * Generates CSV files and uploader script for the expression related WS objects
 * 
 * @author Pavel Novichkov <psnovichkov@lbl.gov>
 * @version 1.0
 */

public class ExpressionCSLoader {
	
	
	public static final String PLATFORM_TYPE = "microarray";
	public static final Character AGGREGATED_DATA = 'N';

	private static final Date CURRENT_DATE = new Date();

	public static final String SERVICE_ID_URL = "http://kbase.us/services/idserver";
	private static final String GEO_RESOURCE = "GEO";
	private static final String KBASE_PREFIX = "kb|";
	private static final String MEASUREMENT_DESCRIPTION_CATEGORY = "Expression";
	private static final String MEASUREMENT_DESCRIPTION_UNIT_OF_MEASUREMENT = "Level of mRNA abundance";

	private static final String PREFIX_STRAIN_ID = "str";
	private static final String PREFIX_MEASUREMENT_DESCRIPTION_ID = "measdesc";
	private static final String PREFIX_MEASUREMENT_ID = "meas";
	private static final String PREFIX_SAMPLE_ANNOTATION_ID = "sampAnn";
	private static final String PREFIX_PERSON_ID = "per";
	private static final String PREFIX_PROTOCOL_ID = "pro";
	
	private static final String VER_ID_PREF = "v1";
	
	public static IDServerAPIClient idService;
	public static final SimpleDateFormat DATE_FORMAT;	
	static{
		// Asked by Jason to complie with MySql server installed in Argonne
		TimeZone.setDefault(TimeZone.getTimeZone("EST"));
		DATE_FORMAT = new SimpleDateFormat("MMM dd yyyy");
		
		try {
			idService = new IDServerAPIClient(new URL(SERVICE_ID_URL));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	public static String sourceDirectory = "/kb/cds/expression/json/";
	public static String targetDirectory = "/kb/cds/expression/";
	public static String scriptName = "expression_load.sh";
	
	
	public void load() throws Exception{		

		Dumper.setTargetDirectory(targetDirectory);
		
		ExpressionBundle bundle = new ExpressionBundle();		
		Dumper.init(bundle);
		
		load(bundle, sourceDirectory);
		
		Dumper.close(bundle);
		Dumper.createImportScript(bundle, scriptName);
	};
	
	
	private void load(ExpressionBundle bundle, String directory) throws Exception {

		File[] files;		
		//Loading platforms		
		files = new File(directory).listFiles( LoaderUtil.buildFileNameFilter("platform."));		
		for(int i = 0; i < files.length; i++){
			try{
				LoaderUtil.printFileProgress("platform", files, i);
				String json = FileUtils.readFileToString(files[i]);
				load(bundle, UObject.transformStringToObject(json, ExpressionPlatform.class));
			}catch(Exception e){
				System.out.println("Error: can load " + files[i].getName());
				e.printStackTrace();
			}
		}
		
		//Loading replicate groups
		files = new File(directory).listFiles(  LoaderUtil.buildFileNameFilter("repGroup."));		
		for(int i = 0; i < files.length; i++){
			try{
				LoaderUtil.printFileProgress("repGroup", files, i);
				String json = FileUtils.readFileToString(files[i]);
				load(bundle, UObject.transformStringToObject(json, ExpressionReplicateGroup.class));
			}catch(Exception e){
				System.out.println("Error: can load " + files[i].getName());
				e.printStackTrace();
			}			
		}
		
		
//		HashSet<String> sampleIds = new HashSet<String>();
		
		//Loading series
		files = new File(directory).listFiles(  LoaderUtil.buildFileNameFilter("series."));		
		for(int i = 0; i < files.length; i++){
			try{
				LoaderUtil.printFileProgress("series", files, i);
				String json = FileUtils.readFileToString(files[i]);
				load(bundle, UObject.transformStringToObject(json, ExpressionSeries.class));
/*				
				ExpressionSeries es = UObject.transformStringToObject(json, ExpressionSeries.class); 
				if(es.getId().equals("kb|series.278") || es.getId().equals("kb|series.279") || es.getId().equals("kb|series.283") ){
					System.out.println("es.getId() = " + es.getId());
					for(List<String> ssIds : es.getGenomeExpressionSampleIdsMap().values()){
						for(String sampleId: ssIds){
							System.out.println("\t" +  sampleId);
							sampleIds.add(sampleId);
						}
					}
				}
*/				
			}catch(Exception e){
				System.out.println("Error: can load " + files[i].getName());
				e.printStackTrace();
			}			
		}		
		
		//Loading series
		files = new File(directory).listFiles(  LoaderUtil.buildFileNameFilter("sample."));		
		for(int i = 0; i < files.length; i++){
//			if( !sampleIds.contains("kb|" + files[i].getName())  ) continue;
			
			try{
				LoaderUtil.printFileProgress("sample", files, i);
				String json = FileUtils.readFileToString(files[i]);
				load(bundle, UObject.transformStringToObject(json, ExpressionSample.class));
			}catch(Exception e){
				System.out.println("Error: can load " + files[i].getName());
				e.printStackTrace();
			}			
		}			
				 
//		loadTest(bundle, directory);
	}

	private void loadTest(ExpressionBundle bundle, String directory)  throws Exception {
		String json;
		
		System.out.println("loadPlatform");
		json = FileUtils.readFileToString(new File(directory, "test/platform.5"));
		load(bundle, UObject.transformStringToObject(json, ExpressionPlatform.class));
		
		
		System.out.println("loadReplicatinGroup");
		json = FileUtils.readFileToString(new File(directory, "test/repGroup.0"));
		load(bundle, UObject.transformStringToObject(json, ExpressionReplicateGroup.class));
				
		System.out.println("loadSample");
		json = FileUtils.readFileToString(new File(directory, "test/sample.3713"));
		load(bundle, UObject.transformStringToObject(json, ExpressionSample.class));
	
		System.out.println("loadSeries");
		json = FileUtils.readFileToString(new File(directory, "test/series.278"));
		load(bundle, UObject.transformStringToObject(json, ExpressionSeries.class));			
	}

	public void load(ExpressionBundle bundle, ExpressionPlatform ePlatform) throws Exception{
		
		// Populate Strain table
		Strain eStrain  = ePlatform.getStrain();
		Character referenceStrain = eStrain.getReferenceStrain().equals("N") ? 'N' : 'Y';
		Character wildtype = eStrain.getWildType().equals("N") ? 'N' : 'Y';

		String strainExtId = toStrainId(eStrain, ePlatform.getGenomeId());
		Hashtable<String, String> strainId2KbaseIdHash = mapIds(PREFIX_STRAIN_ID, Arrays.asList(strainExtId));		
		String strainKBaseId = strainId2KbaseIdHash.get(strainExtId);
		
		// 06/18/2014: Decided to change source id to key used for registering by ID service 				
		//String _fake_strainSourceId = strainKBaseId;		
		String _fake_strainSourceId = strainExtId;
		
		bundle.csStrain
			.withAggregateData(AGGREGATED_DATA)
			.withDescription(eStrain.getDescription())
			.withId(strainKBaseId)
			.withName(eStrain.getName())
			.withReferenceStrain(referenceStrain)
			.withSource_id(_fake_strainSourceId)
			.withWildtype(wildtype)
			.push();
		
		
		// Populate GenomeParentOf table
		bundle.csGenomeParentOf
			.withFrom_link(ePlatform.getGenomeId())
			.withTo_link(strainKBaseId)
			.push();
		
		// Populate Platform table
		
		// 06/18/2014: Decided to change source id to key used for registering by ID service 				
		//String _fake_platformSourceId = ePlatform.getId();
		String _fake_platformSourceId = ePlatform.getSourceId();
		
		bundle.csPlatform
			.withExternalSourceId(ePlatform.getSourceId())
			.withId(ePlatform.getId())
			.withSource_id(_fake_platformSourceId)
			.withTechnology(ePlatform.getTechnology())
			.withTitle(ePlatform.getTitle())
			.withType(PLATFORM_TYPE)
			.push();
			
		// Populate StrainWithPlatforms table
		bundle.csStrainWithPlatforms
			.withFrom_link(strainKBaseId)
			.withTo_link(ePlatform.getId())
			.push();
	}

	public void load(ExpressionBundle bundle, ExpressionSample eSample) throws Exception{
		
		Long submissionDate = toSQLDate(CURRENT_DATE); 
		
		List<String> averagedFromSamples = eSample.getAveragedFromSamples(); 
		Character custom = (averagedFromSamples != null && averagedFromSamples.size() > 0) ? 'Y' : 'N' ;
	
		Strain eStrain  = eSample.getStrain();
		Character referenceStrain = eStrain.getReferenceStrain().equals("N") ? 'N' : 'Y';
		Character wildtype = eStrain.getWildType().equals("N") ? 'N' : 'Y';
		
		String strainExtId = toStrainId(eStrain, eStrain.getGenomeId());
		Hashtable<String, String> strainId2KbaseIdHash = mapIds(PREFIX_STRAIN_ID, Arrays.asList(strainExtId));		
		String strainKBaseId = strainId2KbaseIdHash.get(strainExtId);
		
		// 06/18/2014: Decided to change source id to key used for registering by ID service 				
		//String _fake_strainSourceId = strainKBaseId;		
		String _fake_strainSourceId = strainExtId;		
		
		bundle.csStrain
			.withAggregateData(AGGREGATED_DATA)
			.withDescription(eStrain.getDescription())
			.withId(strainKBaseId)
			.withName(eStrain.getName())
			.withReferenceStrain(referenceStrain)
			.withSource_id(_fake_strainSourceId)
			.withWildtype(wildtype)
			.push();		
		
		// 06/18/2014: Decided to change source id to key used for registering by ID service
		//String _fake_sampleSourceId = eSample.getId();		
		String[] vals = eSample.getSourceId().split("___");
		String _fake_sampleSourceId = (vals.length > 1) ? vals[0] : eSample.getId();
		String _fake_externalSourceId = (vals.length > 1) ? vals[1] : eSample.getSourceId();
		
		bundle.csSample
			.withCustom(custom)
			.withDataQualityLevel(eSample.getDataQualityLevel() != null ? eSample.getDataQualityLevel().intValue() : 0)
			.withDataSource(eSample.getDataSource())
			.withDescription(eSample.getDescription())
			.withExternalSourceDate( toSQLDate(eSample.getExternalSourceDate()) )
			.withExternalSourceId(_fake_externalSourceId)
			.withId(eSample.getId())
			.withKbaseSubmissionDate(submissionDate)
			.withMolecule(eSample.getMolecule())
			//Jul 9, 2014: Jason asked to use null, but not 0
			//.withOriginalLog2Median(eSample.getOriginalMedian() != null ? eSample.getOriginalMedian().floatValue() : 0)
			.withOriginalLog2Median(eSample.getOriginalMedian() != null ? eSample.getOriginalMedian().floatValue() : null)
			.withSource_id(_fake_sampleSourceId)
			.withTitle(eSample.getTitle())
			.withType(eSample.getType())
			.withShock_url(eSample.getShockUrl())
			.withProcessing_comments(eSample.getProcessingComments())
			.withNumerical_interpretation(eSample.getNumericalInterpretation())
			.withCharacteristics(eSample.getCharacteristics())
			.push();
		
		
		// Populate GenomeParentOf table
		bundle.csGenomeParentOf
			.withFrom_link(eStrain.getGenomeId())
			.withTo_link(strainKBaseId)
			.push();
		
		// We want to add record only if eSample.getPlatformId() is not empty
		if(eSample.getPlatformId() != null && !eSample.getPlatformId().trim().isEmpty())
		{			
			bundle.csPlatformWithSamples
			.withFrom_link(eSample.getPlatformId())
			.withTo_link(eSample.getId())
			.push();		
		}
		
		bundle.scStrainWithSample
			.withFrom_link(strainKBaseId)
			.withTo_link(eSample.getId())
			.push();
			
		if(eSample.getDefaultControlSample() != null)
		bundle.csDefaultControlSample
			.withFrom_link(eSample.getDefaultControlSample())
			.withTo_link(eSample.getId())
			.push();
		
		String measurementDescriptionExtId = toMeasurementDescriptionId(eSample);
		Hashtable<String, String> mdId2KbaseIdHash = mapIds(PREFIX_MEASUREMENT_DESCRIPTION_ID, Arrays.asList(measurementDescriptionExtId));		
		String measurementDescriptionKBaseId = mdId2KbaseIdHash.get(measurementDescriptionExtId);
		
		// 06/18/2014: Decided to change source id to key used for registering by ID service
		//String _fake_measurementDescriptionIdSourceId = measurementDescriptionKBaseId;
		String _fake_measurementDescriptionIdSourceId = measurementDescriptionExtId;
		
		bundle.csMeasurementDescription
			.withCategory(MEASUREMENT_DESCRIPTION_CATEGORY)
			.withDescription(eSample.getNumericalInterpretation())
			.withId(measurementDescriptionKBaseId)
			.withName(eSample.getNumericalInterpretation())
			.withSource_id(_fake_measurementDescriptionIdSourceId)
			.withUnitOfMeasure(MEASUREMENT_DESCRIPTION_UNIT_OF_MEASUREMENT)
			.push();
		
		
		long startMeasurentIndex = idService.allocateIdRange(PREFIX_MEASUREMENT_ID, (long) eSample.getExpressionLevels().entrySet().size());
		for(Entry<String,Double> expressionLevel: eSample.getExpressionLevels().entrySet()){
			
			String measurementKbaseId = KBASE_PREFIX + PREFIX_MEASUREMENT_ID + "." + (startMeasurentIndex++);
			String _fake_sourceId = measurementKbaseId;
			
			bundle.csMeasurement
				.withId(measurementKbaseId)
				.withMean(null)
				.withMedian(null)
				.withN(null)
				.withP_value(null)
				.withSource_id(_fake_sourceId)
				.withStddev(null)
				.withValue(expressionLevel.getValue() != null ? expressionLevel.getValue().floatValue() : 0)
				.withZ_score(null)
				.push();
			
			
			bundle.csSampleMeasurements
				.withFrom_link(eSample.getId())
				.withTo_link(measurementKbaseId)
				.push();
			
			bundle.csDescribesMeasurement
				.withFrom_link(measurementDescriptionKBaseId)
				.withTo_link(measurementKbaseId)
				.push();

			bundle.csFeatureMeasuredBy			
				.withFrom_link(expressionLevel.getKey())
				.withTo_link(measurementKbaseId)
				.push();
		}


		if(averagedFromSamples != null)
		for(String value :averagedFromSamples)
		{
			bundle.csSampleAveragedFrom
				.withFrom_link(value)
				.withTo_link(eSample.getId())
				.push();
		}

		List<ExpressionOntologyTerm> ontologyTers = eSample.getExpressionOntologyTerms();
		if(ontologyTers != null){
			
			List<String> sampleAnnotationExtIds = new ArrayList<String>();
			for(ExpressionOntologyTerm term: ontologyTers){
				sampleAnnotationExtIds.add(toSampleAnnotationId(eSample, term));
			}
			Hashtable<String, String> saId2KbaseIdHash = mapIds(PREFIX_SAMPLE_ANNOTATION_ID, sampleAnnotationExtIds);		
			
			for(ExpressionOntologyTerm term: ontologyTers){
				
				
				String sampleAnnotationExtId =  toSampleAnnotationId(eSample, term);
				String sampleAnnotationKBaseId = saId2KbaseIdHash.get(sampleAnnotationExtId);
				
				// 06/18/2014: Decided to change source id to key used for registering by ID service 
				// String _fake_sampleAnnotationSourceId = sampleAnnotationKBaseId;
				String _fake_sampleAnnotationSourceId = sampleAnnotationExtId;
				
				bundle.csSampleAnnotation
					.withAnnotationDate(toSQLDate(CURRENT_DATE))
					.withId(sampleAnnotationKBaseId)
					.withSource_id(_fake_sampleAnnotationSourceId)
					.push();

				
				bundle.csSampleHasAnnotations
					.withFrom_link(eSample.getId())
					.withTo_link(sampleAnnotationKBaseId)
					.push();
				
				bundle.csOntologyForSample
					.withFrom_link(term.getExpressionOntologyTermId())
					.withTo_link(sampleAnnotationKBaseId)
					.push();
			}
			
		}
		
		List<Person> persons = eSample.getPersons();
		if(persons != null){
			
			List<String> personExtIds = new ArrayList<String>();
			for(Person ePerson: persons){
				personExtIds.add(toPersonId(ePerson));
			}
			Hashtable<String, String> personId2KbaseIdHash = mapIds(PREFIX_PERSON_ID, personExtIds);		
			for(Person ePerson: persons){
				String personExtId = toPersonId(ePerson);
				String personKBaseId = personId2KbaseIdHash.get(personExtId);
				
				// 06/18/2014: Decided to change source id to key used for registering by ID service 
				// String _fake_personSourceId = personKBaseId;				
				String _fake_personSourceId = personExtId;
				
				bundle.csPerson
					.withContactEmail(ePerson.getEmail())
					.withFirstName(ePerson.getFirstName())
					.withId(personKBaseId)
					.withInstitution(ePerson.getInstitution())
					.withLastName(ePerson.getLastName())
					.withSource_id(_fake_personSourceId)
					.push();
				
				bundle.csSampleContactPerson
					.withFrom_link(eSample.getId())
					.withTo_link(personKBaseId)
					.push();
			}
		}

		Protocol eProtocol = eSample.getProtocol();
		if(eProtocol != null)
		{
			String protocolExtId = toProtocolId(eProtocol);
			Hashtable<String, String> protocolId2KbaseIdHash = mapIds(PREFIX_PROTOCOL_ID, Arrays.asList(protocolExtId));		
			String protocolKBaseId = protocolId2KbaseIdHash.get(protocolExtId);
			
			// 06/18/2014: Decided to change source id to key used for registering by ID service 				
			//String _fake_protocolSourceId = protocolKBaseId;
			String _fake_protocolSourceId = protocolExtId;
			
			bundle.csProtocol
				.withDescription(eProtocol.getDescription())
				.withId(protocolKBaseId)
				.withName(eProtocol.getName())
				.withSource_id(_fake_protocolSourceId)			
				.push();
			
			bundle.csProtocolForSample
				.withFrom_link(protocolKBaseId)
				.withTo_link(eSample.getId())
				.push();
		}
	}

	public void load(ExpressionBundle bundle, ExpressionSeries eSeries) throws Exception{

		// 06/18/2014: Decided to change source id to key used for registering by ID service 				
		//String _fake_seriesSourceId = eSeries.getId();
		String _fake_seriesSourceId = eSeries.getSourceId();
		
		
		Long submissionDate = toSQLDate(CURRENT_DATE);
		bundle.csSeries
			.withDesign(eSeries.getDesign())
			.withExternalSourceDate(toSQLDate(eSeries.getExternalSourceDate()))
			.withExternalSourceId(eSeries.getSourceId())
			.withId(eSeries.getId())
			.withKbaseSubmissionDate(submissionDate)
			.withSource_id(_fake_seriesSourceId)
			.withSummary(eSeries.getSummary())
			.withTitle(eSeries.getTitle())
			.push();
		
		for(List<String> sampleIds : eSeries.getGenomeExpressionSampleIdsMap().values()){
			for(String sampleId: sampleIds){
				bundle.csSampleInSeries
					.withFrom_link(sampleId)
					.withTo_link(eSeries.getId())
					.push();
			}
		}

		String pubmedId = eSeries.getPublicationId();
		if(pubmedId != null){
			bundle.csPublication
				.withId(pubmedId)
				.withLink("http://www.ncbi.nlm.nih.gov/pubmed/" + pubmedId)
				.withPubdate(null)
				.withTitle(null)
				.push();
			
			bundle.csSeriesPublishedIn
				.withFrom_link(eSeries.getId())
				.withTo_link(pubmedId)
				.push();			
		}		
	}
	
	
	public void load(ExpressionBundle bundle, ExpressionReplicateGroup eReplicateGroup) throws Exception{
		bundle.csReplicateGroup
			.withId(eReplicateGroup.getId())
			.push();
			
		List<String> sampleIds = eReplicateGroup.getExpressionSampleIds();
		if(sampleIds != null)
		for(String sampleId: sampleIds){
			bundle.csSamplesInReplicateGroup
				.withFrom_link(sampleId)
				.withTo_link(eReplicateGroup.getId())
				.push();			
		}
	}
	
	private Long toSQLDate(Date date) {
		return date.getTime()/1000;
	}
	
	
	private Long toSQLDate(String date) {
		Long sqlDate = null;
		try{
			sqlDate = DATE_FORMAT.parse(date).getTime()/1000;
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return sqlDate;
	}

	private String toStrainId(Strain strain, String genomeId){
		//genome_wildtype_reference_aggregate_name		
		return VER_ID_PREF
			+ "_" + genomeId 
			+ "_" + strain.getWildType() 
			+ "_" + strain.getReferenceStrain()
			+ "_" + AGGREGATED_DATA
			+ "_" + strain.getName();
	}
	
	private String toPersonId(Person person){
		//email_first_last_instit
		return VER_ID_PREF 
			+ "_" + person.getEmail()
			+ "_" + person.getFirstName()
			+ "_" + person.getLastName()
			+ "_" + person.getInstitution();
	}
	
	private String toProtocolId(Protocol protocol){
		//Description
		return VER_ID_PREF
			+ "_" + protocol.getDescription();
	}
	
	private String toSampleAnnotationId(ExpressionSample sample, ExpressionOntologyTerm term){
		//eSample.getId()_term.getExpressionOntologyTermId()
		return VER_ID_PREF
			+ "_" + sample.getId()
			+ "_" + term.getExpressionOntologyTermId();
	}

	private String toMeasurementDescriptionId(ExpressionSample sample){
		//category_description_name_unitOfMeasure
		return VER_ID_PREF
			+ "_" + MEASUREMENT_DESCRIPTION_CATEGORY 
//			+ "_" + sample.getDescription()
			+ "_" + sample.getNumericalInterpretation()
			+ "_" + MEASUREMENT_DESCRIPTION_UNIT_OF_MEASUREMENT;
	}
	
	
	private Hashtable<String, String> mapIds(String prefix, List<String> ids) throws IOException, JsonClientException{
		Hashtable<String, String> id2KbaseIdHash = new Hashtable<String, String>();
		
		for(String id: ids){
			id2KbaseIdHash.put(id, "");
		}
		
		generateIds(prefix, id2KbaseIdHash);		
		return id2KbaseIdHash;
	}

	
	private void generateIds(String prefix, Hashtable<String,String> id2kbaseIdHash) throws IOException, JsonClientException {	
		
		// See if we already created KBase ids for the same ext ids before. If yes, then use it.
		List<Entry<String, String>> unmappedIds = new ArrayList<Entry<String, String>>();		
		Map<String, String> mappedIds = idService.externalIdsToKbaseIds(GEO_RESOURCE,  Collections.list(id2kbaseIdHash.keys()));
		for(Entry<String, String> entry: id2kbaseIdHash.entrySet()){
			String kbaseId = mappedIds.get(entry.getKey());
			
			if(kbaseId != null){
				// unfortunatelly some ids have been registered with "kb|..." as a prefix..
				if(!kbaseId.startsWith(KBASE_PREFIX)) {
					kbaseId = KBASE_PREFIX + kbaseId;
				}				
				entry.setValue(kbaseId);
			}
			else {
				unmappedIds.add(entry);
			}			
		}

		// if there are unmapped ids, then: 1) allocate ids; 2) create kbase ids; 3) register allocated ids in ID server 		
		Hashtable<String,Long> generatedIds = new Hashtable<String,Long>(); 
		if(unmappedIds.size() > 0){
			long id = idService.allocateIdRange(prefix, (long) unmappedIds.size());
			for(Entry<String, String> entry: unmappedIds){
				generatedIds.put(entry.getKey(),id);
				entry.setValue(KBASE_PREFIX +  prefix + "." + id);
				id++;
			}
			idService.registerAllocatedIds(prefix, GEO_RESOURCE, generatedIds);
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
			scriptName = args[2];
		}		
		
		new ExpressionCSLoader().load();
	}

}

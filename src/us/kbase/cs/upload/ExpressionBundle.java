package us.kbase.cs.upload;

import us.kbase.cs.orm.DumperBundle;
import us.kbase.cs.orm.dumpers.DefaultControlSample;
import us.kbase.cs.orm.dumpers.DescribesMeasurement;
import us.kbase.cs.orm.dumpers.FeatureMeasuredBy;
import us.kbase.cs.orm.dumpers.GenomeParentOf;
import us.kbase.cs.orm.dumpers.Measurement;
import us.kbase.cs.orm.dumpers.MeasurementDescription;
import us.kbase.cs.orm.dumpers.OntologyForSample;
import us.kbase.cs.orm.dumpers.Person;
import us.kbase.cs.orm.dumpers.Platform;
import us.kbase.cs.orm.dumpers.PlatformWithSamples;
import us.kbase.cs.orm.dumpers.Protocol;
import us.kbase.cs.orm.dumpers.ProtocolForSample;
import us.kbase.cs.orm.dumpers.Publication;
import us.kbase.cs.orm.dumpers.ReplicateGroup;
import us.kbase.cs.orm.dumpers.Sample;
import us.kbase.cs.orm.dumpers.SampleAnnotation;
import us.kbase.cs.orm.dumpers.SampleAveragedFrom;
import us.kbase.cs.orm.dumpers.SampleContactPerson;
import us.kbase.cs.orm.dumpers.SampleHasAnnotations;
import us.kbase.cs.orm.dumpers.SampleInSeries;
import us.kbase.cs.orm.dumpers.SampleMeasurements;
import us.kbase.cs.orm.dumpers.SamplesInReplicateGroup;
import us.kbase.cs.orm.dumpers.Series;
import us.kbase.cs.orm.dumpers.SeriesPublishedIn;
import us.kbase.cs.orm.dumpers.Strain;
import us.kbase.cs.orm.dumpers.StrainWithPlatforms;
import us.kbase.cs.orm.dumpers.StrainWithSample;

/**
 * Bundle of dumpers for expression related WS object
 * 
 * @author Pavel Novichkov <psnovichkov@lbl.gov>
 * @version 1.0
 */
public class ExpressionBundle implements DumperBundle{
	
	// To load platforms	
	Strain csStrain; // +
	GenomeParentOf csGenomeParentOf; //+
	Platform csPlatform; //+  
	StrainWithPlatforms csStrainWithPlatforms; //+
	
	// To load samples
	// Strain csStrain; //+
	Sample csSample; //+
	PlatformWithSamples csPlatformWithSamples;
	StrainWithSample scStrainWithSample;
	DefaultControlSample csDefaultControlSample;
	
	SampleMeasurements csSampleMeasurements;
	Measurement csMeasurement;
	DescribesMeasurement csDescribesMeasurement;
	MeasurementDescription csMeasurementDescription;
	FeatureMeasuredBy csFeatureMeasuredBy;
	SampleAveragedFrom csSampleAveragedFrom;
	SampleHasAnnotations csSampleHasAnnotations;
	SampleAnnotation csSampleAnnotation;
	OntologyForSample csOntologyForSample;
	
	SampleContactPerson csSampleContactPerson;
	Person csPerson;

	ProtocolForSample csProtocolForSample;
	Protocol csProtocol;
	
	// To load series 
	SampleInSeries csSampleInSeries;
	Series csSeries;
	SeriesPublishedIn csSeriesPublishedIn;
	Publication csPublication;
	
	//To load replicate groups
	ReplicateGroup csReplicateGroup;
	SamplesInReplicateGroup csSamplesInReplicateGroup;
}

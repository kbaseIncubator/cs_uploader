package us.kbase.cs.upload;

import us.kbase.cs.orm.DumperBundle;
import us.kbase.cs.orm.dumpers.Association;
import us.kbase.cs.orm.dumpers.AssociationDataset;
import us.kbase.cs.orm.dumpers.AssociationDetectionType;
import us.kbase.cs.orm.dumpers.AssociationFeature;
import us.kbase.cs.orm.dumpers.DetectedWithMethod;
import us.kbase.cs.orm.dumpers.IsDatasetFor;
import us.kbase.cs.orm.dumpers.IsGroupingOf;
import us.kbase.cs.orm.dumpers.IsSourceForAssociationDataset;
import us.kbase.cs.orm.dumpers.Publication;
import us.kbase.cs.orm.dumpers.PublishedAssociation;
import us.kbase.cs.orm.dumpers.Source;

/**
 * Bundle of dumpers for the Network WS object  
 * 
 * @author Pavel Novichkov <psnovichkov@lbl.gov>
 * @version 1.0
 */

public class NetworkBundle implements DumperBundle{

	// Networks region of KSaplingDBD.xml
	
	AssociationDetectionType scAssociationDetectionType;
	DetectedWithMethod scDetectedWithMethod;
	Association scAssociation;
	AssociationFeature scAssociationFeature;
	IsGroupingOf scIsGroupingOf;
	PublishedAssociation scPublishedAssociation;
	Publication scPublication;
	AssociationDataset scAssociationDataset;
	IsDatasetFor scIsDatasetFor;
	IsSourceForAssociationDataset scIsSourceForAssociationDataset;
	Source scSource;	
	
}

# cs_uploader
Enables object relational mapping for CS schema. Provides data uploaders from WS objects to CS tables

## Introduction
Central Store (CS) schema is described in KSaplingDBD.xml file. The repository provides a compiler that parses this schema 
and creates a library of “Dumpers” (one dumper per each MySQL table), a collection Java classes providing object-relational 
mapping.   

A particular dumper allows exporting data into CSV file that can be then uploaded into a corresponding table 
in Central Store using the standard mysqlimport program. Dumper guarantees that the format of the data will be correct.
At the same time, mysqlimport can be tuned to achieve the desired results of import (e.g. avoid duplicated records).


The library of dumpers allows to:
1. Define a set of tables to work with (a bundle). For instance, more than 20 MySQL tables are used to store expression object. 
2. Export all data into a predefined set of CSV files (defined by the bundle) 
3. Generate an uploader shell script that can be used to upload data into CS


## Example

### Bundle of dumpers

Bundle of dumpers for uploading Network object:
```Java
public class NetworkBundle implements DumperBundle{
	
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
```

### Usage of dumpers to prepare CSV files

Now, we can use the bundle of dumpers to export actual data. For instance, NetworksCSLoader was developed for networks objects.  
The central “load” method in the NetworksCSLoader class:

```Java
	public void load() throws Exception{		

    Dumper.setTargetDirectory(targetDirectory);
  
    NetworkBundle bundle = new NetworkBundle();		
		Dumper.init(bundle);
		
		load(bundle);
		
		Dumper.close(bundle);
		Dumper.createImportScript(bundle, scriptName);
	};
```
	
Example of working with a dumper to export one row (AssociationDataset table)

```Java
	bundle.scAssociationDataset
			.withAssociation_type(dataset.getNetworkType())
			.withData_source(dataset.getSourceRef())
			.withDescription(dataset.getDescription())
			.withId(dataset.getId())
			.withUrl(associationDatasetUrl)
			.push();

```

As a result, we will have 11 CSV files (number of dumpers in the NetworkBundle) and automatically generated shell script to upload data into MySQL.

###Uploader script

Example of the automatically gernated uploder script:

mysqlimport --local --ignore --compress --ignore-lines=1 --fields-optionally-enclosed-by='"' --fields-terminated-by=',' --lines-terminated-by='\n'  --columns=id,description $@   AssociationDetectionType.csv  
mysqlimport --local --ignore --compress --ignore-lines=1 --fields-optionally-enclosed-by='"' --fields-terminated-by=',' --lines-terminated-by='\n'  --columns=from_link,to_link $@   DetectedWithMethod.csv  
mysqlimport --local --ignore --compress --ignore-lines=1 --fields-optionally-enclosed-by='"' --fields-terminated-by=',' --lines-terminated-by='\n'  --columns=id,name,description,directional,confidence,url $@   Association.csv  
mysqlimport --local --ignore --compress --ignore-lines=1 --fields-optionally-enclosed-by='"' --fields-terminated-by=',' --lines-terminated-by='\n'  --columns=from_link,to_link,stoichiometry,strength,rank $@   AssociationFeature.csv  
mysqlimport --local --ignore --compress --ignore-lines=1 --fields-optionally-enclosed-by='"' --fields-terminated-by=',' --lines-terminated-by='\n'  --columns=from_link,to_link $@   IsGroupingOf.csv  
mysqlimport --local --ignore --compress --ignore-lines=1 --fields-optionally-enclosed-by='"' --fields-terminated-by=',' --lines-terminated-by='\n'  --columns=from_link,to_link $@   PublishedAssociation.csv  
mysqlimport --local --ignore --compress --ignore-lines=1 --fields-optionally-enclosed-by='"' --fields-terminated-by=',' --lines-terminated-by='\n'  --columns=id,title,link,pubdate $@   Publication.csv  
mysqlimport --local --ignore --compress --ignore-lines=1 --fields-optionally-enclosed-by='"' --fields-terminated-by=',' --lines-terminated-by='\n'  --columns=id,description,data_source,url,association_type $@   AssociationDataset.csv  
mysqlimport --local --ignore --compress --ignore-lines=1 --fields-optionally-enclosed-by='"' --fields-terminated-by=',' --lines-terminated-by='\n'  --columns=from_link,to_link $@   IsDatasetFor.csv  
mysqlimport --local --ignore --compress --ignore-lines=1 --fields-optionally-enclosed-by='"' --fields-terminated-by=',' --lines-terminated-by='\n'  --columns=from_link,to_link $@   IsSourceForAssociationDataset.csv  
mysqlimport --local --ignore --compress --ignore-lines=1 --fields-optionally-enclosed-by='"' --fields-terminated-by=',' --lines-terminated-by='\n'  --columns=id,name,url,description $@   Source.csv  


Finally, when you run this script, mysqlimport gives you statics of the import.

For instance:

kbase_sapling_v3_dev.AssociationDetectionType: Records: 0  Deleted: 0  Skipped: 0  Warnings: 0  
kbase_sapling_v3_dev.DetectedWithMethod: Records: 0  Deleted: 0  Skipped: 0  Warnings: 0  
kbase_sapling_v3_dev.Association: Records: 51099299  Deleted: 0  Skipped: 3113  Warnings: 3113  
kbase_sapling_v3_dev.AssociationFeature: Records: 102306492  Deleted: 0  Skipped: 0  Warnings: 0  
kbase_sapling_v3_dev.IsGroupingOf: Records: 51099299  Deleted: 0  Skipped: 3113  Warnings: 3113  
kbase_sapling_v3_dev.PublishedAssociation: Records: 0  Deleted: 0  Skipped: 0  Warnings: 0  
kbase_sapling_v3_dev.Publication: Records: 0  Deleted: 0  Skipped: 0  Warnings: 0  
kbase_sapling_v3_dev.AssociationDataset: Records: 254  Deleted: 0  Skipped: 0  Warnings: 0  
kbase_sapling_v3_dev.IsDatasetFor: Records: 254  Deleted: 0  Skipped: 0  Warnings: 0  
kbase_sapling_v3_dev.IsSourceForAssociationDataset: Records: 254  Deleted: 0  Skipped: 0  Warnings: 0  
kbase_sapling_v3_dev.Source: Records: 254  Deleted: 0  Skipped: 254  Warnings: 254  

## Advantages of using this approach

*  If CS schema is changed, you can easily rebuild the dumpers, and if there is any inconsistency between your previous code for the data export and the new schema, the Java compiler will tell you about it.
*  Using dumpers, the implementation of CS uploaders is extremely fast and easy
*  You have full control on the upload process (via generated script). You can explicitly see which tables will be affected, and you can tune the import process.
*  The upload itself works fast

package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class AssociationDataset extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="description", type=ColumnType.STRING)		
    private String description;									

    @Column(name="data_source", type=ColumnType.STRING)		
    private String dataSource;									

    @Column(name="url", type=ColumnType.STRING)		
    private String url;									

    @Column(name="association_type", type=ColumnType.STRING)		
    private String associationType;									

    private AssociationDataset() throws IOException{		
        super();							
    }										

    public static AssociationDataset newDumper() throws IOException{	
        return new AssociationDataset();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public AssociationDataset withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public String getDescription() {		
        return description;				
    }							

    public void setDescription(String description) {		
        this.description = description;				
    }								

    public AssociationDataset withDescription(String description) {				
        this.description = description;						
        return this;						
    }										

    public String getData_source() {		
        return dataSource;				
    }							

    public void setData_source(String dataSource) {		
        this.dataSource = dataSource;				
    }								

    public AssociationDataset withData_source(String dataSource) {				
        this.dataSource = dataSource;						
        return this;						
    }										

    public String getUrl() {		
        return url;				
    }							

    public void setUrl(String url) {		
        this.url = url;				
    }								

    public AssociationDataset withUrl(String url) {				
        this.url = url;						
        return this;						
    }										

    public String getAssociation_type() {		
        return associationType;				
    }							

    public void setAssociation_type(String associationType) {		
        this.associationType = associationType;				
    }								

    public AssociationDataset withAssociation_type(String associationType) {				
        this.associationType = associationType;						
        return this;						
    }										

}

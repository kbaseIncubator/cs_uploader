package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class Assay extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="source_id", type=ColumnType.STRING)		
    private String sourceId;									

    @Column(name="assay_type", type=ColumnType.STRING)		
    private String assayType;									

    @Column(name="assay_type_id", type=ColumnType.STRING)		
    private String assayTypeId;									

    private Assay() throws IOException{		
        super();							
    }										

    public static Assay newDumper() throws IOException{	
        return new Assay();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public Assay withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public String getSource_id() {		
        return sourceId;				
    }							

    public void setSource_id(String sourceId) {		
        this.sourceId = sourceId;				
    }								

    public Assay withSource_id(String sourceId) {				
        this.sourceId = sourceId;						
        return this;						
    }										

    public String getAssay_type() {		
        return assayType;				
    }							

    public void setAssay_type(String assayType) {		
        this.assayType = assayType;				
    }								

    public Assay withAssay_type(String assayType) {				
        this.assayType = assayType;						
        return this;						
    }										

    public String getAssay_type_id() {		
        return assayTypeId;				
    }							

    public void setAssay_type_id(String assayTypeId) {		
        this.assayTypeId = assayTypeId;				
    }								

    public Assay withAssay_type_id(String assayTypeId) {				
        this.assayTypeId = assayTypeId;						
        return this;						
    }										

}

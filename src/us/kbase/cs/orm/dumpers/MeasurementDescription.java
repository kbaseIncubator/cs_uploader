package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class MeasurementDescription extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="name", type=ColumnType.STRING)		
    private String name;									

    @Column(name="description", type=ColumnType.TEXT)		
    private String description;									

    @Column(name="unitOfMeasure", type=ColumnType.STRING)		
    private String unitOfMeasure;									

    @Column(name="category", type=ColumnType.STRING)		
    private String category;									

    @Column(name="source_id", type=ColumnType.STRING)		
    private String sourceId;									

    private MeasurementDescription() throws IOException{		
        super();							
    }										

    public static MeasurementDescription newDumper() throws IOException{	
        return new MeasurementDescription();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public MeasurementDescription withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public String getName() {		
        return name;				
    }							

    public void setName(String name) {		
        this.name = name;				
    }								

    public MeasurementDescription withName(String name) {				
        this.name = name;						
        return this;						
    }										

    public String getDescription() {		
        return description;				
    }							

    public void setDescription(String description) {		
        this.description = description;				
    }								

    public MeasurementDescription withDescription(String description) {				
        this.description = description;						
        return this;						
    }										

    public String getUnitOfMeasure() {		
        return unitOfMeasure;				
    }							

    public void setUnitOfMeasure(String unitOfMeasure) {		
        this.unitOfMeasure = unitOfMeasure;				
    }								

    public MeasurementDescription withUnitOfMeasure(String unitOfMeasure) {				
        this.unitOfMeasure = unitOfMeasure;						
        return this;						
    }										

    public String getCategory() {		
        return category;				
    }							

    public void setCategory(String category) {		
        this.category = category;				
    }								

    public MeasurementDescription withCategory(String category) {				
        this.category = category;						
        return this;						
    }										

    public String getSource_id() {		
        return sourceId;				
    }							

    public void setSource_id(String sourceId) {		
        this.sourceId = sourceId;				
    }								

    public MeasurementDescription withSource_id(String sourceId) {				
        this.sourceId = sourceId;						
        return this;						
    }										

}

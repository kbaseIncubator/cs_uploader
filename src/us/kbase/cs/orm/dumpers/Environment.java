package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class Environment extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="temperature", type=ColumnType.FLOAT)		
    private Float temperature;									

    @Column(name="description", type=ColumnType.STRING)		
    private String description;									

    @Column(name="oxygenConcentration", type=ColumnType.FLOAT)		
    private Float oxygenConcentration;									

    @Column(name="pH", type=ColumnType.FLOAT)		
    private Float pH;									

    @Column(name="source_id", type=ColumnType.STRING)		
    private String sourceId;									

    private Environment() throws IOException{		
        super();							
    }										

    public static Environment newDumper() throws IOException{	
        return new Environment();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public Environment withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public Float getTemperature() {		
        return temperature;				
    }							

    public void setTemperature(Float temperature) {		
        this.temperature = temperature;				
    }								

    public Environment withTemperature(Float temperature) {				
        this.temperature = temperature;						
        return this;						
    }										

    public String getDescription() {		
        return description;				
    }							

    public void setDescription(String description) {		
        this.description = description;				
    }								

    public Environment withDescription(String description) {				
        this.description = description;						
        return this;						
    }										

    public Float getOxygenConcentration() {		
        return oxygenConcentration;				
    }							

    public void setOxygenConcentration(Float oxygenConcentration) {		
        this.oxygenConcentration = oxygenConcentration;				
    }								

    public Environment withOxygenConcentration(Float oxygenConcentration) {				
        this.oxygenConcentration = oxygenConcentration;						
        return this;						
    }										

    public Float getPH() {		
        return pH;				
    }							

    public void setPH(Float pH) {		
        this.pH = pH;				
    }								

    public Environment withPH(Float pH) {				
        this.pH = pH;						
        return this;						
    }										

    public String getSource_id() {		
        return sourceId;				
    }							

    public void setSource_id(String sourceId) {		
        this.sourceId = sourceId;				
    }								

    public Environment withSource_id(String sourceId) {				
        this.sourceId = sourceId;						
        return this;						
    }										

}

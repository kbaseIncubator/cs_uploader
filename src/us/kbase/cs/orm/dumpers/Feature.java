package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class Feature extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="feature_type", type=ColumnType.STRING)		
    private String featureType;									

    @Column(name="source_id", type=ColumnType.STRING)		
    private String sourceId;									

    @Column(name="sequence_length", type=ColumnType.COUNTER)		
    private Long sequenceLength;									

    @Column(name="function", type=ColumnType.TEXT)		
    private String function;									

    @Column(name="alias", type=ColumnType.STRING)		
    private String alias;									

    private Feature() throws IOException{		
        super();							
    }										

    public static Feature newDumper() throws IOException{	
        return new Feature();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public Feature withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public String getFeature_type() {		
        return featureType;				
    }							

    public void setFeature_type(String featureType) {		
        this.featureType = featureType;				
    }								

    public Feature withFeature_type(String featureType) {				
        this.featureType = featureType;						
        return this;						
    }										

    public String getSource_id() {		
        return sourceId;				
    }							

    public void setSource_id(String sourceId) {		
        this.sourceId = sourceId;				
    }								

    public Feature withSource_id(String sourceId) {				
        this.sourceId = sourceId;						
        return this;						
    }										

    public Long getSequence_length() {		
        return sequenceLength;				
    }							

    public void setSequence_length(Long sequenceLength) {		
        this.sequenceLength = sequenceLength;				
    }								

    public Feature withSequence_length(Long sequenceLength) {				
        this.sequenceLength = sequenceLength;						
        return this;						
    }										

    public String getFunction() {		
        return function;				
    }							

    public void setFunction(String function) {		
        this.function = function;				
    }								

    public Feature withFunction(String function) {				
        this.function = function;						
        return this;						
    }										

    public String getAlias() {		
        return alias;				
    }							

    public void setAlias(String alias) {		
        this.alias = alias;				
    }								

    public Feature withAlias(String alias) {				
        this.alias = alias;						
        return this;						
    }										

}

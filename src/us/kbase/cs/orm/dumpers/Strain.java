package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class Strain extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="name", type=ColumnType.STRING)		
    private String name;									

    @Column(name="description", type=ColumnType.STRING)		
    private String description;									

    @Column(name="source_id", type=ColumnType.STRING)		
    private String sourceId;									

    @Column(name="aggregateData", type=ColumnType.SEMI_BOOLEAN)		
    private Character aggregateData;									

    @Column(name="wildtype", type=ColumnType.SEMI_BOOLEAN)		
    private Character wildtype;									

    @Column(name="referenceStrain", type=ColumnType.SEMI_BOOLEAN)		
    private Character referenceStrain;									

    private Strain() throws IOException{		
        super();							
    }										

    public static Strain newDumper() throws IOException{	
        return new Strain();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public Strain withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public String getName() {		
        return name;				
    }							

    public void setName(String name) {		
        this.name = name;				
    }								

    public Strain withName(String name) {				
        this.name = name;						
        return this;						
    }										

    public String getDescription() {		
        return description;				
    }							

    public void setDescription(String description) {		
        this.description = description;				
    }								

    public Strain withDescription(String description) {				
        this.description = description;						
        return this;						
    }										

    public String getSource_id() {		
        return sourceId;				
    }							

    public void setSource_id(String sourceId) {		
        this.sourceId = sourceId;				
    }								

    public Strain withSource_id(String sourceId) {				
        this.sourceId = sourceId;						
        return this;						
    }										

    public Character getAggregateData() {		
        return aggregateData;				
    }							

    public void setAggregateData(Character aggregateData) {		
        this.aggregateData = aggregateData;				
    }								

    public Strain withAggregateData(Character aggregateData) {				
        this.aggregateData = aggregateData;						
        return this;						
    }										

    public Character getWildtype() {		
        return wildtype;				
    }							

    public void setWildtype(Character wildtype) {		
        this.wildtype = wildtype;				
    }								

    public Strain withWildtype(Character wildtype) {				
        this.wildtype = wildtype;						
        return this;						
    }										

    public Character getReferenceStrain() {		
        return referenceStrain;				
    }							

    public void setReferenceStrain(Character referenceStrain) {		
        this.referenceStrain = referenceStrain;				
    }								

    public Strain withReferenceStrain(Character referenceStrain) {				
        this.referenceStrain = referenceStrain;						
        return this;						
    }										

}

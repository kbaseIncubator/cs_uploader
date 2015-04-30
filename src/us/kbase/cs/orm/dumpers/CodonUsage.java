package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class CodonUsage extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="frequencies", type=ColumnType.LONG_STRING)		
    private String frequencies;									

    @Column(name="genetic_code", type=ColumnType.INT)		
    private Integer geneticCode;									

    @Column(name="type", type=ColumnType.STRING)		
    private String type;									

    @Column(name="subtype", type=ColumnType.STRING)		
    private String subtype;									

    private CodonUsage() throws IOException{		
        super();							
    }										

    public static CodonUsage newDumper() throws IOException{	
        return new CodonUsage();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public CodonUsage withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public String getFrequencies() {		
        return frequencies;				
    }							

    public void setFrequencies(String frequencies) {		
        this.frequencies = frequencies;				
    }								

    public CodonUsage withFrequencies(String frequencies) {				
        this.frequencies = frequencies;						
        return this;						
    }										

    public Integer getGenetic_code() {		
        return geneticCode;				
    }							

    public void setGenetic_code(Integer geneticCode) {		
        this.geneticCode = geneticCode;				
    }								

    public CodonUsage withGenetic_code(Integer geneticCode) {				
        this.geneticCode = geneticCode;						
        return this;						
    }										

    public String getType() {		
        return type;				
    }							

    public void setType(String type) {		
        this.type = type;				
    }								

    public CodonUsage withType(String type) {				
        this.type = type;						
        return this;						
    }										

    public String getSubtype() {		
        return subtype;				
    }							

    public void setSubtype(String subtype) {		
        this.subtype = subtype;				
    }								

    public CodonUsage withSubtype(String subtype) {				
        this.subtype = subtype;						
        return this;						
    }										

}

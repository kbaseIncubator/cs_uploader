package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class Compound extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="label", type=ColumnType.STRING)		
    private String label;									

    @Column(name="abbr", type=ColumnType.STRING)		
    private String abbr;									

    @Column(name="source_id", type=ColumnType.STRING)		
    private String sourceId;									

    @Column(name="ubiquitous", type=ColumnType.BOOLEAN)		
    private Byte ubiquitous;									

    @Column(name="mod_date", type=ColumnType.DATE)		
    private Long modDate;									

    @Column(name="mass", type=ColumnType.FLOAT)		
    private Float mass;									

    @Column(name="formula", type=ColumnType.STRING)		
    private String formula;									

    @Column(name="charge", type=ColumnType.FLOAT)		
    private Float charge;									

    @Column(name="deltaG", type=ColumnType.FLOAT)		
    private Float deltaG;									

    @Column(name="deltaG_error", type=ColumnType.FLOAT)		
    private Float deltaGError;									

    private Compound() throws IOException{		
        super();							
    }										

    public static Compound newDumper() throws IOException{	
        return new Compound();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public Compound withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public String getLabel() {		
        return label;				
    }							

    public void setLabel(String label) {		
        this.label = label;				
    }								

    public Compound withLabel(String label) {				
        this.label = label;						
        return this;						
    }										

    public String getAbbr() {		
        return abbr;				
    }							

    public void setAbbr(String abbr) {		
        this.abbr = abbr;				
    }								

    public Compound withAbbr(String abbr) {				
        this.abbr = abbr;						
        return this;						
    }										

    public String getSource_id() {		
        return sourceId;				
    }							

    public void setSource_id(String sourceId) {		
        this.sourceId = sourceId;				
    }								

    public Compound withSource_id(String sourceId) {				
        this.sourceId = sourceId;						
        return this;						
    }										

    public Byte getUbiquitous() {		
        return ubiquitous;				
    }							

    public void setUbiquitous(Byte ubiquitous) {		
        this.ubiquitous = ubiquitous;				
    }								

    public Compound withUbiquitous(Byte ubiquitous) {				
        this.ubiquitous = ubiquitous;						
        return this;						
    }										

    public Long getMod_date() {		
        return modDate;				
    }							

    public void setMod_date(Long modDate) {		
        this.modDate = modDate;				
    }								

    public Compound withMod_date(Long modDate) {				
        this.modDate = modDate;						
        return this;						
    }										

    public Float getMass() {		
        return mass;				
    }							

    public void setMass(Float mass) {		
        this.mass = mass;				
    }								

    public Compound withMass(Float mass) {				
        this.mass = mass;						
        return this;						
    }										

    public String getFormula() {		
        return formula;				
    }							

    public void setFormula(String formula) {		
        this.formula = formula;				
    }								

    public Compound withFormula(String formula) {				
        this.formula = formula;						
        return this;						
    }										

    public Float getCharge() {		
        return charge;				
    }							

    public void setCharge(Float charge) {		
        this.charge = charge;				
    }								

    public Compound withCharge(Float charge) {				
        this.charge = charge;						
        return this;						
    }										

    public Float getDeltaG() {		
        return deltaG;				
    }							

    public void setDeltaG(Float deltaG) {		
        this.deltaG = deltaG;				
    }								

    public Compound withDeltaG(Float deltaG) {				
        this.deltaG = deltaG;						
        return this;						
    }										

    public Float getDeltaG_error() {		
        return deltaGError;				
    }							

    public void setDeltaG_error(Float deltaGError) {		
        this.deltaGError = deltaGError;				
    }								

    public Compound withDeltaG_error(Float deltaGError) {				
        this.deltaGError = deltaGError;						
        return this;						
    }										

}

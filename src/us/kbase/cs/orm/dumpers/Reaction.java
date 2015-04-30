package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class Reaction extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="mod_date", type=ColumnType.DATE)		
    private Long modDate;									

    @Column(name="name", type=ColumnType.STRING)		
    private String name;									

    @Column(name="source_id", type=ColumnType.STRING)		
    private String sourceId;									

    @Column(name="abbr", type=ColumnType.STRING)		
    private String abbr;									

    @Column(name="direction", type=ColumnType.CHAR)		
    private Character direction;									

    @Column(name="deltaG", type=ColumnType.FLOAT)		
    private Float deltaG;									

    @Column(name="deltaG_error", type=ColumnType.FLOAT)		
    private Float deltaGError;									

    @Column(name="thermodynamic_reversibility", type=ColumnType.STRING)		
    private String thermodynamicReversibility;									

    @Column(name="default_protons", type=ColumnType.FLOAT)		
    private Float defaultProtons;									

    @Column(name="status", type=ColumnType.STRING)		
    private String status;									

    private Reaction() throws IOException{		
        super();							
    }										

    public static Reaction newDumper() throws IOException{	
        return new Reaction();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public Reaction withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public Long getMod_date() {		
        return modDate;				
    }							

    public void setMod_date(Long modDate) {		
        this.modDate = modDate;				
    }								

    public Reaction withMod_date(Long modDate) {				
        this.modDate = modDate;						
        return this;						
    }										

    public String getName() {		
        return name;				
    }							

    public void setName(String name) {		
        this.name = name;				
    }								

    public Reaction withName(String name) {				
        this.name = name;						
        return this;						
    }										

    public String getSource_id() {		
        return sourceId;				
    }							

    public void setSource_id(String sourceId) {		
        this.sourceId = sourceId;				
    }								

    public Reaction withSource_id(String sourceId) {				
        this.sourceId = sourceId;						
        return this;						
    }										

    public String getAbbr() {		
        return abbr;				
    }							

    public void setAbbr(String abbr) {		
        this.abbr = abbr;				
    }								

    public Reaction withAbbr(String abbr) {				
        this.abbr = abbr;						
        return this;						
    }										

    public Character getDirection() {		
        return direction;				
    }							

    public void setDirection(Character direction) {		
        this.direction = direction;				
    }								

    public Reaction withDirection(Character direction) {				
        this.direction = direction;						
        return this;						
    }										

    public Float getDeltaG() {		
        return deltaG;				
    }							

    public void setDeltaG(Float deltaG) {		
        this.deltaG = deltaG;				
    }								

    public Reaction withDeltaG(Float deltaG) {				
        this.deltaG = deltaG;						
        return this;						
    }										

    public Float getDeltaG_error() {		
        return deltaGError;				
    }							

    public void setDeltaG_error(Float deltaGError) {		
        this.deltaGError = deltaGError;				
    }								

    public Reaction withDeltaG_error(Float deltaGError) {				
        this.deltaGError = deltaGError;						
        return this;						
    }										

    public String getThermodynamic_reversibility() {		
        return thermodynamicReversibility;				
    }							

    public void setThermodynamic_reversibility(String thermodynamicReversibility) {		
        this.thermodynamicReversibility = thermodynamicReversibility;				
    }								

    public Reaction withThermodynamic_reversibility(String thermodynamicReversibility) {				
        this.thermodynamicReversibility = thermodynamicReversibility;						
        return this;						
    }										

    public Float getDefault_protons() {		
        return defaultProtons;				
    }							

    public void setDefault_protons(Float defaultProtons) {		
        this.defaultProtons = defaultProtons;				
    }								

    public Reaction withDefault_protons(Float defaultProtons) {				
        this.defaultProtons = defaultProtons;						
        return this;						
    }										

    public String getStatus() {		
        return status;				
    }							

    public void setStatus(String status) {		
        this.status = status;				
    }								

    public Reaction withStatus(String status) {				
        this.status = status;						
        return this;						
    }										

}

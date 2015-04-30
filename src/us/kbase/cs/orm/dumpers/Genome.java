package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class Genome extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="pegs", type=ColumnType.INT)		
    private Integer pegs;									

    @Column(name="rnas", type=ColumnType.INT)		
    private Integer rnas;									

    @Column(name="scientific_name", type=ColumnType.STRING)		
    private String scientificName;									

    @Column(name="complete", type=ColumnType.BOOLEAN)		
    private Byte complete;									

    @Column(name="prokaryotic", type=ColumnType.BOOLEAN)		
    private Byte prokaryotic;									

    @Column(name="dna_size", type=ColumnType.COUNTER)		
    private Long dnaSize;									

    @Column(name="contigs", type=ColumnType.INT)		
    private Integer contigs;									

    @Column(name="domain", type=ColumnType.STRING)		
    private String domain;									

    @Column(name="genetic_code", type=ColumnType.INT)		
    private Integer geneticCode;									

    @Column(name="gc_content", type=ColumnType.FLOAT)		
    private Float gcContent;									

    @Column(name="phenotype", type=ColumnType.STRING)		
    private String phenotype;									

    @Column(name="md5", type=ColumnType.STRING)		
    private String md5;									

    @Column(name="source_id", type=ColumnType.STRING)		
    private String sourceId;									

    private Genome() throws IOException{		
        super();							
    }										

    public static Genome newDumper() throws IOException{	
        return new Genome();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public Genome withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public Integer getPegs() {		
        return pegs;				
    }							

    public void setPegs(Integer pegs) {		
        this.pegs = pegs;				
    }								

    public Genome withPegs(Integer pegs) {				
        this.pegs = pegs;						
        return this;						
    }										

    public Integer getRnas() {		
        return rnas;				
    }							

    public void setRnas(Integer rnas) {		
        this.rnas = rnas;				
    }								

    public Genome withRnas(Integer rnas) {				
        this.rnas = rnas;						
        return this;						
    }										

    public String getScientific_name() {		
        return scientificName;				
    }							

    public void setScientific_name(String scientificName) {		
        this.scientificName = scientificName;				
    }								

    public Genome withScientific_name(String scientificName) {				
        this.scientificName = scientificName;						
        return this;						
    }										

    public Byte getComplete() {		
        return complete;				
    }							

    public void setComplete(Byte complete) {		
        this.complete = complete;				
    }								

    public Genome withComplete(Byte complete) {				
        this.complete = complete;						
        return this;						
    }										

    public Byte getProkaryotic() {		
        return prokaryotic;				
    }							

    public void setProkaryotic(Byte prokaryotic) {		
        this.prokaryotic = prokaryotic;				
    }								

    public Genome withProkaryotic(Byte prokaryotic) {				
        this.prokaryotic = prokaryotic;						
        return this;						
    }										

    public Long getDna_size() {		
        return dnaSize;				
    }							

    public void setDna_size(Long dnaSize) {		
        this.dnaSize = dnaSize;				
    }								

    public Genome withDna_size(Long dnaSize) {				
        this.dnaSize = dnaSize;						
        return this;						
    }										

    public Integer getContigs() {		
        return contigs;				
    }							

    public void setContigs(Integer contigs) {		
        this.contigs = contigs;				
    }								

    public Genome withContigs(Integer contigs) {				
        this.contigs = contigs;						
        return this;						
    }										

    public String getDomain() {		
        return domain;				
    }							

    public void setDomain(String domain) {		
        this.domain = domain;				
    }								

    public Genome withDomain(String domain) {				
        this.domain = domain;						
        return this;						
    }										

    public Integer getGenetic_code() {		
        return geneticCode;				
    }							

    public void setGenetic_code(Integer geneticCode) {		
        this.geneticCode = geneticCode;				
    }								

    public Genome withGenetic_code(Integer geneticCode) {				
        this.geneticCode = geneticCode;						
        return this;						
    }										

    public Float getGc_content() {		
        return gcContent;				
    }							

    public void setGc_content(Float gcContent) {		
        this.gcContent = gcContent;				
    }								

    public Genome withGc_content(Float gcContent) {				
        this.gcContent = gcContent;						
        return this;						
    }										

    public String getPhenotype() {		
        return phenotype;				
    }							

    public void setPhenotype(String phenotype) {		
        this.phenotype = phenotype;				
    }								

    public Genome withPhenotype(String phenotype) {				
        this.phenotype = phenotype;						
        return this;						
    }										

    public String getMd5() {		
        return md5;				
    }							

    public void setMd5(String md5) {		
        this.md5 = md5;				
    }								

    public Genome withMd5(String md5) {				
        this.md5 = md5;						
        return this;						
    }										

    public String getSource_id() {		
        return sourceId;				
    }							

    public void setSource_id(String sourceId) {		
        this.sourceId = sourceId;				
    }								

    public Genome withSource_id(String sourceId) {				
        this.sourceId = sourceId;						
        return this;						
    }										

}

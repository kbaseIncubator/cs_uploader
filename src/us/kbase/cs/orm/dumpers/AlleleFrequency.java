package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class AlleleFrequency extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="source_id", type=ColumnType.STRING)		
    private String sourceId;									

    @Column(name="position", type=ColumnType.INT)		
    private Integer position;									

    @Column(name="minor_AF", type=ColumnType.FLOAT)		
    private Float minorAF;									

    @Column(name="minor_allele", type=ColumnType.CHAR)		
    private Character minorAllele;									

    @Column(name="major_AF", type=ColumnType.FLOAT)		
    private Float majorAF;									

    @Column(name="major_allele", type=ColumnType.CHAR)		
    private Character majorAllele;									

    @Column(name="obs_unit_count", type=ColumnType.INT)		
    private Integer obsUnitCount;									

    private AlleleFrequency() throws IOException{		
        super();							
    }										

    public static AlleleFrequency newDumper() throws IOException{	
        return new AlleleFrequency();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public AlleleFrequency withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public String getSource_id() {		
        return sourceId;				
    }							

    public void setSource_id(String sourceId) {		
        this.sourceId = sourceId;				
    }								

    public AlleleFrequency withSource_id(String sourceId) {				
        this.sourceId = sourceId;						
        return this;						
    }										

    public Integer getPosition() {		
        return position;				
    }							

    public void setPosition(Integer position) {		
        this.position = position;				
    }								

    public AlleleFrequency withPosition(Integer position) {				
        this.position = position;						
        return this;						
    }										

    public Float getMinor_AF() {		
        return minorAF;				
    }							

    public void setMinor_AF(Float minorAF) {		
        this.minorAF = minorAF;				
    }								

    public AlleleFrequency withMinor_AF(Float minorAF) {				
        this.minorAF = minorAF;						
        return this;						
    }										

    public Character getMinor_allele() {		
        return minorAllele;				
    }							

    public void setMinor_allele(Character minorAllele) {		
        this.minorAllele = minorAllele;				
    }								

    public AlleleFrequency withMinor_allele(Character minorAllele) {				
        this.minorAllele = minorAllele;						
        return this;						
    }										

    public Float getMajor_AF() {		
        return majorAF;				
    }							

    public void setMajor_AF(Float majorAF) {		
        this.majorAF = majorAF;				
    }								

    public AlleleFrequency withMajor_AF(Float majorAF) {				
        this.majorAF = majorAF;						
        return this;						
    }										

    public Character getMajor_allele() {		
        return majorAllele;				
    }							

    public void setMajor_allele(Character majorAllele) {		
        this.majorAllele = majorAllele;				
    }								

    public AlleleFrequency withMajor_allele(Character majorAllele) {				
        this.majorAllele = majorAllele;						
        return this;						
    }										

    public Integer getObs_unit_count() {		
        return obsUnitCount;				
    }							

    public void setObs_unit_count(Integer obsUnitCount) {		
        this.obsUnitCount = obsUnitCount;				
    }								

    public AlleleFrequency withObs_unit_count(Integer obsUnitCount) {				
        this.obsUnitCount = obsUnitCount;						
        return this;						
    }										

}

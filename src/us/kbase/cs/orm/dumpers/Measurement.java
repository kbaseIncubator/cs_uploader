package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class Measurement extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="source_id", type=ColumnType.STRING)		
    private String sourceId;									

    @Column(name="value", type=ColumnType.FLOAT)		
    private Float value;									

    @Column(name="mean", type=ColumnType.FLOAT)		
    private Float mean;									

    @Column(name="median", type=ColumnType.FLOAT)		
    private Float median;									

    @Column(name="stddev", type=ColumnType.FLOAT)		
    private Float stddev;									

    @Column(name="N", type=ColumnType.INT)		
    private Integer N;									

    @Column(name="p_value", type=ColumnType.FLOAT)		
    private Float pValue;									

    @Column(name="Z_score", type=ColumnType.FLOAT)		
    private Float ZScore;									

    private Measurement() throws IOException{		
        super();							
    }										

    public static Measurement newDumper() throws IOException{	
        return new Measurement();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public Measurement withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public String getSource_id() {		
        return sourceId;				
    }							

    public void setSource_id(String sourceId) {		
        this.sourceId = sourceId;				
    }								

    public Measurement withSource_id(String sourceId) {				
        this.sourceId = sourceId;						
        return this;						
    }										

    public Float getValue() {		
        return value;				
    }							

    public void setValue(Float value) {		
        this.value = value;				
    }								

    public Measurement withValue(Float value) {				
        this.value = value;						
        return this;						
    }										

    public Float getMean() {		
        return mean;				
    }							

    public void setMean(Float mean) {		
        this.mean = mean;				
    }								

    public Measurement withMean(Float mean) {				
        this.mean = mean;						
        return this;						
    }										

    public Float getMedian() {		
        return median;				
    }							

    public void setMedian(Float median) {		
        this.median = median;				
    }								

    public Measurement withMedian(Float median) {				
        this.median = median;						
        return this;						
    }										

    public Float getStddev() {		
        return stddev;				
    }							

    public void setStddev(Float stddev) {		
        this.stddev = stddev;				
    }								

    public Measurement withStddev(Float stddev) {				
        this.stddev = stddev;						
        return this;						
    }										

    public Integer getN() {		
        return N;				
    }							

    public void setN(Integer N) {		
        this.N = N;				
    }								

    public Measurement withN(Integer N) {				
        this.N = N;						
        return this;						
    }										

    public Float getP_value() {		
        return pValue;				
    }							

    public void setP_value(Float pValue) {		
        this.pValue = pValue;				
    }								

    public Measurement withP_value(Float pValue) {				
        this.pValue = pValue;						
        return this;						
    }										

    public Float getZ_score() {		
        return ZScore;				
    }							

    public void setZ_score(Float ZScore) {		
        this.ZScore = ZScore;				
    }								

    public Measurement withZ_score(Float ZScore) {				
        this.ZScore = ZScore;						
        return this;						
    }										

}

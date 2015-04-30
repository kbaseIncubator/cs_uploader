package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class HasTrait extends Dumper {  	

    @Column(name="from_link", type=ColumnType.STRING)		
    private String fromLink;									

    @Column(name="to_link", type=ColumnType.STRING)		
    private String toLink;									

    @Column(name="value", type=ColumnType.FLOAT)		
    private Float value;									

    @Column(name="statistic_type", type=ColumnType.STRING)		
    private String statisticType;									

    @Column(name="measure_id", type=ColumnType.STRING)		
    private String measureId;									

    private HasTrait() throws IOException{		
        super();							
    }										

    public static HasTrait newDumper() throws IOException{	
        return new HasTrait();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public HasTrait withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public String getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(String toLink) {		
        this.toLink = toLink;				
    }								

    public HasTrait withTo_link(String toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

    public Float getValue() {		
        return value;				
    }							

    public void setValue(Float value) {		
        this.value = value;				
    }								

    public HasTrait withValue(Float value) {				
        this.value = value;						
        return this;						
    }										

    public String getStatistic_type() {		
        return statisticType;				
    }							

    public void setStatistic_type(String statisticType) {		
        this.statisticType = statisticType;				
    }								

    public HasTrait withStatistic_type(String statisticType) {				
        this.statisticType = statisticType;						
        return this;						
    }										

    public String getMeasure_id() {		
        return measureId;				
    }							

    public void setMeasure_id(String measureId) {		
        this.measureId = measureId;				
    }								

    public HasTrait withMeasure_id(String measureId) {				
        this.measureId = measureId;						
        return this;						
    }										

}

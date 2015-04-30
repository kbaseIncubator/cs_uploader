package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class HasIndicatedSignalFrom extends Dumper {  	

    @Column(name="from_link", type=ColumnType.STRING)		
    private String fromLink;									

    @Column(name="to_link", type=ColumnType.STRING)		
    private String toLink;									

    @Column(name="rma_value", type=ColumnType.FLOAT)		
    private Float rmaValue;									

    @Column(name="level", type=ColumnType.INT)		
    private Integer level;									

    private HasIndicatedSignalFrom() throws IOException{		
        super();							
    }										

    public static HasIndicatedSignalFrom newDumper() throws IOException{	
        return new HasIndicatedSignalFrom();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public HasIndicatedSignalFrom withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public String getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(String toLink) {		
        this.toLink = toLink;				
    }								

    public HasIndicatedSignalFrom withTo_link(String toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

    public Float getRma_value() {		
        return rmaValue;				
    }							

    public void setRma_value(Float rmaValue) {		
        this.rmaValue = rmaValue;				
    }								

    public HasIndicatedSignalFrom withRma_value(Float rmaValue) {				
        this.rmaValue = rmaValue;						
        return this;						
    }										

    public Integer getLevel() {		
        return level;				
    }							

    public void setLevel(Integer level) {		
        this.level = level;				
    }								

    public HasIndicatedSignalFrom withLevel(Integer level) {				
        this.level = level;						
        return this;						
    }										

}

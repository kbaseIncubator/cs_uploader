package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class IndicatesSignalFor extends Dumper {  	

    @Column(name="from_link", type=ColumnType.STRING)		
    private String fromLink;									

    @Column(name="to_link", type=ColumnType.STRING)		
    private String toLink;									

    @Column(name="rma_value", type=ColumnType.FLOAT)		
    private Float rmaValue;									

    @Column(name="level", type=ColumnType.INT)		
    private Integer level;									

    private IndicatesSignalFor() throws IOException{		
        super();							
    }										

    public static IndicatesSignalFor newDumper() throws IOException{	
        return new IndicatesSignalFor();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public IndicatesSignalFor withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public String getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(String toLink) {		
        this.toLink = toLink;				
    }								

    public IndicatesSignalFor withTo_link(String toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

    public Float getRma_value() {		
        return rmaValue;				
    }							

    public void setRma_value(Float rmaValue) {		
        this.rmaValue = rmaValue;				
    }								

    public IndicatesSignalFor withRma_value(Float rmaValue) {				
        this.rmaValue = rmaValue;						
        return this;						
    }										

    public Integer getLevel() {		
        return level;				
    }							

    public void setLevel(Integer level) {		
        this.level = level;				
    }								

    public IndicatesSignalFor withLevel(Integer level) {				
        this.level = level;						
        return this;						
    }										

}

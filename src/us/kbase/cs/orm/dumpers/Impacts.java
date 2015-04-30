package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class Impacts extends Dumper {  	

    @Column(name="from_link", type=ColumnType.STRING)		
    private String fromLink;									

    @Column(name="to_link", type=ColumnType.STRING)		
    private String toLink;									

    @Column(name="source_name", type=ColumnType.STRING)		
    private String sourceName;									

    @Column(name="rank", type=ColumnType.INT)		
    private Integer rank;									

    @Column(name="pvalue", type=ColumnType.FLOAT)		
    private Float pvalue;									

    @Column(name="position", type=ColumnType.INT)		
    private Integer position;									

    private Impacts() throws IOException{		
        super();							
    }										

    public static Impacts newDumper() throws IOException{	
        return new Impacts();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public Impacts withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public String getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(String toLink) {		
        this.toLink = toLink;				
    }								

    public Impacts withTo_link(String toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

    public String getSource_name() {		
        return sourceName;				
    }							

    public void setSource_name(String sourceName) {		
        this.sourceName = sourceName;				
    }								

    public Impacts withSource_name(String sourceName) {				
        this.sourceName = sourceName;						
        return this;						
    }										

    public Integer getRank() {		
        return rank;				
    }							

    public void setRank(Integer rank) {		
        this.rank = rank;				
    }								

    public Impacts withRank(Integer rank) {				
        this.rank = rank;						
        return this;						
    }										

    public Float getPvalue() {		
        return pvalue;				
    }							

    public void setPvalue(Float pvalue) {		
        this.pvalue = pvalue;				
    }								

    public Impacts withPvalue(Float pvalue) {				
        this.pvalue = pvalue;						
        return this;						
    }										

    public Integer getPosition() {		
        return position;				
    }							

    public void setPosition(Integer position) {		
        this.position = position;				
    }								

    public Impacts withPosition(Integer position) {				
        this.position = position;						
        return this;						
    }										

}

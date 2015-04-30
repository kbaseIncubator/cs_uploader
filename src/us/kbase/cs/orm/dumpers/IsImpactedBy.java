package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class IsImpactedBy extends Dumper {  	

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

    private IsImpactedBy() throws IOException{		
        super();							
    }										

    public static IsImpactedBy newDumper() throws IOException{	
        return new IsImpactedBy();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public IsImpactedBy withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public String getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(String toLink) {		
        this.toLink = toLink;				
    }								

    public IsImpactedBy withTo_link(String toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

    public String getSource_name() {		
        return sourceName;				
    }							

    public void setSource_name(String sourceName) {		
        this.sourceName = sourceName;				
    }								

    public IsImpactedBy withSource_name(String sourceName) {				
        this.sourceName = sourceName;						
        return this;						
    }										

    public Integer getRank() {		
        return rank;				
    }							

    public void setRank(Integer rank) {		
        this.rank = rank;				
    }								

    public IsImpactedBy withRank(Integer rank) {				
        this.rank = rank;						
        return this;						
    }										

    public Float getPvalue() {		
        return pvalue;				
    }							

    public void setPvalue(Float pvalue) {		
        this.pvalue = pvalue;				
    }								

    public IsImpactedBy withPvalue(Float pvalue) {				
        this.pvalue = pvalue;						
        return this;						
    }										

    public Integer getPosition() {		
        return position;				
    }							

    public void setPosition(Integer position) {		
        this.position = position;				
    }								

    public IsImpactedBy withPosition(Integer position) {				
        this.position = position;						
        return this;						
    }										

}

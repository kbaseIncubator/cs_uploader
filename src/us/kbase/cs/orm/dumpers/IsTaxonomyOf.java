package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class IsTaxonomyOf extends Dumper {  	

    @Column(name="from_link", type=ColumnType.COUNTER)		
    private Long fromLink;									

    @Column(name="to_link", type=ColumnType.STRING)		
    private String toLink;									

    @Column(name="confidence", type=ColumnType.INT)		
    private Integer confidence;									

    private IsTaxonomyOf() throws IOException{		
        super();							
    }										

    public static IsTaxonomyOf newDumper() throws IOException{	
        return new IsTaxonomyOf();			
    }								

    public Long getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(Long fromLink) {		
        this.fromLink = fromLink;				
    }								

    public IsTaxonomyOf withFrom_link(Long fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public String getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(String toLink) {		
        this.toLink = toLink;				
    }								

    public IsTaxonomyOf withTo_link(String toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

    public Integer getConfidence() {		
        return confidence;				
    }							

    public void setConfidence(Integer confidence) {		
        this.confidence = confidence;				
    }								

    public IsTaxonomyOf withConfidence(Integer confidence) {				
        this.confidence = confidence;						
        return this;						
    }										

}

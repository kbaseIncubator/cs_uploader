package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class IsInTaxa extends Dumper {  	

    @Column(name="from_link", type=ColumnType.STRING)		
    private String fromLink;									

    @Column(name="to_link", type=ColumnType.COUNTER)		
    private Long toLink;									

    @Column(name="confidence", type=ColumnType.INT)		
    private Integer confidence;									

    private IsInTaxa() throws IOException{		
        super();							
    }										

    public static IsInTaxa newDumper() throws IOException{	
        return new IsInTaxa();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public IsInTaxa withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public Long getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(Long toLink) {		
        this.toLink = toLink;				
    }								

    public IsInTaxa withTo_link(Long toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

    public Integer getConfidence() {		
        return confidence;				
    }							

    public void setConfidence(Integer confidence) {		
        this.confidence = confidence;				
    }								

    public IsInTaxa withConfidence(Integer confidence) {				
        this.confidence = confidence;						
        return this;						
    }										

}

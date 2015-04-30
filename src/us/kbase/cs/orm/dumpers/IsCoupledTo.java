package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class IsCoupledTo extends Dumper {  	

    @Column(name="from_link", type=ColumnType.STRING)		
    private String fromLink;									

    @Column(name="to_link", type=ColumnType.STRING)		
    private String toLink;									

    @Column(name="co_occurrence_evidence", type=ColumnType.COUNTER)		
    private Long coOccurrenceEvidence;									

    @Column(name="co_expression_evidence", type=ColumnType.COUNTER)		
    private Long coExpressionEvidence;									

    private IsCoupledTo() throws IOException{		
        super();							
    }										

    public static IsCoupledTo newDumper() throws IOException{	
        return new IsCoupledTo();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public IsCoupledTo withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public String getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(String toLink) {		
        this.toLink = toLink;				
    }								

    public IsCoupledTo withTo_link(String toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

    public Long getCo_occurrence_evidence() {		
        return coOccurrenceEvidence;				
    }							

    public void setCo_occurrence_evidence(Long coOccurrenceEvidence) {		
        this.coOccurrenceEvidence = coOccurrenceEvidence;				
    }								

    public IsCoupledTo withCo_occurrence_evidence(Long coOccurrenceEvidence) {				
        this.coOccurrenceEvidence = coOccurrenceEvidence;						
        return this;						
    }										

    public Long getCo_expression_evidence() {		
        return coExpressionEvidence;				
    }							

    public void setCo_expression_evidence(Long coExpressionEvidence) {		
        this.coExpressionEvidence = coExpressionEvidence;				
    }								

    public IsCoupledTo withCo_expression_evidence(Long coExpressionEvidence) {				
        this.coExpressionEvidence = coExpressionEvidence;						
        return this;						
    }										

}

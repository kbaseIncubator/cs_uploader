package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class HasResultsFor extends Dumper {  	

    @Column(name="from_link", type=ColumnType.STRING)		
    private String fromLink;									

    @Column(name="to_link", type=ColumnType.STRING)		
    private String toLink;									

    @Column(name="sequence", type=ColumnType.INT)		
    private Integer sequence;									

    private HasResultsFor() throws IOException{		
        super();							
    }										

    public static HasResultsFor newDumper() throws IOException{	
        return new HasResultsFor();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public HasResultsFor withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public String getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(String toLink) {		
        this.toLink = toLink;				
    }								

    public HasResultsFor withTo_link(String toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

    public Integer getSequence() {		
        return sequence;				
    }							

    public void setSequence(Integer sequence) {		
        this.sequence = sequence;				
    }								

    public HasResultsFor withSequence(Integer sequence) {				
        this.sequence = sequence;						
        return this;						
    }										

}

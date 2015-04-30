package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class HasResultsIn extends Dumper {  	

    @Column(name="from_link", type=ColumnType.STRING)		
    private String fromLink;									

    @Column(name="to_link", type=ColumnType.STRING)		
    private String toLink;									

    @Column(name="sequence", type=ColumnType.INT)		
    private Integer sequence;									

    private HasResultsIn() throws IOException{		
        super();							
    }										

    public static HasResultsIn newDumper() throws IOException{	
        return new HasResultsIn();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public HasResultsIn withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public String getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(String toLink) {		
        this.toLink = toLink;				
    }								

    public HasResultsIn withTo_link(String toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

    public Integer getSequence() {		
        return sequence;				
    }							

    public void setSequence(Integer sequence) {		
        this.sequence = sequence;				
    }								

    public HasResultsIn withSequence(Integer sequence) {				
        this.sequence = sequence;						
        return this;						
    }										

}

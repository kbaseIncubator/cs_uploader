package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class SupersedesAlignment extends Dumper {  	

    @Column(name="from_link", type=ColumnType.STRING)		
    private String fromLink;									

    @Column(name="to_link", type=ColumnType.STRING)		
    private String toLink;									

    @Column(name="successor_type", type=ColumnType.STRING)		
    private String successorType;									

    private SupersedesAlignment() throws IOException{		
        super();							
    }										

    public static SupersedesAlignment newDumper() throws IOException{	
        return new SupersedesAlignment();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public SupersedesAlignment withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public String getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(String toLink) {		
        this.toLink = toLink;				
    }								

    public SupersedesAlignment withTo_link(String toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

    public String getSuccessor_type() {		
        return successorType;				
    }							

    public void setSuccessor_type(String successorType) {		
        this.successorType = successorType;				
    }								

    public SupersedesAlignment withSuccessor_type(String successorType) {				
        this.successorType = successorType;						
        return this;						
    }										

}

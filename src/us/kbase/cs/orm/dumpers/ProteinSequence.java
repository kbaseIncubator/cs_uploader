package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class ProteinSequence extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="sequence", type=ColumnType.TEXT)		
    private String sequence;									

    private ProteinSequence() throws IOException{		
        super();							
    }										

    public static ProteinSequence newDumper() throws IOException{	
        return new ProteinSequence();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public ProteinSequence withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public String getSequence() {		
        return sequence;				
    }							

    public void setSequence(String sequence) {		
        this.sequence = sequence;				
    }								

    public ProteinSequence withSequence(String sequence) {				
        this.sequence = sequence;						
        return this;						
    }										

}

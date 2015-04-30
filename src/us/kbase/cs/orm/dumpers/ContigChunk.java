package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class ContigChunk extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="sequence", type=ColumnType.UNSUPPORTED)		
    private Object sequence;									

    private ContigChunk() throws IOException{		
        super();							
    }										

    public static ContigChunk newDumper() throws IOException{	
        return new ContigChunk();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public ContigChunk withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public Object getSequence() {		
        return sequence;				
    }							

    public void setSequence(Object sequence) {		
        this.sequence = sequence;				
    }								

    public ContigChunk withSequence(Object sequence) {				
        this.sequence = sequence;						
        return this;						
    }										

}

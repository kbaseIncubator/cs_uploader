package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class ContigSequence extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="length", type=ColumnType.COUNTER)		
    private Long length;									

    private ContigSequence() throws IOException{		
        super();							
    }										

    public static ContigSequence newDumper() throws IOException{	
        return new ContigSequence();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public ContigSequence withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public Long getLength() {		
        return length;				
    }							

    public void setLength(Long length) {		
        this.length = length;				
    }								

    public ContigSequence withLength(Long length) {				
        this.length = length;						
        return this;						
    }										

}

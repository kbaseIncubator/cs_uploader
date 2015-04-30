package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class AtomicRegulon extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    private AtomicRegulon() throws IOException{		
        super();							
    }										

    public static AtomicRegulon newDumper() throws IOException{	
        return new AtomicRegulon();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public AtomicRegulon withId(String id) {				
        this.id = id;						
        return this;						
    }										

}

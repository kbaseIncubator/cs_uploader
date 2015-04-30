package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class Parameter extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    private Parameter() throws IOException{		
        super();							
    }										

    public static Parameter newDumper() throws IOException{	
        return new Parameter();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public Parameter withId(String id) {				
        this.id = id;						
        return this;						
    }										

}

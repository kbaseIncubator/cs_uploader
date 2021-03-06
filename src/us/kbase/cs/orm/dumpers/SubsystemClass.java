package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class SubsystemClass extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    private SubsystemClass() throws IOException{		
        super();							
    }										

    public static SubsystemClass newDumper() throws IOException{	
        return new SubsystemClass();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public SubsystemClass withId(String id) {				
        this.id = id;						
        return this;						
    }										

}

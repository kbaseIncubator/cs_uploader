package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class OTU extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    private OTU() throws IOException{		
        super();							
    }										

    public static OTU newDumper() throws IOException{	
        return new OTU();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public OTU withId(String id) {				
        this.id = id;						
        return this;						
    }										

}

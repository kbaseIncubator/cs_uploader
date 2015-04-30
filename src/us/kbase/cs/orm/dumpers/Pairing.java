package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class Pairing extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    private Pairing() throws IOException{		
        super();							
    }										

    public static Pairing newDumper() throws IOException{	
        return new Pairing();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public Pairing withId(String id) {				
        this.id = id;						
        return this;						
    }										

}

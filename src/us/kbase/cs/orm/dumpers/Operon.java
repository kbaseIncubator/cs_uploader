package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class Operon extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    private Operon() throws IOException{		
        super();							
    }										

    public static Operon newDumper() throws IOException{	
        return new Operon();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public Operon withId(String id) {				
        this.id = id;						
        return this;						
    }										

}

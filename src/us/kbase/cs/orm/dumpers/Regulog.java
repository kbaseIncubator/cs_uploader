package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class Regulog extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="description", type=ColumnType.STRING)		
    private String description;									

    private Regulog() throws IOException{		
        super();							
    }										

    public static Regulog newDumper() throws IOException{	
        return new Regulog();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public Regulog withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public String getDescription() {		
        return description;				
    }							

    public void setDescription(String description) {		
        this.description = description;				
    }								

    public Regulog withDescription(String description) {				
        this.description = description;						
        return this;						
    }										

}

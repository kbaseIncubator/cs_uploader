package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class TreeAttribute extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    private TreeAttribute() throws IOException{		
        super();							
    }										

    public static TreeAttribute newDumper() throws IOException{	
        return new TreeAttribute();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public TreeAttribute withId(String id) {				
        this.id = id;						
        return this;						
    }										

}

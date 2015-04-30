package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class TreeNodeAttribute extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    private TreeNodeAttribute() throws IOException{		
        super();							
    }										

    public static TreeNodeAttribute newDumper() throws IOException{	
        return new TreeNodeAttribute();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public TreeNodeAttribute withId(String id) {				
        this.id = id;						
        return this;						
    }										

}

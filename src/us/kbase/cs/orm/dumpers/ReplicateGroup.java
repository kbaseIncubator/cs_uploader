package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class ReplicateGroup extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    private ReplicateGroup() throws IOException{		
        super();							
    }										

    public static ReplicateGroup newDumper() throws IOException{	
        return new ReplicateGroup();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public ReplicateGroup withId(String id) {				
        this.id = id;						
        return this;						
    }										

}

package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class AlignmentAttribute extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    private AlignmentAttribute() throws IOException{		
        super();							
    }										

    public static AlignmentAttribute newDumper() throws IOException{	
        return new AlignmentAttribute();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public AlignmentAttribute withId(String id) {				
        this.id = id;						
        return this;						
    }										

}

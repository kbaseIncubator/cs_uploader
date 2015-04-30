package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class LocalizedCompound extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    private LocalizedCompound() throws IOException{		
        super();							
    }										

    public static LocalizedCompound newDumper() throws IOException{	
        return new LocalizedCompound();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public LocalizedCompound withId(String id) {				
        this.id = id;						
        return this;						
    }										

}

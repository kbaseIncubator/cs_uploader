package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class SSCell extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    private SSCell() throws IOException{		
        super();							
    }										

    public static SSCell newDumper() throws IOException{	
        return new SSCell();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public SSCell withId(String id) {				
        this.id = id;						
        return this;						
    }										

}

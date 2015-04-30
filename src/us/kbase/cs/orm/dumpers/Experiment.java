package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class Experiment extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="source", type=ColumnType.STRING)		
    private String source;									

    private Experiment() throws IOException{		
        super();							
    }										

    public static Experiment newDumper() throws IOException{	
        return new Experiment();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public Experiment withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public String getSource() {		
        return source;				
    }							

    public void setSource(String source) {		
        this.source = source;				
    }								

    public Experiment withSource(String source) {				
        this.source = source;						
        return this;						
    }										

}

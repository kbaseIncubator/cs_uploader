package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class Diagram extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="name", type=ColumnType.TEXT)		
    private String name;									

    @Column(name="content", type=ColumnType.UNSUPPORTED)		
    private Object content;									

    private Diagram() throws IOException{		
        super();							
    }										

    public static Diagram newDumper() throws IOException{	
        return new Diagram();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public Diagram withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public String getName() {		
        return name;				
    }							

    public void setName(String name) {		
        this.name = name;				
    }								

    public Diagram withName(String name) {				
        this.name = name;						
        return this;						
    }										

    public Object getContent() {		
        return content;				
    }							

    public void setContent(Object content) {		
        this.content = content;				
    }								

    public Diagram withContent(Object content) {				
        this.content = content;						
        return this;						
    }										

}

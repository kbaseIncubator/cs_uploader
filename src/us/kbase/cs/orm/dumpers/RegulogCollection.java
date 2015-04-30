package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class RegulogCollection extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="name", type=ColumnType.STRING)		
    private String name;									

    @Column(name="description", type=ColumnType.STRING)		
    private String description;									

    private RegulogCollection() throws IOException{		
        super();							
    }										

    public static RegulogCollection newDumper() throws IOException{	
        return new RegulogCollection();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public RegulogCollection withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public String getName() {		
        return name;				
    }							

    public void setName(String name) {		
        this.name = name;				
    }								

    public RegulogCollection withName(String name) {				
        this.name = name;						
        return this;						
    }										

    public String getDescription() {		
        return description;				
    }							

    public void setDescription(String description) {		
        this.description = description;				
    }								

    public RegulogCollection withDescription(String description) {				
        this.description = description;						
        return this;						
    }										

}

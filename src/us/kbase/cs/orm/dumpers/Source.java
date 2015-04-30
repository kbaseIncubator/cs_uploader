package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class Source extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="name", type=ColumnType.STRING)		
    private String name;									

    @Column(name="url", type=ColumnType.STRING)		
    private String url;									

    @Column(name="description", type=ColumnType.STRING)		
    private String description;									

    private Source() throws IOException{		
        super();							
    }										

    public static Source newDumper() throws IOException{	
        return new Source();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public Source withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public String getName() {		
        return name;				
    }							

    public void setName(String name) {		
        this.name = name;				
    }								

    public Source withName(String name) {				
        this.name = name;						
        return this;						
    }										

    public String getUrl() {		
        return url;				
    }							

    public void setUrl(String url) {		
        this.url = url;				
    }								

    public Source withUrl(String url) {				
        this.url = url;						
        return this;						
    }										

    public String getDescription() {		
        return description;				
    }							

    public void setDescription(String description) {		
        this.description = description;				
    }								

    public Source withDescription(String description) {				
        this.description = description;						
        return this;						
    }										

}

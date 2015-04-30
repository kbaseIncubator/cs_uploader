package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class Association extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="name", type=ColumnType.STRING)		
    private String name;									

    @Column(name="description", type=ColumnType.STRING)		
    private String description;									

    @Column(name="directional", type=ColumnType.BOOLEAN)		
    private Byte directional;									

    @Column(name="confidence", type=ColumnType.FLOAT)		
    private Float confidence;									

    @Column(name="url", type=ColumnType.STRING)		
    private String url;									

    private Association() throws IOException{		
        super();							
    }										

    public static Association newDumper() throws IOException{	
        return new Association();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public Association withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public String getName() {		
        return name;				
    }							

    public void setName(String name) {		
        this.name = name;				
    }								

    public Association withName(String name) {				
        this.name = name;						
        return this;						
    }										

    public String getDescription() {		
        return description;				
    }							

    public void setDescription(String description) {		
        this.description = description;				
    }								

    public Association withDescription(String description) {				
        this.description = description;						
        return this;						
    }										

    public Byte getDirectional() {		
        return directional;				
    }							

    public void setDirectional(Byte directional) {		
        this.directional = directional;				
    }								

    public Association withDirectional(Byte directional) {				
        this.directional = directional;						
        return this;						
    }										

    public Float getConfidence() {		
        return confidence;				
    }							

    public void setConfidence(Float confidence) {		
        this.confidence = confidence;				
    }								

    public Association withConfidence(Float confidence) {				
        this.confidence = confidence;						
        return this;						
    }										

    public String getUrl() {		
        return url;				
    }							

    public void setUrl(String url) {		
        this.url = url;				
    }								

    public Association withUrl(String url) {				
        this.url = url;						
        return this;						
    }										

}

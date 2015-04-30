package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class Platform extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="title", type=ColumnType.LONG_STRING)		
    private String title;									

    @Column(name="externalSourceId", type=ColumnType.STRING)		
    private String externalSourceId;									

    @Column(name="technology", type=ColumnType.LONG_STRING)		
    private String technology;									

    @Column(name="type", type=ColumnType.STRING)		
    private String type;									

    @Column(name="source_id", type=ColumnType.STRING)		
    private String sourceId;									

    private Platform() throws IOException{		
        super();							
    }										

    public static Platform newDumper() throws IOException{	
        return new Platform();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public Platform withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public String getTitle() {		
        return title;				
    }							

    public void setTitle(String title) {		
        this.title = title;				
    }								

    public Platform withTitle(String title) {				
        this.title = title;						
        return this;						
    }										

    public String getExternalSourceId() {		
        return externalSourceId;				
    }							

    public void setExternalSourceId(String externalSourceId) {		
        this.externalSourceId = externalSourceId;				
    }								

    public Platform withExternalSourceId(String externalSourceId) {				
        this.externalSourceId = externalSourceId;						
        return this;						
    }										

    public String getTechnology() {		
        return technology;				
    }							

    public void setTechnology(String technology) {		
        this.technology = technology;				
    }								

    public Platform withTechnology(String technology) {				
        this.technology = technology;						
        return this;						
    }										

    public String getType() {		
        return type;				
    }							

    public void setType(String type) {		
        this.type = type;				
    }								

    public Platform withType(String type) {				
        this.type = type;						
        return this;						
    }										

    public String getSource_id() {		
        return sourceId;				
    }							

    public void setSource_id(String sourceId) {		
        this.sourceId = sourceId;				
    }								

    public Platform withSource_id(String sourceId) {				
        this.sourceId = sourceId;						
        return this;						
    }										

}

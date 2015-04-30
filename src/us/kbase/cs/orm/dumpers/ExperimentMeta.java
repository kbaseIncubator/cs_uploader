package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class ExperimentMeta extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="title", type=ColumnType.STRING)		
    private String title;									

    @Column(name="description", type=ColumnType.TEXT)		
    private String description;									

    @Column(name="source_id", type=ColumnType.STRING)		
    private String sourceId;									

    @Column(name="startDate", type=ColumnType.DATE)		
    private Long startDate;									

    @Column(name="comments", type=ColumnType.TEXT)		
    private String comments;									

    private ExperimentMeta() throws IOException{		
        super();							
    }										

    public static ExperimentMeta newDumper() throws IOException{	
        return new ExperimentMeta();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public ExperimentMeta withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public String getTitle() {		
        return title;				
    }							

    public void setTitle(String title) {		
        this.title = title;				
    }								

    public ExperimentMeta withTitle(String title) {				
        this.title = title;						
        return this;						
    }										

    public String getDescription() {		
        return description;				
    }							

    public void setDescription(String description) {		
        this.description = description;				
    }								

    public ExperimentMeta withDescription(String description) {				
        this.description = description;						
        return this;						
    }										

    public String getSource_id() {		
        return sourceId;				
    }							

    public void setSource_id(String sourceId) {		
        this.sourceId = sourceId;				
    }								

    public ExperimentMeta withSource_id(String sourceId) {				
        this.sourceId = sourceId;						
        return this;						
    }										

    public Long getStartDate() {		
        return startDate;				
    }							

    public void setStartDate(Long startDate) {		
        this.startDate = startDate;				
    }								

    public ExperimentMeta withStartDate(Long startDate) {				
        this.startDate = startDate;						
        return this;						
    }										

    public String getComments() {		
        return comments;				
    }							

    public void setComments(String comments) {		
        this.comments = comments;				
    }								

    public ExperimentMeta withComments(String comments) {				
        this.comments = comments;						
        return this;						
    }										

}

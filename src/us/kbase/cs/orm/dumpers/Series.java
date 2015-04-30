package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class Series extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="title", type=ColumnType.LONG_STRING)		
    private String title;									

    @Column(name="summary", type=ColumnType.TEXT)		
    private String summary;									

    @Column(name="design", type=ColumnType.TEXT)		
    private String design;									

    @Column(name="externalSourceId", type=ColumnType.STRING)		
    private String externalSourceId;									

    @Column(name="kbaseSubmissionDate", type=ColumnType.DATE)		
    private Long kbaseSubmissionDate;									

    @Column(name="externalSourceDate", type=ColumnType.DATE)		
    private Long externalSourceDate;									

    @Column(name="source_id", type=ColumnType.STRING)		
    private String sourceId;									

    private Series() throws IOException{		
        super();							
    }										

    public static Series newDumper() throws IOException{	
        return new Series();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public Series withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public String getTitle() {		
        return title;				
    }							

    public void setTitle(String title) {		
        this.title = title;				
    }								

    public Series withTitle(String title) {				
        this.title = title;						
        return this;						
    }										

    public String getSummary() {		
        return summary;				
    }							

    public void setSummary(String summary) {		
        this.summary = summary;				
    }								

    public Series withSummary(String summary) {				
        this.summary = summary;						
        return this;						
    }										

    public String getDesign() {		
        return design;				
    }							

    public void setDesign(String design) {		
        this.design = design;				
    }								

    public Series withDesign(String design) {				
        this.design = design;						
        return this;						
    }										

    public String getExternalSourceId() {		
        return externalSourceId;				
    }							

    public void setExternalSourceId(String externalSourceId) {		
        this.externalSourceId = externalSourceId;				
    }								

    public Series withExternalSourceId(String externalSourceId) {				
        this.externalSourceId = externalSourceId;						
        return this;						
    }										

    public Long getKbaseSubmissionDate() {		
        return kbaseSubmissionDate;				
    }							

    public void setKbaseSubmissionDate(Long kbaseSubmissionDate) {		
        this.kbaseSubmissionDate = kbaseSubmissionDate;				
    }								

    public Series withKbaseSubmissionDate(Long kbaseSubmissionDate) {				
        this.kbaseSubmissionDate = kbaseSubmissionDate;						
        return this;						
    }										

    public Long getExternalSourceDate() {		
        return externalSourceDate;				
    }							

    public void setExternalSourceDate(Long externalSourceDate) {		
        this.externalSourceDate = externalSourceDate;				
    }								

    public Series withExternalSourceDate(Long externalSourceDate) {				
        this.externalSourceDate = externalSourceDate;						
        return this;						
    }										

    public String getSource_id() {		
        return sourceId;				
    }							

    public void setSource_id(String sourceId) {		
        this.sourceId = sourceId;				
    }								

    public Series withSource_id(String sourceId) {				
        this.sourceId = sourceId;						
        return this;						
    }										

}

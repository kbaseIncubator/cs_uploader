package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class Annotation extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="annotator", type=ColumnType.STRING)		
    private String annotator;									

    @Column(name="comment", type=ColumnType.TEXT)		
    private String comment;									

    @Column(name="annotation_time", type=ColumnType.DATE)		
    private Long annotationTime;									

    private Annotation() throws IOException{		
        super();							
    }										

    public static Annotation newDumper() throws IOException{	
        return new Annotation();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public Annotation withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public String getAnnotator() {		
        return annotator;				
    }							

    public void setAnnotator(String annotator) {		
        this.annotator = annotator;				
    }								

    public Annotation withAnnotator(String annotator) {				
        this.annotator = annotator;						
        return this;						
    }										

    public String getComment() {		
        return comment;				
    }							

    public void setComment(String comment) {		
        this.comment = comment;				
    }								

    public Annotation withComment(String comment) {				
        this.comment = comment;						
        return this;						
    }										

    public Long getAnnotation_time() {		
        return annotationTime;				
    }							

    public void setAnnotation_time(Long annotationTime) {		
        this.annotationTime = annotationTime;				
    }								

    public Annotation withAnnotation_time(Long annotationTime) {				
        this.annotationTime = annotationTime;						
        return this;						
    }										

}

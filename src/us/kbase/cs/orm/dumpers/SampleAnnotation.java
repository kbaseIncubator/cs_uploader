package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class SampleAnnotation extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="annotationDate", type=ColumnType.DATE)		
    private Long annotationDate;									

    @Column(name="source_id", type=ColumnType.STRING)		
    private String sourceId;									

    private SampleAnnotation() throws IOException{		
        super();							
    }										

    public static SampleAnnotation newDumper() throws IOException{	
        return new SampleAnnotation();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public SampleAnnotation withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public Long getAnnotationDate() {		
        return annotationDate;				
    }							

    public void setAnnotationDate(Long annotationDate) {		
        this.annotationDate = annotationDate;				
    }								

    public SampleAnnotation withAnnotationDate(Long annotationDate) {				
        this.annotationDate = annotationDate;						
        return this;						
    }										

    public String getSource_id() {		
        return sourceId;				
    }							

    public void setSource_id(String sourceId) {		
        this.sourceId = sourceId;				
    }								

    public SampleAnnotation withSource_id(String sourceId) {				
        this.sourceId = sourceId;						
        return this;						
    }										

}

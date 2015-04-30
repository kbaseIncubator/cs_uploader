package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class StudyExperiment extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="source_name", type=ColumnType.STRING)		
    private String sourceName;									

    @Column(name="design", type=ColumnType.TEXT)		
    private String design;									

    @Column(name="originator", type=ColumnType.STRING)		
    private String originator;									

    private StudyExperiment() throws IOException{		
        super();							
    }										

    public static StudyExperiment newDumper() throws IOException{	
        return new StudyExperiment();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public StudyExperiment withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public String getSource_name() {		
        return sourceName;				
    }							

    public void setSource_name(String sourceName) {		
        this.sourceName = sourceName;				
    }								

    public StudyExperiment withSource_name(String sourceName) {				
        this.sourceName = sourceName;						
        return this;						
    }										

    public String getDesign() {		
        return design;				
    }							

    public void setDesign(String design) {		
        this.design = design;				
    }								

    public StudyExperiment withDesign(String design) {				
        this.design = design;						
        return this;						
    }										

    public String getOriginator() {		
        return originator;				
    }							

    public void setOriginator(String originator) {		
        this.originator = originator;				
    }								

    public StudyExperiment withOriginator(String originator) {				
        this.originator = originator;						
        return this;						
    }										

}

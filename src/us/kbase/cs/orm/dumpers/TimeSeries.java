package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class TimeSeries extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="source_id", type=ColumnType.STRING)		
    private String sourceId;									

    @Column(name="name", type=ColumnType.STRING)		
    private String name;									

    @Column(name="comments", type=ColumnType.STRING)		
    private String comments;									

    @Column(name="timeUnits", type=ColumnType.STRING)		
    private String timeUnits;									

    private TimeSeries() throws IOException{		
        super();							
    }										

    public static TimeSeries newDumper() throws IOException{	
        return new TimeSeries();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public TimeSeries withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public String getSource_id() {		
        return sourceId;				
    }							

    public void setSource_id(String sourceId) {		
        this.sourceId = sourceId;				
    }								

    public TimeSeries withSource_id(String sourceId) {				
        this.sourceId = sourceId;						
        return this;						
    }										

    public String getName() {		
        return name;				
    }							

    public void setName(String name) {		
        this.name = name;				
    }								

    public TimeSeries withName(String name) {				
        this.name = name;						
        return this;						
    }										

    public String getComments() {		
        return comments;				
    }							

    public void setComments(String comments) {		
        this.comments = comments;				
    }								

    public TimeSeries withComments(String comments) {				
        this.comments = comments;						
        return this;						
    }										

    public String getTimeUnits() {		
        return timeUnits;				
    }							

    public void setTimeUnits(String timeUnits) {		
        this.timeUnits = timeUnits;				
    }								

    public TimeSeries withTimeUnits(String timeUnits) {				
        this.timeUnits = timeUnits;						
        return this;						
    }										

}

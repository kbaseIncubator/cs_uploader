package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class ExperimentalUnitGroup extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="source_id", type=ColumnType.STRING)		
    private String sourceId;									

    @Column(name="name", type=ColumnType.STRING)		
    private String name;									

    @Column(name="comments", type=ColumnType.STRING)		
    private String comments;									

    @Column(name="groupType", type=ColumnType.STRING)		
    private String groupType;									

    private ExperimentalUnitGroup() throws IOException{		
        super();							
    }										

    public static ExperimentalUnitGroup newDumper() throws IOException{	
        return new ExperimentalUnitGroup();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public ExperimentalUnitGroup withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public String getSource_id() {		
        return sourceId;				
    }							

    public void setSource_id(String sourceId) {		
        this.sourceId = sourceId;				
    }								

    public ExperimentalUnitGroup withSource_id(String sourceId) {				
        this.sourceId = sourceId;						
        return this;						
    }										

    public String getName() {		
        return name;				
    }							

    public void setName(String name) {		
        this.name = name;				
    }								

    public ExperimentalUnitGroup withName(String name) {				
        this.name = name;						
        return this;						
    }										

    public String getComments() {		
        return comments;				
    }							

    public void setComments(String comments) {		
        this.comments = comments;				
    }								

    public ExperimentalUnitGroup withComments(String comments) {				
        this.comments = comments;						
        return this;						
    }										

    public String getGroupType() {		
        return groupType;				
    }							

    public void setGroupType(String groupType) {		
        this.groupType = groupType;				
    }								

    public ExperimentalUnitGroup withGroupType(String groupType) {				
        this.groupType = groupType;						
        return this;						
    }										

}

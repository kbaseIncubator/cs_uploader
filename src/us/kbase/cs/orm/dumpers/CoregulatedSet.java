package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class CoregulatedSet extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="source_id", type=ColumnType.STRING)		
    private String sourceId;									

    @Column(name="binding_location", type=ColumnType.INT)		
    private Integer bindingLocation;									

    private CoregulatedSet() throws IOException{		
        super();							
    }										

    public static CoregulatedSet newDumper() throws IOException{	
        return new CoregulatedSet();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public CoregulatedSet withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public String getSource_id() {		
        return sourceId;				
    }							

    public void setSource_id(String sourceId) {		
        this.sourceId = sourceId;				
    }								

    public CoregulatedSet withSource_id(String sourceId) {				
        this.sourceId = sourceId;						
        return this;						
    }										

    public Integer getBinding_location() {		
        return bindingLocation;				
    }							

    public void setBinding_location(Integer bindingLocation) {		
        this.bindingLocation = bindingLocation;				
    }								

    public CoregulatedSet withBinding_location(Integer bindingLocation) {				
        this.bindingLocation = bindingLocation;						
        return this;						
    }										

}

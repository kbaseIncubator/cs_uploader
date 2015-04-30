package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class ObservationalUnit extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="source_name", type=ColumnType.STRING)		
    private String sourceName;									

    @Column(name="source_name2", type=ColumnType.STRING)		
    private String sourceName2;									

    @Column(name="plant_id", type=ColumnType.STRING)		
    private String plantId;									

    private ObservationalUnit() throws IOException{		
        super();							
    }										

    public static ObservationalUnit newDumper() throws IOException{	
        return new ObservationalUnit();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public ObservationalUnit withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public String getSource_name() {		
        return sourceName;				
    }							

    public void setSource_name(String sourceName) {		
        this.sourceName = sourceName;				
    }								

    public ObservationalUnit withSource_name(String sourceName) {				
        this.sourceName = sourceName;						
        return this;						
    }										

    public String getSource_name2() {		
        return sourceName2;				
    }							

    public void setSource_name2(String sourceName2) {		
        this.sourceName2 = sourceName2;				
    }								

    public ObservationalUnit withSource_name2(String sourceName2) {				
        this.sourceName2 = sourceName2;						
        return this;						
    }										

    public String getPlant_id() {		
        return plantId;				
    }							

    public void setPlant_id(String plantId) {		
        this.plantId = plantId;				
    }								

    public ObservationalUnit withPlant_id(String plantId) {				
        this.plantId = plantId;						
        return this;						
    }										

}

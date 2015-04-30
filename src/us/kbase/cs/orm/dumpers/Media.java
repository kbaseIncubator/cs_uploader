package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class Media extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="mod_date", type=ColumnType.DATE)		
    private Long modDate;									

    @Column(name="name", type=ColumnType.STRING)		
    private String name;									

    @Column(name="is_minimal", type=ColumnType.SEMI_BOOLEAN)		
    private Character isMinimal;									

    @Column(name="source_id", type=ColumnType.STRING)		
    private String sourceId;									

    @Column(name="type", type=ColumnType.STRING)		
    private String type;									

    private Media() throws IOException{		
        super();							
    }										

    public static Media newDumper() throws IOException{	
        return new Media();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public Media withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public Long getMod_date() {		
        return modDate;				
    }							

    public void setMod_date(Long modDate) {		
        this.modDate = modDate;				
    }								

    public Media withMod_date(Long modDate) {				
        this.modDate = modDate;						
        return this;						
    }										

    public String getName() {		
        return name;				
    }							

    public void setName(String name) {		
        this.name = name;				
    }								

    public Media withName(String name) {				
        this.name = name;						
        return this;						
    }										

    public Character getIs_minimal() {		
        return isMinimal;				
    }							

    public void setIs_minimal(Character isMinimal) {		
        this.isMinimal = isMinimal;				
    }								

    public Media withIs_minimal(Character isMinimal) {				
        this.isMinimal = isMinimal;						
        return this;						
    }										

    public String getSource_id() {		
        return sourceId;				
    }							

    public void setSource_id(String sourceId) {		
        this.sourceId = sourceId;				
    }								

    public Media withSource_id(String sourceId) {				
        this.sourceId = sourceId;						
        return this;						
    }										

    public String getType() {		
        return type;				
    }							

    public void setType(String type) {		
        this.type = type;				
    }								

    public Media withType(String type) {				
        this.type = type;						
        return this;						
    }										

}

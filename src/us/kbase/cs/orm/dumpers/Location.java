package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class Location extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="mod_date", type=ColumnType.DATE)		
    private Long modDate;									

    @Column(name="name", type=ColumnType.STRING)		
    private String name;									

    @Column(name="source_id", type=ColumnType.STRING)		
    private String sourceId;									

    @Column(name="abbr", type=ColumnType.INT)		
    private Integer abbr;									

    private Location() throws IOException{		
        super();							
    }										

    public static Location newDumper() throws IOException{	
        return new Location();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public Location withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public Long getMod_date() {		
        return modDate;				
    }							

    public void setMod_date(Long modDate) {		
        this.modDate = modDate;				
    }								

    public Location withMod_date(Long modDate) {				
        this.modDate = modDate;						
        return this;						
    }										

    public String getName() {		
        return name;				
    }							

    public void setName(String name) {		
        this.name = name;				
    }								

    public Location withName(String name) {				
        this.name = name;						
        return this;						
    }										

    public String getSource_id() {		
        return sourceId;				
    }							

    public void setSource_id(String sourceId) {		
        this.sourceId = sourceId;				
    }								

    public Location withSource_id(String sourceId) {				
        this.sourceId = sourceId;						
        return this;						
    }										

    public Integer getAbbr() {		
        return abbr;				
    }							

    public void setAbbr(Integer abbr) {		
        this.abbr = abbr;				
    }								

    public Location withAbbr(Integer abbr) {				
        this.abbr = abbr;						
        return this;						
    }										

}

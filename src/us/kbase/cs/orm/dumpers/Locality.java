package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class Locality extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="source_name", type=ColumnType.STRING)		
    private String sourceName;									

    @Column(name="city", type=ColumnType.STRING)		
    private String city;									

    @Column(name="state", type=ColumnType.STRING)		
    private String state;									

    @Column(name="country", type=ColumnType.STRING)		
    private String country;									

    @Column(name="origcty", type=ColumnType.STRING)		
    private String origcty;									

    @Column(name="elevation", type=ColumnType.INT)		
    private Integer elevation;									

    @Column(name="latitude", type=ColumnType.INT)		
    private Integer latitude;									

    @Column(name="longitude", type=ColumnType.INT)		
    private Integer longitude;									

    @Column(name="lo_accession", type=ColumnType.STRING)		
    private String loAccession;									

    private Locality() throws IOException{		
        super();							
    }										

    public static Locality newDumper() throws IOException{	
        return new Locality();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public Locality withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public String getSource_name() {		
        return sourceName;				
    }							

    public void setSource_name(String sourceName) {		
        this.sourceName = sourceName;				
    }								

    public Locality withSource_name(String sourceName) {				
        this.sourceName = sourceName;						
        return this;						
    }										

    public String getCity() {		
        return city;				
    }							

    public void setCity(String city) {		
        this.city = city;				
    }								

    public Locality withCity(String city) {				
        this.city = city;						
        return this;						
    }										

    public String getState() {		
        return state;				
    }							

    public void setState(String state) {		
        this.state = state;				
    }								

    public Locality withState(String state) {				
        this.state = state;						
        return this;						
    }										

    public String getCountry() {		
        return country;				
    }							

    public void setCountry(String country) {		
        this.country = country;				
    }								

    public Locality withCountry(String country) {				
        this.country = country;						
        return this;						
    }										

    public String getOrigcty() {		
        return origcty;				
    }							

    public void setOrigcty(String origcty) {		
        this.origcty = origcty;				
    }								

    public Locality withOrigcty(String origcty) {				
        this.origcty = origcty;						
        return this;						
    }										

    public Integer getElevation() {		
        return elevation;				
    }							

    public void setElevation(Integer elevation) {		
        this.elevation = elevation;				
    }								

    public Locality withElevation(Integer elevation) {				
        this.elevation = elevation;						
        return this;						
    }										

    public Integer getLatitude() {		
        return latitude;				
    }							

    public void setLatitude(Integer latitude) {		
        this.latitude = latitude;				
    }								

    public Locality withLatitude(Integer latitude) {				
        this.latitude = latitude;						
        return this;						
    }										

    public Integer getLongitude() {		
        return longitude;				
    }							

    public void setLongitude(Integer longitude) {		
        this.longitude = longitude;				
    }								

    public Locality withLongitude(Integer longitude) {				
        this.longitude = longitude;						
        return this;						
    }										

    public String getLo_accession() {		
        return loAccession;				
    }							

    public void setLo_accession(String loAccession) {		
        this.loAccession = loAccession;				
    }								

    public Locality withLo_accession(String loAccession) {				
        this.loAccession = loAccession;						
        return this;						
    }										

}

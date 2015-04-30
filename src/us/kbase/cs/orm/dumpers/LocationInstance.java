package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class LocationInstance extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="index", type=ColumnType.INT)		
    private Integer index;									

    @Column(name="label", type=ColumnType.STRING)		
    private String label;									

    @Column(name="pH", type=ColumnType.FLOAT)		
    private Float pH;									

    @Column(name="potential", type=ColumnType.FLOAT)		
    private Float potential;									

    private LocationInstance() throws IOException{		
        super();							
    }										

    public static LocationInstance newDumper() throws IOException{	
        return new LocationInstance();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public LocationInstance withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public Integer getIndex() {		
        return index;				
    }							

    public void setIndex(Integer index) {		
        this.index = index;				
    }								

    public LocationInstance withIndex(Integer index) {				
        this.index = index;						
        return this;						
    }										

    public String getLabel() {		
        return label;				
    }							

    public void setLabel(String label) {		
        this.label = label;				
    }								

    public LocationInstance withLabel(String label) {				
        this.label = label;						
        return this;						
    }										

    public Float getPH() {		
        return pH;				
    }							

    public void setPH(Float pH) {		
        this.pH = pH;				
    }								

    public LocationInstance withPH(Float pH) {				
        this.pH = pH;						
        return this;						
    }										

    public Float getPotential() {		
        return potential;				
    }							

    public void setPotential(Float potential) {		
        this.potential = potential;				
    }								

    public LocationInstance withPotential(Float potential) {				
        this.potential = potential;						
        return this;						
    }										

}

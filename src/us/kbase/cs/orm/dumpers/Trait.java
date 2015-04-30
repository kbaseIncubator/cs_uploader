package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class Trait extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="trait_name", type=ColumnType.STRING)		
    private String traitName;									

    @Column(name="unit_of_measure", type=ColumnType.STRING)		
    private String unitOfMeasure;									

    @Column(name="TO_ID", type=ColumnType.STRING)		
    private String TOID;									

    @Column(name="protocol", type=ColumnType.TEXT)		
    private String protocol;									

    private Trait() throws IOException{		
        super();							
    }										

    public static Trait newDumper() throws IOException{	
        return new Trait();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public Trait withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public String getTrait_name() {		
        return traitName;				
    }							

    public void setTrait_name(String traitName) {		
        this.traitName = traitName;				
    }								

    public Trait withTrait_name(String traitName) {				
        this.traitName = traitName;						
        return this;						
    }										

    public String getUnit_of_measure() {		
        return unitOfMeasure;				
    }							

    public void setUnit_of_measure(String unitOfMeasure) {		
        this.unitOfMeasure = unitOfMeasure;				
    }								

    public Trait withUnit_of_measure(String unitOfMeasure) {				
        this.unitOfMeasure = unitOfMeasure;						
        return this;						
    }										

    public String getTO_ID() {		
        return TOID;				
    }							

    public void setTO_ID(String TOID) {		
        this.TOID = TOID;				
    }								

    public Trait withTO_ID(String TOID) {				
        this.TOID = TOID;						
        return this;						
    }										

    public String getProtocol() {		
        return protocol;				
    }							

    public void setProtocol(String protocol) {		
        this.protocol = protocol;				
    }								

    public Trait withProtocol(String protocol) {				
        this.protocol = protocol;						
        return this;						
    }										

}

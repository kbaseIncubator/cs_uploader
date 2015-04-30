package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class CompoundInstance extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="charge", type=ColumnType.FLOAT)		
    private Float charge;									

    @Column(name="formula", type=ColumnType.STRING)		
    private String formula;									

    private CompoundInstance() throws IOException{		
        super();							
    }										

    public static CompoundInstance newDumper() throws IOException{	
        return new CompoundInstance();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public CompoundInstance withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public Float getCharge() {		
        return charge;				
    }							

    public void setCharge(Float charge) {		
        this.charge = charge;				
    }								

    public CompoundInstance withCharge(Float charge) {				
        this.charge = charge;						
        return this;						
    }										

    public String getFormula() {		
        return formula;				
    }							

    public void setFormula(String formula) {		
        this.formula = formula;				
    }								

    public CompoundInstance withFormula(String formula) {				
        this.formula = formula;						
        return this;						
    }										

}

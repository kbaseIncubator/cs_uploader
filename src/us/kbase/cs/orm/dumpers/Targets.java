package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class Targets extends Dumper {  	

    @Column(name="from_link", type=ColumnType.STRING)		
    private String fromLink;									

    @Column(name="to_link", type=ColumnType.STRING)		
    private String toLink;									

    @Column(name="coefficient", type=ColumnType.FLOAT)		
    private Float coefficient;									

    private Targets() throws IOException{		
        super();							
    }										

    public static Targets newDumper() throws IOException{	
        return new Targets();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public Targets withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public String getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(String toLink) {		
        this.toLink = toLink;				
    }								

    public Targets withTo_link(String toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

    public Float getCoefficient() {		
        return coefficient;				
    }							

    public void setCoefficient(Float coefficient) {		
        this.coefficient = coefficient;				
    }								

    public Targets withCoefficient(Float coefficient) {				
        this.coefficient = coefficient;						
        return this;						
    }										

}

package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class IncludedIn extends Dumper {  	

    @Column(name="from_link", type=ColumnType.STRING)		
    private String fromLink;									

    @Column(name="to_link", type=ColumnType.STRING)		
    private String toLink;									

    @Column(name="concentration", type=ColumnType.FLOAT)		
    private Float concentration;									

    @Column(name="units", type=ColumnType.STRING)		
    private String units;									

    private IncludedIn() throws IOException{		
        super();							
    }										

    public static IncludedIn newDumper() throws IOException{	
        return new IncludedIn();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public IncludedIn withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public String getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(String toLink) {		
        this.toLink = toLink;				
    }								

    public IncludedIn withTo_link(String toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

    public Float getConcentration() {		
        return concentration;				
    }							

    public void setConcentration(Float concentration) {		
        this.concentration = concentration;				
    }								

    public IncludedIn withConcentration(Float concentration) {				
        this.concentration = concentration;						
        return this;						
    }										

    public String getUnits() {		
        return units;				
    }							

    public void setUnits(String units) {		
        this.units = units;				
    }								

    public IncludedIn withUnits(String units) {				
        this.units = units;						
        return this;						
    }										

}

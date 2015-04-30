package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class HasPresenceOf extends Dumper {  	

    @Column(name="from_link", type=ColumnType.STRING)		
    private String fromLink;									

    @Column(name="to_link", type=ColumnType.STRING)		
    private String toLink;									

    @Column(name="concentration", type=ColumnType.FLOAT)		
    private Float concentration;									

    @Column(name="minimum_flux", type=ColumnType.FLOAT)		
    private Float minimumFlux;									

    @Column(name="maximum_flux", type=ColumnType.FLOAT)		
    private Float maximumFlux;									

    private HasPresenceOf() throws IOException{		
        super();							
    }										

    public static HasPresenceOf newDumper() throws IOException{	
        return new HasPresenceOf();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public HasPresenceOf withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public String getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(String toLink) {		
        this.toLink = toLink;				
    }								

    public HasPresenceOf withTo_link(String toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

    public Float getConcentration() {		
        return concentration;				
    }							

    public void setConcentration(Float concentration) {		
        this.concentration = concentration;				
    }								

    public HasPresenceOf withConcentration(Float concentration) {				
        this.concentration = concentration;						
        return this;						
    }										

    public Float getMinimum_flux() {		
        return minimumFlux;				
    }							

    public void setMinimum_flux(Float minimumFlux) {		
        this.minimumFlux = minimumFlux;				
    }								

    public HasPresenceOf withMinimum_flux(Float minimumFlux) {				
        this.minimumFlux = minimumFlux;						
        return this;						
    }										

    public Float getMaximum_flux() {		
        return maximumFlux;				
    }							

    public void setMaximum_flux(Float maximumFlux) {		
        this.maximumFlux = maximumFlux;				
    }								

    public HasPresenceOf withMaximum_flux(Float maximumFlux) {				
        this.maximumFlux = maximumFlux;						
        return this;						
    }										

}

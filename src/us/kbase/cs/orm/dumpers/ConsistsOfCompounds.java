package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class ConsistsOfCompounds extends Dumper {  	

    @Column(name="from_link", type=ColumnType.STRING)		
    private String fromLink;									

    @Column(name="to_link", type=ColumnType.STRING)		
    private String toLink;									

    @Column(name="molar_ratio", type=ColumnType.FLOAT)		
    private Float molarRatio;									

    private ConsistsOfCompounds() throws IOException{		
        super();							
    }										

    public static ConsistsOfCompounds newDumper() throws IOException{	
        return new ConsistsOfCompounds();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public ConsistsOfCompounds withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public String getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(String toLink) {		
        this.toLink = toLink;				
    }								

    public ConsistsOfCompounds withTo_link(String toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

    public Float getMolar_ratio() {		
        return molarRatio;				
    }							

    public void setMolar_ratio(Float molarRatio) {		
        this.molarRatio = molarRatio;				
    }								

    public ConsistsOfCompounds withMolar_ratio(Float molarRatio) {				
        this.molarRatio = molarRatio;						
        return this;						
    }										

}

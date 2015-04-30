package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class ComponentOf extends Dumper {  	

    @Column(name="from_link", type=ColumnType.STRING)		
    private String fromLink;									

    @Column(name="to_link", type=ColumnType.STRING)		
    private String toLink;									

    @Column(name="molar_ratio", type=ColumnType.FLOAT)		
    private Float molarRatio;									

    private ComponentOf() throws IOException{		
        super();							
    }										

    public static ComponentOf newDumper() throws IOException{	
        return new ComponentOf();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public ComponentOf withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public String getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(String toLink) {		
        this.toLink = toLink;				
    }								

    public ComponentOf withTo_link(String toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

    public Float getMolar_ratio() {		
        return molarRatio;				
    }							

    public void setMolar_ratio(Float molarRatio) {		
        this.molarRatio = molarRatio;				
    }								

    public ComponentOf withMolar_ratio(Float molarRatio) {				
        this.molarRatio = molarRatio;						
        return this;						
    }										

}

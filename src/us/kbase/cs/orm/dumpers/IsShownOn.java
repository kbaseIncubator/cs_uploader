package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class IsShownOn extends Dumper {  	

    @Column(name="from_link", type=ColumnType.STRING)		
    private String fromLink;									

    @Column(name="to_link", type=ColumnType.STRING)		
    private String toLink;									

    @Column(name="location", type=ColumnType.UNSUPPORTED)		
    private Object location;									

    private IsShownOn() throws IOException{		
        super();							
    }										

    public static IsShownOn newDumper() throws IOException{	
        return new IsShownOn();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public IsShownOn withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public String getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(String toLink) {		
        this.toLink = toLink;				
    }								

    public IsShownOn withTo_link(String toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

    public Object getLocation() {		
        return location;				
    }							

    public void setLocation(Object location) {		
        this.location = location;				
    }								

    public IsShownOn withLocation(Object location) {				
        this.location = location;						
        return this;						
    }										

}

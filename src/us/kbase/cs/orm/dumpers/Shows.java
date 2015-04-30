package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class Shows extends Dumper {  	

    @Column(name="from_link", type=ColumnType.STRING)		
    private String fromLink;									

    @Column(name="to_link", type=ColumnType.STRING)		
    private String toLink;									

    @Column(name="location", type=ColumnType.UNSUPPORTED)		
    private Object location;									

    private Shows() throws IOException{		
        super();							
    }										

    public static Shows newDumper() throws IOException{	
        return new Shows();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public Shows withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public String getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(String toLink) {		
        this.toLink = toLink;				
    }								

    public Shows withTo_link(String toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

    public Object getLocation() {		
        return location;				
    }							

    public void setLocation(Object location) {		
        this.location = location;				
    }								

    public Shows withLocation(Object location) {				
        this.location = location;						
        return this;						
    }										

}

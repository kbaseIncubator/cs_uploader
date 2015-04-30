package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class Determines extends Dumper {  	

    @Column(name="from_link", type=ColumnType.STRING)		
    private String fromLink;									

    @Column(name="to_link", type=ColumnType.STRING)		
    private String toLink;									

    @Column(name="inverted", type=ColumnType.BOOLEAN)		
    private Byte inverted;									

    private Determines() throws IOException{		
        super();							
    }										

    public static Determines newDumper() throws IOException{	
        return new Determines();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public Determines withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public String getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(String toLink) {		
        this.toLink = toLink;				
    }								

    public Determines withTo_link(String toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

    public Byte getInverted() {		
        return inverted;				
    }							

    public void setInverted(Byte inverted) {		
        this.inverted = inverted;				
    }								

    public Determines withInverted(Byte inverted) {				
        this.inverted = inverted;						
        return this;						
    }										

}

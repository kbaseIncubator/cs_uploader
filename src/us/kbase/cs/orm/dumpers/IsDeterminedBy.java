package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class IsDeterminedBy extends Dumper {  	

    @Column(name="from_link", type=ColumnType.STRING)		
    private String fromLink;									

    @Column(name="to_link", type=ColumnType.STRING)		
    private String toLink;									

    @Column(name="inverted", type=ColumnType.BOOLEAN)		
    private Byte inverted;									

    private IsDeterminedBy() throws IOException{		
        super();							
    }										

    public static IsDeterminedBy newDumper() throws IOException{	
        return new IsDeterminedBy();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public IsDeterminedBy withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public String getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(String toLink) {		
        this.toLink = toLink;				
    }								

    public IsDeterminedBy withTo_link(String toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

    public Byte getInverted() {		
        return inverted;				
    }							

    public void setInverted(Byte inverted) {		
        this.inverted = inverted;				
    }								

    public IsDeterminedBy withInverted(Byte inverted) {				
        this.inverted = inverted;						
        return this;						
    }										

}

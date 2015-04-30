package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class DefinedBy extends Dumper {  	

    @Column(name="from_link", type=ColumnType.STRING)		
    private String fromLink;									

    @Column(name="to_link", type=ColumnType.COUNTER)		
    private Long toLink;									

    private DefinedBy() throws IOException{		
        super();							
    }										

    public static DefinedBy newDumper() throws IOException{	
        return new DefinedBy();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public DefinedBy withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public Long getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(Long toLink) {		
        this.toLink = toLink;				
    }								

    public DefinedBy withTo_link(Long toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

}

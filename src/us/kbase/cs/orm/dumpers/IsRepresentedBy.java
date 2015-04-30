package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class IsRepresentedBy extends Dumper {  	

    @Column(name="from_link", type=ColumnType.COUNTER)		
    private Long fromLink;									

    @Column(name="to_link", type=ColumnType.STRING)		
    private String toLink;									

    private IsRepresentedBy() throws IOException{		
        super();							
    }										

    public static IsRepresentedBy newDumper() throws IOException{	
        return new IsRepresentedBy();			
    }								

    public Long getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(Long fromLink) {		
        this.fromLink = fromLink;				
    }								

    public IsRepresentedBy withFrom_link(Long fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public String getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(String toLink) {		
        this.toLink = toLink;				
    }								

    public IsRepresentedBy withTo_link(String toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

}

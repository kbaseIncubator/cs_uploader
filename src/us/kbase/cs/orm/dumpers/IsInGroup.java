package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class IsInGroup extends Dumper {  	

    @Column(name="from_link", type=ColumnType.COUNTER)		
    private Long fromLink;									

    @Column(name="to_link", type=ColumnType.COUNTER)		
    private Long toLink;									

    private IsInGroup() throws IOException{		
        super();							
    }										

    public static IsInGroup newDumper() throws IOException{	
        return new IsInGroup();			
    }								

    public Long getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(Long fromLink) {		
        this.fromLink = fromLink;				
    }								

    public IsInGroup withFrom_link(Long fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public Long getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(Long toLink) {		
        this.toLink = toLink;				
    }								

    public IsInGroup withTo_link(Long toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

}

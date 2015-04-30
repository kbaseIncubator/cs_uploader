package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class IsSubInstanceOf extends Dumper {  	

    @Column(name="from_link", type=ColumnType.STRING)		
    private String fromLink;									

    @Column(name="to_link", type=ColumnType.INT)		
    private Integer toLink;									

    private IsSubInstanceOf() throws IOException{		
        super();							
    }										

    public static IsSubInstanceOf newDumper() throws IOException{	
        return new IsSubInstanceOf();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public IsSubInstanceOf withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public Integer getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(Integer toLink) {		
        this.toLink = toLink;				
    }								

    public IsSubInstanceOf withTo_link(Integer toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

}

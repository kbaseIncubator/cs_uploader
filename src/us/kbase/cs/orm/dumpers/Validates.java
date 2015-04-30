package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class Validates extends Dumper {  	

    @Column(name="from_link", type=ColumnType.INT)		
    private Integer fromLink;									

    @Column(name="to_link", type=ColumnType.STRING)		
    private String toLink;									

    private Validates() throws IOException{		
        super();							
    }										

    public static Validates newDumper() throws IOException{	
        return new Validates();			
    }								

    public Integer getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(Integer fromLink) {		
        this.fromLink = fromLink;				
    }								

    public Validates withFrom_link(Integer fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public String getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(String toLink) {		
        this.toLink = toLink;				
    }								

    public Validates withTo_link(String toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

}

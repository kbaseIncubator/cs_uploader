package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class OperonContains extends Dumper {  	

    @Column(name="from_link", type=ColumnType.STRING)		
    private String fromLink;									

    @Column(name="to_link", type=ColumnType.STRING)		
    private String toLink;									

    @Column(name="rank", type=ColumnType.INT)		
    private Integer rank;									

    private OperonContains() throws IOException{		
        super();							
    }										

    public static OperonContains newDumper() throws IOException{	
        return new OperonContains();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public OperonContains withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public String getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(String toLink) {		
        this.toLink = toLink;				
    }								

    public OperonContains withTo_link(String toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

    public Integer getRank() {		
        return rank;				
    }							

    public void setRank(Integer rank) {		
        this.rank = rank;				
    }								

    public OperonContains withRank(Integer rank) {				
        this.rank = rank;						
        return this;						
    }										

}

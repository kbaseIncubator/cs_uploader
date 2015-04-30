package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class IsInOperon extends Dumper {  	

    @Column(name="from_link", type=ColumnType.STRING)		
    private String fromLink;									

    @Column(name="to_link", type=ColumnType.STRING)		
    private String toLink;									

    @Column(name="rank", type=ColumnType.INT)		
    private Integer rank;									

    private IsInOperon() throws IOException{		
        super();							
    }										

    public static IsInOperon newDumper() throws IOException{	
        return new IsInOperon();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public IsInOperon withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public String getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(String toLink) {		
        this.toLink = toLink;				
    }								

    public IsInOperon withTo_link(String toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

    public Integer getRank() {		
        return rank;				
    }							

    public void setRank(Integer rank) {		
        this.rank = rank;				
    }								

    public IsInOperon withRank(Integer rank) {				
        this.rank = rank;						
        return this;						
    }										

}

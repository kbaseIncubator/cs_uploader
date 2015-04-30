package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class IsSummarizedBy extends Dumper {  	

    @Column(name="from_link", type=ColumnType.STRING)		
    private String fromLink;									

    @Column(name="to_link", type=ColumnType.STRING)		
    private String toLink;									

    @Column(name="position", type=ColumnType.INT)		
    private Integer position;									

    private IsSummarizedBy() throws IOException{		
        super();							
    }										

    public static IsSummarizedBy newDumper() throws IOException{	
        return new IsSummarizedBy();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public IsSummarizedBy withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public String getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(String toLink) {		
        this.toLink = toLink;				
    }								

    public IsSummarizedBy withTo_link(String toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

    public Integer getPosition() {		
        return position;				
    }							

    public void setPosition(Integer position) {		
        this.position = position;				
    }								

    public IsSummarizedBy withPosition(Integer position) {				
        this.position = position;						
        return this;						
    }										

}

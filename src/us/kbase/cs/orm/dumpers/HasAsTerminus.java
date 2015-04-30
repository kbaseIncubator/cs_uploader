package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class HasAsTerminus extends Dumper {  	

    @Column(name="from_link", type=ColumnType.INT)		
    private Integer fromLink;									

    @Column(name="to_link", type=ColumnType.STRING)		
    private String toLink;									

    @Column(name="group_number", type=ColumnType.INT)		
    private Integer groupNumber;									

    private HasAsTerminus() throws IOException{		
        super();							
    }										

    public static HasAsTerminus newDumper() throws IOException{	
        return new HasAsTerminus();			
    }								

    public Integer getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(Integer fromLink) {		
        this.fromLink = fromLink;				
    }								

    public HasAsTerminus withFrom_link(Integer fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public String getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(String toLink) {		
        this.toLink = toLink;				
    }								

    public HasAsTerminus withTo_link(String toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

    public Integer getGroup_number() {		
        return groupNumber;				
    }							

    public void setGroup_number(Integer groupNumber) {		
        this.groupNumber = groupNumber;				
    }								

    public HasAsTerminus withGroup_number(Integer groupNumber) {				
        this.groupNumber = groupNumber;						
        return this;						
    }										

}

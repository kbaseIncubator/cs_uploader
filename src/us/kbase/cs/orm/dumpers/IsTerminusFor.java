package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class IsTerminusFor extends Dumper {  	

    @Column(name="from_link", type=ColumnType.STRING)		
    private String fromLink;									

    @Column(name="to_link", type=ColumnType.INT)		
    private Integer toLink;									

    @Column(name="group_number", type=ColumnType.INT)		
    private Integer groupNumber;									

    private IsTerminusFor() throws IOException{		
        super();							
    }										

    public static IsTerminusFor newDumper() throws IOException{	
        return new IsTerminusFor();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public IsTerminusFor withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public Integer getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(Integer toLink) {		
        this.toLink = toLink;				
    }								

    public IsTerminusFor withTo_link(Integer toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

    public Integer getGroup_number() {		
        return groupNumber;				
    }							

    public void setGroup_number(Integer groupNumber) {		
        this.groupNumber = groupNumber;				
    }								

    public IsTerminusFor withGroup_number(Integer groupNumber) {				
        this.groupNumber = groupNumber;						
        return this;						
    }										

}

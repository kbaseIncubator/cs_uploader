package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class HasAlignmentAttribute extends Dumper {  	

    @Column(name="from_link", type=ColumnType.STRING)		
    private String fromLink;									

    @Column(name="to_link", type=ColumnType.STRING)		
    private String toLink;									

    @Column(name="value", type=ColumnType.STRING)		
    private String value;									

    private HasAlignmentAttribute() throws IOException{		
        super();							
    }										

    public static HasAlignmentAttribute newDumper() throws IOException{	
        return new HasAlignmentAttribute();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public HasAlignmentAttribute withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public String getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(String toLink) {		
        this.toLink = toLink;				
    }								

    public HasAlignmentAttribute withTo_link(String toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

    public String getValue() {		
        return value;				
    }							

    public void setValue(String value) {		
        this.value = value;				
    }								

    public HasAlignmentAttribute withValue(String value) {				
        this.value = value;						
        return this;						
    }										

}

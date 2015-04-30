package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class HasParticipant extends Dumper {  	

    @Column(name="from_link", type=ColumnType.INT)		
    private Integer fromLink;									

    @Column(name="to_link", type=ColumnType.STRING)		
    private String toLink;									

    @Column(name="type", type=ColumnType.INT)		
    private Integer type;									

    private HasParticipant() throws IOException{		
        super();							
    }										

    public static HasParticipant newDumper() throws IOException{	
        return new HasParticipant();			
    }								

    public Integer getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(Integer fromLink) {		
        this.fromLink = fromLink;				
    }								

    public HasParticipant withFrom_link(Integer fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public String getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(String toLink) {		
        this.toLink = toLink;				
    }								

    public HasParticipant withTo_link(String toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

    public Integer getType() {		
        return type;				
    }							

    public void setType(Integer type) {		
        this.type = type;				
    }								

    public HasParticipant withType(Integer type) {				
        this.type = type;						
        return this;						
    }										

}

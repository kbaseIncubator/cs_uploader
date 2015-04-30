package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class ParticipatesIn extends Dumper {  	

    @Column(name="from_link", type=ColumnType.STRING)		
    private String fromLink;									

    @Column(name="to_link", type=ColumnType.INT)		
    private Integer toLink;									

    @Column(name="type", type=ColumnType.INT)		
    private Integer type;									

    private ParticipatesIn() throws IOException{		
        super();							
    }										

    public static ParticipatesIn newDumper() throws IOException{	
        return new ParticipatesIn();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public ParticipatesIn withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public Integer getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(Integer toLink) {		
        this.toLink = toLink;				
    }								

    public ParticipatesIn withTo_link(Integer toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

    public Integer getType() {		
        return type;				
    }							

    public void setType(Integer type) {		
        this.type = type;				
    }								

    public ParticipatesIn withType(Integer type) {				
        this.type = type;						
        return this;						
    }										

}

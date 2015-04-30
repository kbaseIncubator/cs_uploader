package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class IsTriggeredBy extends Dumper {  	

    @Column(name="from_link", type=ColumnType.STRING)		
    private String fromLink;									

    @Column(name="to_link", type=ColumnType.STRING)		
    private String toLink;									

    @Column(name="optional", type=ColumnType.BOOLEAN)		
    private Byte optional;									

    @Column(name="type", type=ColumnType.STRING)		
    private String type;									

    @Column(name="triggering", type=ColumnType.BOOLEAN)		
    private Byte triggering;									

    private IsTriggeredBy() throws IOException{		
        super();							
    }										

    public static IsTriggeredBy newDumper() throws IOException{	
        return new IsTriggeredBy();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public IsTriggeredBy withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public String getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(String toLink) {		
        this.toLink = toLink;				
    }								

    public IsTriggeredBy withTo_link(String toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

    public Byte getOptional() {		
        return optional;				
    }							

    public void setOptional(Byte optional) {		
        this.optional = optional;				
    }								

    public IsTriggeredBy withOptional(Byte optional) {				
        this.optional = optional;						
        return this;						
    }										

    public String getType() {		
        return type;				
    }							

    public void setType(String type) {		
        this.type = type;				
    }								

    public IsTriggeredBy withType(String type) {				
        this.type = type;						
        return this;						
    }										

    public Byte getTriggering() {		
        return triggering;				
    }							

    public void setTriggering(Byte triggering) {		
        this.triggering = triggering;				
    }								

    public IsTriggeredBy withTriggering(Byte triggering) {				
        this.triggering = triggering;						
        return this;						
    }										

}

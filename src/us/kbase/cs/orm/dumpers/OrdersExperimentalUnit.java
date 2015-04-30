package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class OrdersExperimentalUnit extends Dumper {  	

    @Column(name="from_link", type=ColumnType.STRING)		
    private String fromLink;									

    @Column(name="to_link", type=ColumnType.STRING)		
    private String toLink;									

    @Column(name="time", type=ColumnType.FLOAT)		
    private Float time;									

    @Column(name="timeMeta", type=ColumnType.SEMI_BOOLEAN)		
    private Character timeMeta;									

    private OrdersExperimentalUnit() throws IOException{		
        super();							
    }										

    public static OrdersExperimentalUnit newDumper() throws IOException{	
        return new OrdersExperimentalUnit();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public OrdersExperimentalUnit withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public String getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(String toLink) {		
        this.toLink = toLink;				
    }								

    public OrdersExperimentalUnit withTo_link(String toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

    public Float getTime() {		
        return time;				
    }							

    public void setTime(Float time) {		
        this.time = time;				
    }								

    public OrdersExperimentalUnit withTime(Float time) {				
        this.time = time;						
        return this;						
    }										

    public Character getTimeMeta() {		
        return timeMeta;				
    }							

    public void setTimeMeta(Character timeMeta) {		
        this.timeMeta = timeMeta;				
    }								

    public OrdersExperimentalUnit withTimeMeta(Character timeMeta) {				
        this.timeMeta = timeMeta;						
        return this;						
    }										

}

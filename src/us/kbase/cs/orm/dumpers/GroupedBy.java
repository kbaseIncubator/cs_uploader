package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class GroupedBy extends Dumper {  	

    @Column(name="from_link", type=ColumnType.STRING)		
    private String fromLink;									

    @Column(name="to_link", type=ColumnType.STRING)		
    private String toLink;									

    @Column(name="location", type=ColumnType.STRING)		
    private String location;									

    @Column(name="groupMeta", type=ColumnType.SEMI_BOOLEAN)		
    private Character groupMeta;									

    private GroupedBy() throws IOException{		
        super();							
    }										

    public static GroupedBy newDumper() throws IOException{	
        return new GroupedBy();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public GroupedBy withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public String getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(String toLink) {		
        this.toLink = toLink;				
    }								

    public GroupedBy withTo_link(String toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

    public String getLocation() {		
        return location;				
    }							

    public void setLocation(String location) {		
        this.location = location;				
    }								

    public GroupedBy withLocation(String location) {				
        this.location = location;						
        return this;						
    }										

    public Character getGroupMeta() {		
        return groupMeta;				
    }							

    public void setGroupMeta(Character groupMeta) {		
        this.groupMeta = groupMeta;				
    }								

    public GroupedBy withGroupMeta(Character groupMeta) {				
        this.groupMeta = groupMeta;						
        return this;						
    }										

}

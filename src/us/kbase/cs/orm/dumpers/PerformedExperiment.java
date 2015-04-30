package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class PerformedExperiment extends Dumper {  	

    @Column(name="from_link", type=ColumnType.STRING)		
    private String fromLink;									

    @Column(name="to_link", type=ColumnType.STRING)		
    private String toLink;									

    @Column(name="role", type=ColumnType.STRING)		
    private String role;									

    private PerformedExperiment() throws IOException{		
        super();							
    }										

    public static PerformedExperiment newDumper() throws IOException{	
        return new PerformedExperiment();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public PerformedExperiment withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public String getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(String toLink) {		
        this.toLink = toLink;				
    }								

    public PerformedExperiment withTo_link(String toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

    public String getRole() {		
        return role;				
    }							

    public void setRole(String role) {		
        this.role = role;				
    }								

    public PerformedExperiment withRole(String role) {				
        this.role = role;						
        return this;						
    }										

}

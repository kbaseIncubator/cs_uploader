package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class SampleBelongsToExperimentalUnit extends Dumper {  	

    @Column(name="from_link", type=ColumnType.STRING)		
    private String fromLink;									

    @Column(name="to_link", type=ColumnType.STRING)		
    private String toLink;									

    private SampleBelongsToExperimentalUnit() throws IOException{		
        super();							
    }										

    public static SampleBelongsToExperimentalUnit newDumper() throws IOException{	
        return new SampleBelongsToExperimentalUnit();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public SampleBelongsToExperimentalUnit withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public String getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(String toLink) {		
        this.toLink = toLink;				
    }								

    public SampleBelongsToExperimentalUnit withTo_link(String toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

}

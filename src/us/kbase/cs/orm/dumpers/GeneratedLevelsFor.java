package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class GeneratedLevelsFor extends Dumper {  	

    @Column(name="from_link", type=ColumnType.STRING)		
    private String fromLink;									

    @Column(name="to_link", type=ColumnType.STRING)		
    private String toLink;									

    @Column(name="level_vector", type=ColumnType.UNSUPPORTED)		
    private Object levelVector;									

    private GeneratedLevelsFor() throws IOException{		
        super();							
    }										

    public static GeneratedLevelsFor newDumper() throws IOException{	
        return new GeneratedLevelsFor();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public GeneratedLevelsFor withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public String getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(String toLink) {		
        this.toLink = toLink;				
    }								

    public GeneratedLevelsFor withTo_link(String toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

    public Object getLevel_vector() {		
        return levelVector;				
    }							

    public void setLevel_vector(Object levelVector) {		
        this.levelVector = levelVector;				
    }								

    public GeneratedLevelsFor withLevel_vector(Object levelVector) {				
        this.levelVector = levelVector;						
        return this;						
    }										

}

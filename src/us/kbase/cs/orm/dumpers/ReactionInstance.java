package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class ReactionInstance extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="direction", type=ColumnType.CHAR)		
    private Character direction;									

    @Column(name="protons", type=ColumnType.FLOAT)		
    private Float protons;									

    private ReactionInstance() throws IOException{		
        super();							
    }										

    public static ReactionInstance newDumper() throws IOException{	
        return new ReactionInstance();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public ReactionInstance withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public Character getDirection() {		
        return direction;				
    }							

    public void setDirection(Character direction) {		
        this.direction = direction;				
    }								

    public ReactionInstance withDirection(Character direction) {				
        this.direction = direction;						
        return this;						
    }										

    public Float getProtons() {		
        return protons;				
    }							

    public void setProtons(Float protons) {		
        this.protons = protons;				
    }								

    public ReactionInstance withProtons(Float protons) {				
        this.protons = protons;						
        return this;						
    }										

}

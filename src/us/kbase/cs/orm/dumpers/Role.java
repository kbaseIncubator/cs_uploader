package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class Role extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="hypothetical", type=ColumnType.BOOLEAN)		
    private Byte hypothetical;									

    private Role() throws IOException{		
        super();							
    }										

    public static Role newDumper() throws IOException{	
        return new Role();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public Role withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public Byte getHypothetical() {		
        return hypothetical;				
    }							

    public void setHypothetical(Byte hypothetical) {		
        this.hypothetical = hypothetical;				
    }								

    public Role withHypothetical(Byte hypothetical) {				
        this.hypothetical = hypothetical;						
        return this;						
    }										

}

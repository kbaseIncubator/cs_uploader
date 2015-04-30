package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class Effector extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="name", type=ColumnType.STRING)		
    private String name;									

    @Column(name="effector_class", type=ColumnType.STRING)		
    private String effectorClass;									

    private Effector() throws IOException{		
        super();							
    }										

    public static Effector newDumper() throws IOException{	
        return new Effector();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public Effector withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public String getName() {		
        return name;				
    }							

    public void setName(String name) {		
        this.name = name;				
    }								

    public Effector withName(String name) {				
        this.name = name;						
        return this;						
    }										

    public String getEffector_class() {		
        return effectorClass;				
    }							

    public void setEffector_class(String effectorClass) {		
        this.effectorClass = effectorClass;				
    }								

    public Effector withEffector_class(String effectorClass) {				
        this.effectorClass = effectorClass;						
        return this;						
    }										

}

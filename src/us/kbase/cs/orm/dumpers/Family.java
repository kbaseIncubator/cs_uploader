package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class Family extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="type", type=ColumnType.STRING)		
    private String type;									

    @Column(name="release", type=ColumnType.STRING)		
    private String release;									

    @Column(name="family_function", type=ColumnType.TEXT)		
    private String familyFunction;									

    @Column(name="alignment", type=ColumnType.TEXT)		
    private String alignment;									

    private Family() throws IOException{		
        super();							
    }										

    public static Family newDumper() throws IOException{	
        return new Family();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public Family withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public String getType() {		
        return type;				
    }							

    public void setType(String type) {		
        this.type = type;				
    }								

    public Family withType(String type) {				
        this.type = type;						
        return this;						
    }										

    public String getRelease() {		
        return release;				
    }							

    public void setRelease(String release) {		
        this.release = release;				
    }								

    public Family withRelease(String release) {				
        this.release = release;						
        return this;						
    }										

    public String getFamily_function() {		
        return familyFunction;				
    }							

    public void setFamily_function(String familyFunction) {		
        this.familyFunction = familyFunction;				
    }								

    public Family withFamily_function(String familyFunction) {				
        this.familyFunction = familyFunction;						
        return this;						
    }										

    public String getAlignment() {		
        return alignment;				
    }							

    public void setAlignment(String alignment) {		
        this.alignment = alignment;				
    }								

    public Family withAlignment(String alignment) {				
        this.alignment = alignment;						
        return this;						
    }										

}

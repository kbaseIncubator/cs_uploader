package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class IsModifiedToBuildAlignment extends Dumper {  	

    @Column(name="from_link", type=ColumnType.STRING)		
    private String fromLink;									

    @Column(name="to_link", type=ColumnType.STRING)		
    private String toLink;									

    @Column(name="modification_type", type=ColumnType.STRING)		
    private String modificationType;									

    @Column(name="modification_value", type=ColumnType.STRING)		
    private String modificationValue;									

    private IsModifiedToBuildAlignment() throws IOException{		
        super();							
    }										

    public static IsModifiedToBuildAlignment newDumper() throws IOException{	
        return new IsModifiedToBuildAlignment();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public IsModifiedToBuildAlignment withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public String getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(String toLink) {		
        this.toLink = toLink;				
    }								

    public IsModifiedToBuildAlignment withTo_link(String toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

    public String getModification_type() {		
        return modificationType;				
    }							

    public void setModification_type(String modificationType) {		
        this.modificationType = modificationType;				
    }								

    public IsModifiedToBuildAlignment withModification_type(String modificationType) {				
        this.modificationType = modificationType;						
        return this;						
    }										

    public String getModification_value() {		
        return modificationValue;				
    }							

    public void setModification_value(String modificationValue) {		
        this.modificationValue = modificationValue;				
    }								

    public IsModifiedToBuildAlignment withModification_value(String modificationValue) {				
        this.modificationValue = modificationValue;						
        return this;						
    }										

}

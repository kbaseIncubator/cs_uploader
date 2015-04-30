package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class IsModifiedToBuildTree extends Dumper {  	

    @Column(name="from_link", type=ColumnType.STRING)		
    private String fromLink;									

    @Column(name="to_link", type=ColumnType.STRING)		
    private String toLink;									

    @Column(name="modification_type", type=ColumnType.STRING)		
    private String modificationType;									

    @Column(name="modification_value", type=ColumnType.STRING)		
    private String modificationValue;									

    private IsModifiedToBuildTree() throws IOException{		
        super();							
    }										

    public static IsModifiedToBuildTree newDumper() throws IOException{	
        return new IsModifiedToBuildTree();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public IsModifiedToBuildTree withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public String getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(String toLink) {		
        this.toLink = toLink;				
    }								

    public IsModifiedToBuildTree withTo_link(String toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

    public String getModification_type() {		
        return modificationType;				
    }							

    public void setModification_type(String modificationType) {		
        this.modificationType = modificationType;				
    }								

    public IsModifiedToBuildTree withModification_type(String modificationType) {				
        this.modificationType = modificationType;						
        return this;						
    }										

    public String getModification_value() {		
        return modificationValue;				
    }							

    public void setModification_value(String modificationValue) {		
        this.modificationValue = modificationValue;				
    }								

    public IsModifiedToBuildTree withModification_value(String modificationValue) {				
        this.modificationValue = modificationValue;						
        return this;						
    }										

}

package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class HasAssociationDataset extends Dumper {  	

    @Column(name="from_link", type=ColumnType.STRING)		
    private String fromLink;									

    @Column(name="to_link", type=ColumnType.STRING)		
    private String toLink;									

    private HasAssociationDataset() throws IOException{		
        super();							
    }										

    public static HasAssociationDataset newDumper() throws IOException{	
        return new HasAssociationDataset();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public HasAssociationDataset withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public String getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(String toLink) {		
        this.toLink = toLink;				
    }								

    public HasAssociationDataset withTo_link(String toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

}

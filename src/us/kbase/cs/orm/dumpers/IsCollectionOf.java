package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class IsCollectionOf extends Dumper {  	

    @Column(name="from_link", type=ColumnType.STRING)		
    private String fromLink;									

    @Column(name="to_link", type=ColumnType.STRING)		
    private String toLink;									

    @Column(name="representative", type=ColumnType.BOOLEAN)		
    private Byte representative;									

    private IsCollectionOf() throws IOException{		
        super();							
    }										

    public static IsCollectionOf newDumper() throws IOException{	
        return new IsCollectionOf();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public IsCollectionOf withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public String getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(String toLink) {		
        this.toLink = toLink;				
    }								

    public IsCollectionOf withTo_link(String toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

    public Byte getRepresentative() {		
        return representative;				
    }							

    public void setRepresentative(Byte representative) {		
        this.representative = representative;				
    }								

    public IsCollectionOf withRepresentative(Byte representative) {				
        this.representative = representative;						
        return this;						
    }										

}

package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class IsAffectedIn extends Dumper {  	

    @Column(name="from_link", type=ColumnType.STRING)		
    private String fromLink;									

    @Column(name="to_link", type=ColumnType.STRING)		
    private String toLink;									

    @Column(name="level", type=ColumnType.INT)		
    private Integer level;									

    private IsAffectedIn() throws IOException{		
        super();							
    }										

    public static IsAffectedIn newDumper() throws IOException{	
        return new IsAffectedIn();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public IsAffectedIn withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public String getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(String toLink) {		
        this.toLink = toLink;				
    }								

    public IsAffectedIn withTo_link(String toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

    public Integer getLevel() {		
        return level;				
    }							

    public void setLevel(Integer level) {		
        this.level = level;				
    }								

    public IsAffectedIn withLevel(Integer level) {				
        this.level = level;						
        return this;						
    }										

}

package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class HasAliasAssertedFrom extends Dumper {  	

    @Column(name="from_link", type=ColumnType.STRING)		
    private String fromLink;									

    @Column(name="to_link", type=ColumnType.STRING)		
    private String toLink;									

    @Column(name="alias", type=ColumnType.TEXT)		
    private String alias;									

    private HasAliasAssertedFrom() throws IOException{		
        super();							
    }										

    public static HasAliasAssertedFrom newDumper() throws IOException{	
        return new HasAliasAssertedFrom();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public HasAliasAssertedFrom withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public String getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(String toLink) {		
        this.toLink = toLink;				
    }								

    public HasAliasAssertedFrom withTo_link(String toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

    public String getAlias() {		
        return alias;				
    }							

    public void setAlias(String alias) {		
        this.alias = alias;				
    }								

    public HasAliasAssertedFrom withAlias(String alias) {				
        this.alias = alias;						
        return this;						
    }										

}

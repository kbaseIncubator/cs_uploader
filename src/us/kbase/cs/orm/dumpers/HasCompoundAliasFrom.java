package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class HasCompoundAliasFrom extends Dumper {  	

    @Column(name="from_link", type=ColumnType.STRING)		
    private String fromLink;									

    @Column(name="to_link", type=ColumnType.STRING)		
    private String toLink;									

    @Column(name="alias", type=ColumnType.STRING)		
    private String alias;									

    private HasCompoundAliasFrom() throws IOException{		
        super();							
    }										

    public static HasCompoundAliasFrom newDumper() throws IOException{	
        return new HasCompoundAliasFrom();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public HasCompoundAliasFrom withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public String getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(String toLink) {		
        this.toLink = toLink;				
    }								

    public HasCompoundAliasFrom withTo_link(String toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

    public String getAlias() {		
        return alias;				
    }							

    public void setAlias(String alias) {		
        this.alias = alias;				
    }								

    public HasCompoundAliasFrom withAlias(String alias) {				
        this.alias = alias;						
        return this;						
    }										

}

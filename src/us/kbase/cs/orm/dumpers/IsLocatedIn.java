package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class IsLocatedIn extends Dumper {  	

    @Column(name="from_link", type=ColumnType.STRING)		
    private String fromLink;									

    @Column(name="to_link", type=ColumnType.STRING)		
    private String toLink;									

    @Column(name="ordinal", type=ColumnType.INT)		
    private Integer ordinal;									

    @Column(name="begin", type=ColumnType.INT)		
    private Integer begin;									

    @Column(name="len", type=ColumnType.INT)		
    private Integer len;									

    @Column(name="dir", type=ColumnType.CHAR)		
    private Character dir;									

    private IsLocatedIn() throws IOException{		
        super();							
    }										

    public static IsLocatedIn newDumper() throws IOException{	
        return new IsLocatedIn();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public IsLocatedIn withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public String getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(String toLink) {		
        this.toLink = toLink;				
    }								

    public IsLocatedIn withTo_link(String toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

    public Integer getOrdinal() {		
        return ordinal;				
    }							

    public void setOrdinal(Integer ordinal) {		
        this.ordinal = ordinal;				
    }								

    public IsLocatedIn withOrdinal(Integer ordinal) {				
        this.ordinal = ordinal;						
        return this;						
    }										

    public Integer getBegin() {		
        return begin;				
    }							

    public void setBegin(Integer begin) {		
        this.begin = begin;				
    }								

    public IsLocatedIn withBegin(Integer begin) {				
        this.begin = begin;						
        return this;						
    }										

    public Integer getLen() {		
        return len;				
    }							

    public void setLen(Integer len) {		
        this.len = len;				
    }								

    public IsLocatedIn withLen(Integer len) {				
        this.len = len;						
        return this;						
    }										

    public Character getDir() {		
        return dir;				
    }							

    public void setDir(Character dir) {		
        this.dir = dir;				
    }								

    public IsLocatedIn withDir(Character dir) {				
        this.dir = dir;						
        return this;						
    }										

}

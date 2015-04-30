package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class HasAssertedFunctionFrom extends Dumper {  	

    @Column(name="from_link", type=ColumnType.STRING)		
    private String fromLink;									

    @Column(name="to_link", type=ColumnType.STRING)		
    private String toLink;									

    @Column(name="function", type=ColumnType.TEXT)		
    private String function;									

    @Column(name="external_id", type=ColumnType.STRING)		
    private String externalId;									

    @Column(name="organism", type=ColumnType.STRING)		
    private String organism;									

    @Column(name="gi_number", type=ColumnType.COUNTER)		
    private Long giNumber;									

    @Column(name="release_date", type=ColumnType.DATE)		
    private Long releaseDate;									

    private HasAssertedFunctionFrom() throws IOException{		
        super();							
    }										

    public static HasAssertedFunctionFrom newDumper() throws IOException{	
        return new HasAssertedFunctionFrom();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public HasAssertedFunctionFrom withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public String getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(String toLink) {		
        this.toLink = toLink;				
    }								

    public HasAssertedFunctionFrom withTo_link(String toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

    public String getFunction() {		
        return function;				
    }							

    public void setFunction(String function) {		
        this.function = function;				
    }								

    public HasAssertedFunctionFrom withFunction(String function) {				
        this.function = function;						
        return this;						
    }										

    public String getExternal_id() {		
        return externalId;				
    }							

    public void setExternal_id(String externalId) {		
        this.externalId = externalId;				
    }								

    public HasAssertedFunctionFrom withExternal_id(String externalId) {				
        this.externalId = externalId;						
        return this;						
    }										

    public String getOrganism() {		
        return organism;				
    }							

    public void setOrganism(String organism) {		
        this.organism = organism;				
    }								

    public HasAssertedFunctionFrom withOrganism(String organism) {				
        this.organism = organism;						
        return this;						
    }										

    public Long getGi_number() {		
        return giNumber;				
    }							

    public void setGi_number(Long giNumber) {		
        this.giNumber = giNumber;				
    }								

    public HasAssertedFunctionFrom withGi_number(Long giNumber) {				
        this.giNumber = giNumber;						
        return this;						
    }										

    public Long getRelease_date() {		
        return releaseDate;				
    }							

    public void setRelease_date(Long releaseDate) {		
        this.releaseDate = releaseDate;				
    }								

    public HasAssertedFunctionFrom withRelease_date(Long releaseDate) {				
        this.releaseDate = releaseDate;						
        return this;						
    }										

}

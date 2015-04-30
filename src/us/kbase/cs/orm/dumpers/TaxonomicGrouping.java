package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class TaxonomicGrouping extends Dumper {  	

    @Column(name="id", type=ColumnType.COUNTER)		
    private Long id;									

    @Column(name="domain", type=ColumnType.BOOLEAN)		
    private Byte domain;									

    @Column(name="hidden", type=ColumnType.BOOLEAN)		
    private Byte hidden;									

    @Column(name="scientific_name", type=ColumnType.STRING)		
    private String scientificName;									

    @Column(name="type", type=ColumnType.STRING)		
    private String type;									

    @Column(name="alias", type=ColumnType.STRING)		
    private String alias;									

    private TaxonomicGrouping() throws IOException{		
        super();							
    }										

    public static TaxonomicGrouping newDumper() throws IOException{	
        return new TaxonomicGrouping();			
    }								

    public Long getId() {		
        return id;				
    }							

    public void setId(Long id) {		
        this.id = id;				
    }								

    public TaxonomicGrouping withId(Long id) {				
        this.id = id;						
        return this;						
    }										

    public Byte getDomain() {		
        return domain;				
    }							

    public void setDomain(Byte domain) {		
        this.domain = domain;				
    }								

    public TaxonomicGrouping withDomain(Byte domain) {				
        this.domain = domain;						
        return this;						
    }										

    public Byte getHidden() {		
        return hidden;				
    }							

    public void setHidden(Byte hidden) {		
        this.hidden = hidden;				
    }								

    public TaxonomicGrouping withHidden(Byte hidden) {				
        this.hidden = hidden;						
        return this;						
    }										

    public String getScientific_name() {		
        return scientificName;				
    }							

    public void setScientific_name(String scientificName) {		
        this.scientificName = scientificName;				
    }								

    public TaxonomicGrouping withScientific_name(String scientificName) {				
        this.scientificName = scientificName;						
        return this;						
    }										

    public String getType() {		
        return type;				
    }							

    public void setType(String type) {		
        this.type = type;				
    }								

    public TaxonomicGrouping withType(String type) {				
        this.type = type;						
        return this;						
    }										

    public String getAlias() {		
        return alias;				
    }							

    public void setAlias(String alias) {		
        this.alias = alias;				
    }								

    public TaxonomicGrouping withAlias(String alias) {				
        this.alias = alias;						
        return this;						
    }										

}

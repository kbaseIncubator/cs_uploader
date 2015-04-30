package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class ConservedDomainModel extends Dumper {  	

    @Column(name="id", type=ColumnType.INT)		
    private Integer id;									

    @Column(name="accession", type=ColumnType.TEXT)		
    private String accession;									

    @Column(name="short_name", type=ColumnType.TEXT)		
    private String shortName;									

    @Column(name="description", type=ColumnType.TEXT)		
    private String description;									

    private ConservedDomainModel() throws IOException{		
        super();							
    }										

    public static ConservedDomainModel newDumper() throws IOException{	
        return new ConservedDomainModel();			
    }								

    public Integer getId() {		
        return id;				
    }							

    public void setId(Integer id) {		
        this.id = id;				
    }								

    public ConservedDomainModel withId(Integer id) {				
        this.id = id;						
        return this;						
    }										

    public String getAccession() {		
        return accession;				
    }							

    public void setAccession(String accession) {		
        this.accession = accession;				
    }								

    public ConservedDomainModel withAccession(String accession) {				
        this.accession = accession;						
        return this;						
    }										

    public String getShort_name() {		
        return shortName;				
    }							

    public void setShort_name(String shortName) {		
        this.shortName = shortName;				
    }								

    public ConservedDomainModel withShort_name(String shortName) {				
        this.shortName = shortName;						
        return this;						
    }										

    public String getDescription() {		
        return description;				
    }							

    public void setDescription(String description) {		
        this.description = description;				
    }								

    public ConservedDomainModel withDescription(String description) {				
        this.description = description;						
        return this;						
    }										

}

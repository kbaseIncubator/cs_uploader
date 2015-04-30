package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class Regulome extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="description", type=ColumnType.STRING)		
    private String description;									

    @Column(name="creation_date", type=ColumnType.DATE)		
    private Long creationDate;									

    private Regulome() throws IOException{		
        super();							
    }										

    public static Regulome newDumper() throws IOException{	
        return new Regulome();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public Regulome withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public String getDescription() {		
        return description;				
    }							

    public void setDescription(String description) {		
        this.description = description;				
    }								

    public Regulome withDescription(String description) {				
        this.description = description;						
        return this;						
    }										

    public Long getCreation_date() {		
        return creationDate;				
    }							

    public void setCreation_date(Long creationDate) {		
        this.creationDate = creationDate;				
    }								

    public Regulome withCreation_date(Long creationDate) {				
        this.creationDate = creationDate;						
        return this;						
    }										

}

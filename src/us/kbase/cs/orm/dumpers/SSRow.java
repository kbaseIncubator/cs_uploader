package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class SSRow extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="curated", type=ColumnType.BOOLEAN)		
    private Byte curated;									

    @Column(name="region", type=ColumnType.STRING)		
    private String region;									

    private SSRow() throws IOException{		
        super();							
    }										

    public static SSRow newDumper() throws IOException{	
        return new SSRow();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public SSRow withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public Byte getCurated() {		
        return curated;				
    }							

    public void setCurated(Byte curated) {		
        this.curated = curated;				
    }								

    public SSRow withCurated(Byte curated) {				
        this.curated = curated;						
        return this;						
    }										

    public String getRegion() {		
        return region;				
    }							

    public void setRegion(String region) {		
        this.region = region;				
    }								

    public SSRow withRegion(String region) {				
        this.region = region;						
        return this;						
    }										

}

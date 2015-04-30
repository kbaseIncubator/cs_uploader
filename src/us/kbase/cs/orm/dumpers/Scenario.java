package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class Scenario extends Dumper {  	

    @Column(name="id", type=ColumnType.INT)		
    private Integer id;									

    @Column(name="common_name", type=ColumnType.STRING)		
    private String commonName;									

    private Scenario() throws IOException{		
        super();							
    }										

    public static Scenario newDumper() throws IOException{	
        return new Scenario();			
    }								

    public Integer getId() {		
        return id;				
    }							

    public void setId(Integer id) {		
        this.id = id;				
    }								

    public Scenario withId(Integer id) {				
        this.id = id;						
        return this;						
    }										

    public String getCommon_name() {		
        return commonName;				
    }							

    public void setCommon_name(String commonName) {		
        this.commonName = commonName;				
    }								

    public Scenario withCommon_name(String commonName) {				
        this.commonName = commonName;						
        return this;						
    }										

}

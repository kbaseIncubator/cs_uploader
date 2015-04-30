package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class Regulator extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="name", type=ColumnType.STRING)		
    private String name;									

    @Column(name="rfam_id", type=ColumnType.STRING)		
    private String rfamId;									

    @Column(name="tf_family", type=ColumnType.STRING)		
    private String tfFamily;									

    @Column(name="type", type=ColumnType.STRING)		
    private String type;									

    @Column(name="taxonomy", type=ColumnType.STRING)		
    private String taxonomy;									

    private Regulator() throws IOException{		
        super();							
    }										

    public static Regulator newDumper() throws IOException{	
        return new Regulator();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public Regulator withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public String getName() {		
        return name;				
    }							

    public void setName(String name) {		
        this.name = name;				
    }								

    public Regulator withName(String name) {				
        this.name = name;						
        return this;						
    }										

    public String getRfam_id() {		
        return rfamId;				
    }							

    public void setRfam_id(String rfamId) {		
        this.rfamId = rfamId;				
    }								

    public Regulator withRfam_id(String rfamId) {				
        this.rfamId = rfamId;						
        return this;						
    }										

    public String getTf_family() {		
        return tfFamily;				
    }							

    public void setTf_family(String tfFamily) {		
        this.tfFamily = tfFamily;				
    }								

    public Regulator withTf_family(String tfFamily) {				
        this.tfFamily = tfFamily;						
        return this;						
    }										

    public String getType() {		
        return type;				
    }							

    public void setType(String type) {		
        this.type = type;				
    }								

    public Regulator withType(String type) {				
        this.type = type;						
        return this;						
    }										

    public String getTaxonomy() {		
        return taxonomy;				
    }							

    public void setTaxonomy(String taxonomy) {		
        this.taxonomy = taxonomy;				
    }								

    public Regulator withTaxonomy(String taxonomy) {				
        this.taxonomy = taxonomy;						
        return this;						
    }										

}

package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class Ontology extends Dumper {  								

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="name", type=ColumnType.STRING)		
    private String name;									

    @Column(name="definition", type=ColumnType.TEXT)		
    private String definition;									

    @Column(name="ontologySource", type=ColumnType.STRING)		
    private String ontologySource;									

    private Ontology() throws IOException{		
        super();							
    }										

    public static Ontology newDumper() throws IOException{	
        return new Ontology();			
    }								

							
    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public Ontology withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public String getName() {		
        return name;				
    }							

    public void setName(String name) {		
        this.name = name;				
    }								

    public Ontology withName(String name) {				
        this.name = name;						
        return this;						
    }										

    public String getDefinition() {		
        return definition;				
    }							

    public void setDefinition(String definition) {		
        this.definition = definition;				
    }								

    public Ontology withDefinition(String definition) {				
        this.definition = definition;						
        return this;						
    }										

    public String getOntologySource() {		
        return ontologySource;				
    }							

    public void setOntologySource(String ontologySource) {		
        this.ontologySource = ontologySource;				
    }								

    public Ontology withOntologySource(String ontologySource) {				
        this.ontologySource = ontologySource;						
        return this;						
    }										

}

package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class Subsystem extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="version", type=ColumnType.INT)		
    private Integer version;									

    @Column(name="curator", type=ColumnType.STRING)		
    private String curator;									

    @Column(name="notes", type=ColumnType.TEXT)		
    private String notes;									

    @Column(name="description", type=ColumnType.TEXT)		
    private String description;									

    @Column(name="usable", type=ColumnType.BOOLEAN)		
    private Byte usable;									

    @Column(name="private", type=ColumnType.BOOLEAN)		
    private Byte Private;									

    @Column(name="cluster_based", type=ColumnType.BOOLEAN)		
    private Byte clusterBased;									

    @Column(name="experimental", type=ColumnType.BOOLEAN)		
    private Byte experimental;									

    private Subsystem() throws IOException{		
        super();							
    }										

    public static Subsystem newDumper() throws IOException{	
        return new Subsystem();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public Subsystem withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public Integer getVersion() {		
        return version;				
    }							

    public void setVersion(Integer version) {		
        this.version = version;				
    }								

    public Subsystem withVersion(Integer version) {				
        this.version = version;						
        return this;						
    }										

    public String getCurator() {		
        return curator;				
    }							

    public void setCurator(String curator) {		
        this.curator = curator;				
    }								

    public Subsystem withCurator(String curator) {				
        this.curator = curator;						
        return this;						
    }										

    public String getNotes() {		
        return notes;				
    }							

    public void setNotes(String notes) {		
        this.notes = notes;				
    }								

    public Subsystem withNotes(String notes) {				
        this.notes = notes;						
        return this;						
    }										

    public String getDescription() {		
        return description;				
    }							

    public void setDescription(String description) {		
        this.description = description;				
    }								

    public Subsystem withDescription(String description) {				
        this.description = description;						
        return this;						
    }										

    public Byte getUsable() {		
        return usable;				
    }							

    public void setUsable(Byte usable) {		
        this.usable = usable;				
    }								

    public Subsystem withUsable(Byte usable) {				
        this.usable = usable;						
        return this;						
    }										

    public Byte getPrivate() {		
        return Private;				
    }							

    public void setPrivate(Byte Private) {		
        this.Private = Private;				
    }								

    public Subsystem withPrivate(Byte Private) {				
        this.Private = Private;						
        return this;						
    }										

    public Byte getCluster_based() {		
        return clusterBased;				
    }							

    public void setCluster_based(Byte clusterBased) {		
        this.clusterBased = clusterBased;				
    }								

    public Subsystem withCluster_based(Byte clusterBased) {				
        this.clusterBased = clusterBased;						
        return this;						
    }										

    public Byte getExperimental() {		
        return experimental;				
    }							

    public void setExperimental(Byte experimental) {		
        this.experimental = experimental;				
    }								

    public Subsystem withExperimental(Byte experimental) {				
        this.experimental = experimental;						
        return this;						
    }										

}

package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class Model extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="mod_date", type=ColumnType.DATE)		
    private Long modDate;									

    @Column(name="name", type=ColumnType.STRING)		
    private String name;									

    @Column(name="version", type=ColumnType.INT)		
    private Integer version;									

    @Column(name="type", type=ColumnType.STRING)		
    private String type;									

    @Column(name="status", type=ColumnType.STRING)		
    private String status;									

    @Column(name="reaction_count", type=ColumnType.INT)		
    private Integer reactionCount;									

    @Column(name="compound_count", type=ColumnType.INT)		
    private Integer compoundCount;									

    @Column(name="annotation_count", type=ColumnType.INT)		
    private Integer annotationCount;									

    private Model() throws IOException{		
        super();							
    }										

    public static Model newDumper() throws IOException{	
        return new Model();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public Model withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public Long getMod_date() {		
        return modDate;				
    }							

    public void setMod_date(Long modDate) {		
        this.modDate = modDate;				
    }								

    public Model withMod_date(Long modDate) {				
        this.modDate = modDate;						
        return this;						
    }										

    public String getName() {		
        return name;				
    }							

    public void setName(String name) {		
        this.name = name;				
    }								

    public Model withName(String name) {				
        this.name = name;						
        return this;						
    }										

    public Integer getVersion() {		
        return version;				
    }							

    public void setVersion(Integer version) {		
        this.version = version;				
    }								

    public Model withVersion(Integer version) {				
        this.version = version;						
        return this;						
    }										

    public String getType() {		
        return type;				
    }							

    public void setType(String type) {		
        this.type = type;				
    }								

    public Model withType(String type) {				
        this.type = type;						
        return this;						
    }										

    public String getStatus() {		
        return status;				
    }							

    public void setStatus(String status) {		
        this.status = status;				
    }								

    public Model withStatus(String status) {				
        this.status = status;						
        return this;						
    }										

    public Integer getReaction_count() {		
        return reactionCount;				
    }							

    public void setReaction_count(Integer reactionCount) {		
        this.reactionCount = reactionCount;				
    }								

    public Model withReaction_count(Integer reactionCount) {				
        this.reactionCount = reactionCount;						
        return this;						
    }										

    public Integer getCompound_count() {		
        return compoundCount;				
    }							

    public void setCompound_count(Integer compoundCount) {		
        this.compoundCount = compoundCount;				
    }								

    public Model withCompound_count(Integer compoundCount) {				
        this.compoundCount = compoundCount;						
        return this;						
    }										

    public Integer getAnnotation_count() {		
        return annotationCount;				
    }							

    public void setAnnotation_count(Integer annotationCount) {		
        this.annotationCount = annotationCount;				
    }								

    public Model withAnnotation_count(Integer annotationCount) {				
        this.annotationCount = annotationCount;						
        return this;						
    }										

}

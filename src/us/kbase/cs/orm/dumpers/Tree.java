package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class Tree extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="status", type=ColumnType.STRING)		
    private String status;									

    @Column(name="data_type", type=ColumnType.STRING)		
    private String dataType;									

    @Column(name="timestamp", type=ColumnType.DATE)		
    private Long timestamp;									

    @Column(name="method", type=ColumnType.STRING)		
    private String method;									

    @Column(name="parameters", type=ColumnType.LONG_STRING)		
    private String parameters;									

    @Column(name="protocol", type=ColumnType.TEXT)		
    private String protocol;									

    @Column(name="source_id", type=ColumnType.STRING)		
    private String sourceId;									

    @Column(name="newick", type=ColumnType.TEXT)		
    private String newick;									

    private Tree() throws IOException{		
        super();							
    }										

    public static Tree newDumper() throws IOException{	
        return new Tree();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public Tree withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public String getStatus() {		
        return status;				
    }							

    public void setStatus(String status) {		
        this.status = status;				
    }								

    public Tree withStatus(String status) {				
        this.status = status;						
        return this;						
    }										

    public String getData_type() {		
        return dataType;				
    }							

    public void setData_type(String dataType) {		
        this.dataType = dataType;				
    }								

    public Tree withData_type(String dataType) {				
        this.dataType = dataType;						
        return this;						
    }										

    public Long getTimestamp() {		
        return timestamp;				
    }							

    public void setTimestamp(Long timestamp) {		
        this.timestamp = timestamp;				
    }								

    public Tree withTimestamp(Long timestamp) {				
        this.timestamp = timestamp;						
        return this;						
    }										

    public String getMethod() {		
        return method;				
    }							

    public void setMethod(String method) {		
        this.method = method;				
    }								

    public Tree withMethod(String method) {				
        this.method = method;						
        return this;						
    }										

    public String getParameters() {		
        return parameters;				
    }							

    public void setParameters(String parameters) {		
        this.parameters = parameters;				
    }								

    public Tree withParameters(String parameters) {				
        this.parameters = parameters;						
        return this;						
    }										

    public String getProtocol() {		
        return protocol;				
    }							

    public void setProtocol(String protocol) {		
        this.protocol = protocol;				
    }								

    public Tree withProtocol(String protocol) {				
        this.protocol = protocol;						
        return this;						
    }										

    public String getSource_id() {		
        return sourceId;				
    }							

    public void setSource_id(String sourceId) {		
        this.sourceId = sourceId;				
    }								

    public Tree withSource_id(String sourceId) {				
        this.sourceId = sourceId;						
        return this;						
    }										

    public String getNewick() {		
        return newick;				
    }							

    public void setNewick(String newick) {		
        this.newick = newick;				
    }								

    public Tree withNewick(String newick) {				
        this.newick = newick;						
        return this;						
    }										

}

package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class Alignment extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="n_rows", type=ColumnType.INT)		
    private Integer nRows;									

    @Column(name="n_cols", type=ColumnType.INT)		
    private Integer nCols;									

    @Column(name="status", type=ColumnType.STRING)		
    private String status;									

    @Column(name="is_concatenation", type=ColumnType.BOOLEAN)		
    private Byte isConcatenation;									

    @Column(name="sequence_type", type=ColumnType.STRING)		
    private String sequenceType;									

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

    private Alignment() throws IOException{		
        super();							
    }										

    public static Alignment newDumper() throws IOException{	
        return new Alignment();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public Alignment withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public Integer getN_rows() {		
        return nRows;				
    }							

    public void setN_rows(Integer nRows) {		
        this.nRows = nRows;				
    }								

    public Alignment withN_rows(Integer nRows) {				
        this.nRows = nRows;						
        return this;						
    }										

    public Integer getN_cols() {		
        return nCols;				
    }							

    public void setN_cols(Integer nCols) {		
        this.nCols = nCols;				
    }								

    public Alignment withN_cols(Integer nCols) {				
        this.nCols = nCols;						
        return this;						
    }										

    public String getStatus() {		
        return status;				
    }							

    public void setStatus(String status) {		
        this.status = status;				
    }								

    public Alignment withStatus(String status) {				
        this.status = status;						
        return this;						
    }										

    public Byte getIs_concatenation() {		
        return isConcatenation;				
    }							

    public void setIs_concatenation(Byte isConcatenation) {		
        this.isConcatenation = isConcatenation;				
    }								

    public Alignment withIs_concatenation(Byte isConcatenation) {				
        this.isConcatenation = isConcatenation;						
        return this;						
    }										

    public String getSequence_type() {		
        return sequenceType;				
    }							

    public void setSequence_type(String sequenceType) {		
        this.sequenceType = sequenceType;				
    }								

    public Alignment withSequence_type(String sequenceType) {				
        this.sequenceType = sequenceType;						
        return this;						
    }										

    public Long getTimestamp() {		
        return timestamp;				
    }							

    public void setTimestamp(Long timestamp) {		
        this.timestamp = timestamp;				
    }								

    public Alignment withTimestamp(Long timestamp) {				
        this.timestamp = timestamp;						
        return this;						
    }										

    public String getMethod() {		
        return method;				
    }							

    public void setMethod(String method) {		
        this.method = method;				
    }								

    public Alignment withMethod(String method) {				
        this.method = method;						
        return this;						
    }										

    public String getParameters() {		
        return parameters;				
    }							

    public void setParameters(String parameters) {		
        this.parameters = parameters;				
    }								

    public Alignment withParameters(String parameters) {				
        this.parameters = parameters;						
        return this;						
    }										

    public String getProtocol() {		
        return protocol;				
    }							

    public void setProtocol(String protocol) {		
        this.protocol = protocol;				
    }								

    public Alignment withProtocol(String protocol) {				
        this.protocol = protocol;						
        return this;						
    }										

    public String getSource_id() {		
        return sourceId;				
    }							

    public void setSource_id(String sourceId) {		
        this.sourceId = sourceId;				
    }								

    public Alignment withSource_id(String sourceId) {				
        this.sourceId = sourceId;						
        return this;						
    }										

}

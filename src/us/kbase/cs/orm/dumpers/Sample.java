package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class Sample extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="title", type=ColumnType.TEXT)		
    private String title;									

    @Column(name="dataSource", type=ColumnType.STRING)		
    private String dataSource;									

    @Column(name="externalSourceId", type=ColumnType.STRING)		
    private String externalSourceId;									

    @Column(name="description", type=ColumnType.TEXT)		
    private String description;									

    @Column(name="molecule", type=ColumnType.STRING)		
    private String molecule;									

    @Column(name="type", type=ColumnType.STRING)		
    private String type;									

    @Column(name="kbaseSubmissionDate", type=ColumnType.DATE)		
    private Long kbaseSubmissionDate;									

    @Column(name="externalSourceDate", type=ColumnType.DATE)		
    private Long externalSourceDate;									

    @Column(name="custom", type=ColumnType.SEMI_BOOLEAN)		
    private Character custom;									

    @Column(name="originalLog2Median", type=ColumnType.FLOAT)		
    private Float originalLog2Median;									

    @Column(name="source_id", type=ColumnType.STRING)		
    private String sourceId;									

    @Column(name="dataQualityLevel", type=ColumnType.INT)		
    private Integer dataQualityLevel;									

    @Column(name="shock_url", type=ColumnType.STRING)		
    private String shockUrl;									

    @Column(name="processing_comments", type=ColumnType.TEXT)		
    private String processingComments;									

    @Column(name="numerical_interpretation", type=ColumnType.STRING)		
    private String numericalInterpretation;									

    @Column(name="characteristics", type=ColumnType.TEXT)		
    private String characteristics;									

    private Sample() throws IOException{		
        super();							
    }										

    public static Sample newDumper() throws IOException{	
        return new Sample();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public Sample withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public String getTitle() {		
        return title;				
    }							

    public void setTitle(String title) {		
        this.title = title;				
    }								

    public Sample withTitle(String title) {				
        this.title = title;						
        return this;						
    }										

    public String getDataSource() {		
        return dataSource;				
    }							

    public void setDataSource(String dataSource) {		
        this.dataSource = dataSource;				
    }								

    public Sample withDataSource(String dataSource) {				
        this.dataSource = dataSource;						
        return this;						
    }										

    public String getExternalSourceId() {		
        return externalSourceId;				
    }							

    public void setExternalSourceId(String externalSourceId) {		
        this.externalSourceId = externalSourceId;				
    }								

    public Sample withExternalSourceId(String externalSourceId) {				
        this.externalSourceId = externalSourceId;						
        return this;						
    }										

    public String getDescription() {		
        return description;				
    }							

    public void setDescription(String description) {		
        this.description = description;				
    }								

    public Sample withDescription(String description) {				
        this.description = description;						
        return this;						
    }										

    public String getMolecule() {		
        return molecule;				
    }							

    public void setMolecule(String molecule) {		
        this.molecule = molecule;				
    }								

    public Sample withMolecule(String molecule) {				
        this.molecule = molecule;						
        return this;						
    }										

    public String getType() {		
        return type;				
    }							

    public void setType(String type) {		
        this.type = type;				
    }								

    public Sample withType(String type) {				
        this.type = type;						
        return this;						
    }										

    public Long getKbaseSubmissionDate() {		
        return kbaseSubmissionDate;				
    }							

    public void setKbaseSubmissionDate(Long kbaseSubmissionDate) {		
        this.kbaseSubmissionDate = kbaseSubmissionDate;				
    }								

    public Sample withKbaseSubmissionDate(Long kbaseSubmissionDate) {				
        this.kbaseSubmissionDate = kbaseSubmissionDate;						
        return this;						
    }										

    public Long getExternalSourceDate() {		
        return externalSourceDate;				
    }							

    public void setExternalSourceDate(Long externalSourceDate) {		
        this.externalSourceDate = externalSourceDate;				
    }								

    public Sample withExternalSourceDate(Long externalSourceDate) {				
        this.externalSourceDate = externalSourceDate;						
        return this;						
    }										

    public Character getCustom() {		
        return custom;				
    }							

    public void setCustom(Character custom) {		
        this.custom = custom;				
    }								

    public Sample withCustom(Character custom) {				
        this.custom = custom;						
        return this;						
    }										

    public Float getOriginalLog2Median() {		
        return originalLog2Median;				
    }							

    public void setOriginalLog2Median(Float originalLog2Median) {		
        this.originalLog2Median = originalLog2Median;				
    }								

    public Sample withOriginalLog2Median(Float originalLog2Median) {				
        this.originalLog2Median = originalLog2Median;						
        return this;						
    }										

    public String getSource_id() {		
        return sourceId;				
    }							

    public void setSource_id(String sourceId) {		
        this.sourceId = sourceId;				
    }								

    public Sample withSource_id(String sourceId) {				
        this.sourceId = sourceId;						
        return this;						
    }										

    public Integer getDataQualityLevel() {		
        return dataQualityLevel;				
    }							

    public void setDataQualityLevel(Integer dataQualityLevel) {		
        this.dataQualityLevel = dataQualityLevel;				
    }								

    public Sample withDataQualityLevel(Integer dataQualityLevel) {				
        this.dataQualityLevel = dataQualityLevel;						
        return this;						
    }										

    public String getShock_url() {		
        return shockUrl;				
    }							

    public void setShock_url(String shockUrl) {		
        this.shockUrl = shockUrl;				
    }								

    public Sample withShock_url(String shockUrl) {				
        this.shockUrl = shockUrl;						
        return this;						
    }										

    public String getProcessing_comments() {		
        return processingComments;				
    }							

    public void setProcessing_comments(String processingComments) {		
        this.processingComments = processingComments;				
    }								

    public Sample withProcessing_comments(String processingComments) {				
        this.processingComments = processingComments;						
        return this;						
    }										

    public String getNumerical_interpretation() {		
        return numericalInterpretation;				
    }							

    public void setNumerical_interpretation(String numericalInterpretation) {		
        this.numericalInterpretation = numericalInterpretation;				
    }								

    public Sample withNumerical_interpretation(String numericalInterpretation) {				
        this.numericalInterpretation = numericalInterpretation;						
        return this;						
    }										

    public String getCharacteristics() {		
        return characteristics;				
    }							

    public void setCharacteristics(String characteristics) {		
        this.characteristics = characteristics;				
    }								

    public Sample withCharacteristics(String characteristics) {				
        this.characteristics = characteristics;						
        return this;						
    }										

}

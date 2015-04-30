package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class HasConservedDomainModel extends Dumper {  	

    @Column(name="from_link", type=ColumnType.STRING)		
    private String fromLink;									

    @Column(name="to_link", type=ColumnType.INT)		
    private Integer toLink;									

    @Column(name="percent_identity", type=ColumnType.FLOAT)		
    private Float percentIdentity;									

    @Column(name="alignment_length", type=ColumnType.INT)		
    private Integer alignmentLength;									

    @Column(name="mismatches", type=ColumnType.INT)		
    private Integer mismatches;									

    @Column(name="gap_openings", type=ColumnType.INT)		
    private Integer gapOpenings;									

    @Column(name="protein_start", type=ColumnType.INT)		
    private Integer proteinStart;									

    @Column(name="protein_end", type=ColumnType.INT)		
    private Integer proteinEnd;									

    @Column(name="domain_start", type=ColumnType.INT)		
    private Integer domainStart;									

    @Column(name="domain_end", type=ColumnType.INT)		
    private Integer domainEnd;									

    @Column(name="e_value", type=ColumnType.FLOAT)		
    private Float eValue;									

    @Column(name="bit_score", type=ColumnType.FLOAT)		
    private Float bitScore;									

    private HasConservedDomainModel() throws IOException{		
        super();							
    }										

    public static HasConservedDomainModel newDumper() throws IOException{	
        return new HasConservedDomainModel();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public HasConservedDomainModel withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public Integer getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(Integer toLink) {		
        this.toLink = toLink;				
    }								

    public HasConservedDomainModel withTo_link(Integer toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

    public Float getPercent_identity() {		
        return percentIdentity;				
    }							

    public void setPercent_identity(Float percentIdentity) {		
        this.percentIdentity = percentIdentity;				
    }								

    public HasConservedDomainModel withPercent_identity(Float percentIdentity) {				
        this.percentIdentity = percentIdentity;						
        return this;						
    }										

    public Integer getAlignment_length() {		
        return alignmentLength;				
    }							

    public void setAlignment_length(Integer alignmentLength) {		
        this.alignmentLength = alignmentLength;				
    }								

    public HasConservedDomainModel withAlignment_length(Integer alignmentLength) {				
        this.alignmentLength = alignmentLength;						
        return this;						
    }										

    public Integer getMismatches() {		
        return mismatches;				
    }							

    public void setMismatches(Integer mismatches) {		
        this.mismatches = mismatches;				
    }								

    public HasConservedDomainModel withMismatches(Integer mismatches) {				
        this.mismatches = mismatches;						
        return this;						
    }										

    public Integer getGap_openings() {		
        return gapOpenings;				
    }							

    public void setGap_openings(Integer gapOpenings) {		
        this.gapOpenings = gapOpenings;				
    }								

    public HasConservedDomainModel withGap_openings(Integer gapOpenings) {				
        this.gapOpenings = gapOpenings;						
        return this;						
    }										

    public Integer getProtein_start() {		
        return proteinStart;				
    }							

    public void setProtein_start(Integer proteinStart) {		
        this.proteinStart = proteinStart;				
    }								

    public HasConservedDomainModel withProtein_start(Integer proteinStart) {				
        this.proteinStart = proteinStart;						
        return this;						
    }										

    public Integer getProtein_end() {		
        return proteinEnd;				
    }							

    public void setProtein_end(Integer proteinEnd) {		
        this.proteinEnd = proteinEnd;				
    }								

    public HasConservedDomainModel withProtein_end(Integer proteinEnd) {				
        this.proteinEnd = proteinEnd;						
        return this;						
    }										

    public Integer getDomain_start() {		
        return domainStart;				
    }							

    public void setDomain_start(Integer domainStart) {		
        this.domainStart = domainStart;				
    }								

    public HasConservedDomainModel withDomain_start(Integer domainStart) {				
        this.domainStart = domainStart;						
        return this;						
    }										

    public Integer getDomain_end() {		
        return domainEnd;				
    }							

    public void setDomain_end(Integer domainEnd) {		
        this.domainEnd = domainEnd;				
    }								

    public HasConservedDomainModel withDomain_end(Integer domainEnd) {				
        this.domainEnd = domainEnd;						
        return this;						
    }										

    public Float getE_value() {		
        return eValue;				
    }							

    public void setE_value(Float eValue) {		
        this.eValue = eValue;				
    }								

    public HasConservedDomainModel withE_value(Float eValue) {				
        this.eValue = eValue;						
        return this;						
    }										

    public Float getBit_score() {		
        return bitScore;				
    }							

    public void setBit_score(Float bitScore) {		
        this.bitScore = bitScore;				
    }								

    public HasConservedDomainModel withBit_score(Float bitScore) {				
        this.bitScore = bitScore;						
        return this;						
    }										

}

package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class IsAlignedProteinComponentOf extends Dumper {  	

    @Column(name="from_link", type=ColumnType.STRING)		
    private String fromLink;									

    @Column(name="to_link", type=ColumnType.STRING)		
    private String toLink;									

    @Column(name="index_in_concatenation", type=ColumnType.INT)		
    private Integer indexInConcatenation;									

    @Column(name="beg_pos_in_parent", type=ColumnType.INT)		
    private Integer begPosInParent;									

    @Column(name="end_pos_in_parent", type=ColumnType.INT)		
    private Integer endPosInParent;									

    @Column(name="parent_seq_len", type=ColumnType.INT)		
    private Integer parentSeqLen;									

    @Column(name="beg_pos_aln", type=ColumnType.INT)		
    private Integer begPosAln;									

    @Column(name="end_pos_aln", type=ColumnType.INT)		
    private Integer endPosAln;									

    @Column(name="kb_feature_id", type=ColumnType.STRING)		
    private String kbFeatureId;									

    private IsAlignedProteinComponentOf() throws IOException{		
        super();							
    }										

    public static IsAlignedProteinComponentOf newDumper() throws IOException{	
        return new IsAlignedProteinComponentOf();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public IsAlignedProteinComponentOf withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public String getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(String toLink) {		
        this.toLink = toLink;				
    }								

    public IsAlignedProteinComponentOf withTo_link(String toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

    public Integer getIndex_in_concatenation() {		
        return indexInConcatenation;				
    }							

    public void setIndex_in_concatenation(Integer indexInConcatenation) {		
        this.indexInConcatenation = indexInConcatenation;				
    }								

    public IsAlignedProteinComponentOf withIndex_in_concatenation(Integer indexInConcatenation) {				
        this.indexInConcatenation = indexInConcatenation;						
        return this;						
    }										

    public Integer getBeg_pos_in_parent() {		
        return begPosInParent;				
    }							

    public void setBeg_pos_in_parent(Integer begPosInParent) {		
        this.begPosInParent = begPosInParent;				
    }								

    public IsAlignedProteinComponentOf withBeg_pos_in_parent(Integer begPosInParent) {				
        this.begPosInParent = begPosInParent;						
        return this;						
    }										

    public Integer getEnd_pos_in_parent() {		
        return endPosInParent;				
    }							

    public void setEnd_pos_in_parent(Integer endPosInParent) {		
        this.endPosInParent = endPosInParent;				
    }								

    public IsAlignedProteinComponentOf withEnd_pos_in_parent(Integer endPosInParent) {				
        this.endPosInParent = endPosInParent;						
        return this;						
    }										

    public Integer getParent_seq_len() {		
        return parentSeqLen;				
    }							

    public void setParent_seq_len(Integer parentSeqLen) {		
        this.parentSeqLen = parentSeqLen;				
    }								

    public IsAlignedProteinComponentOf withParent_seq_len(Integer parentSeqLen) {				
        this.parentSeqLen = parentSeqLen;						
        return this;						
    }										

    public Integer getBeg_pos_aln() {		
        return begPosAln;				
    }							

    public void setBeg_pos_aln(Integer begPosAln) {		
        this.begPosAln = begPosAln;				
    }								

    public IsAlignedProteinComponentOf withBeg_pos_aln(Integer begPosAln) {				
        this.begPosAln = begPosAln;						
        return this;						
    }										

    public Integer getEnd_pos_aln() {		
        return endPosAln;				
    }							

    public void setEnd_pos_aln(Integer endPosAln) {		
        this.endPosAln = endPosAln;				
    }								

    public IsAlignedProteinComponentOf withEnd_pos_aln(Integer endPosAln) {				
        this.endPosAln = endPosAln;						
        return this;						
    }										

    public String getKb_feature_id() {		
        return kbFeatureId;				
    }							

    public void setKb_feature_id(String kbFeatureId) {		
        this.kbFeatureId = kbFeatureId;				
    }								

    public IsAlignedProteinComponentOf withKb_feature_id(String kbFeatureId) {				
        this.kbFeatureId = kbFeatureId;						
        return this;						
    }										

}

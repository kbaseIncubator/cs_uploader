package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class AlignmentRow extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="row_number", type=ColumnType.INT)		
    private Integer rowNumber;									

    @Column(name="row_id", type=ColumnType.STRING)		
    private String rowId;									

    @Column(name="row_description", type=ColumnType.STRING)		
    private String rowDescription;									

    @Column(name="n_components", type=ColumnType.INT)		
    private Integer nComponents;									

    @Column(name="beg_pos_aln", type=ColumnType.INT)		
    private Integer begPosAln;									

    @Column(name="end_pos_aln", type=ColumnType.INT)		
    private Integer endPosAln;									

    @Column(name="md5_of_ungapped_sequence", type=ColumnType.STRING)		
    private String md5OfUngappedSequence;									

    @Column(name="sequence", type=ColumnType.TEXT)		
    private String sequence;									

    private AlignmentRow() throws IOException{		
        super();							
    }										

    public static AlignmentRow newDumper() throws IOException{	
        return new AlignmentRow();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public AlignmentRow withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public Integer getRow_number() {		
        return rowNumber;				
    }							

    public void setRow_number(Integer rowNumber) {		
        this.rowNumber = rowNumber;				
    }								

    public AlignmentRow withRow_number(Integer rowNumber) {				
        this.rowNumber = rowNumber;						
        return this;						
    }										

    public String getRow_id() {		
        return rowId;				
    }							

    public void setRow_id(String rowId) {		
        this.rowId = rowId;				
    }								

    public AlignmentRow withRow_id(String rowId) {				
        this.rowId = rowId;						
        return this;						
    }										

    public String getRow_description() {		
        return rowDescription;				
    }							

    public void setRow_description(String rowDescription) {		
        this.rowDescription = rowDescription;				
    }								

    public AlignmentRow withRow_description(String rowDescription) {				
        this.rowDescription = rowDescription;						
        return this;						
    }										

    public Integer getN_components() {		
        return nComponents;				
    }							

    public void setN_components(Integer nComponents) {		
        this.nComponents = nComponents;				
    }								

    public AlignmentRow withN_components(Integer nComponents) {				
        this.nComponents = nComponents;						
        return this;						
    }										

    public Integer getBeg_pos_aln() {		
        return begPosAln;				
    }							

    public void setBeg_pos_aln(Integer begPosAln) {		
        this.begPosAln = begPosAln;				
    }								

    public AlignmentRow withBeg_pos_aln(Integer begPosAln) {				
        this.begPosAln = begPosAln;						
        return this;						
    }										

    public Integer getEnd_pos_aln() {		
        return endPosAln;				
    }							

    public void setEnd_pos_aln(Integer endPosAln) {		
        this.endPosAln = endPosAln;				
    }								

    public AlignmentRow withEnd_pos_aln(Integer endPosAln) {				
        this.endPosAln = endPosAln;						
        return this;						
    }										

    public String getMd5_of_ungapped_sequence() {		
        return md5OfUngappedSequence;				
    }							

    public void setMd5_of_ungapped_sequence(String md5OfUngappedSequence) {		
        this.md5OfUngappedSequence = md5OfUngappedSequence;				
    }								

    public AlignmentRow withMd5_of_ungapped_sequence(String md5OfUngappedSequence) {				
        this.md5OfUngappedSequence = md5OfUngappedSequence;						
        return this;						
    }										

    public String getSequence() {		
        return sequence;				
    }							

    public void setSequence(String sequence) {		
        this.sequence = sequence;				
    }								

    public AlignmentRow withSequence(String sequence) {				
        this.sequence = sequence;						
        return this;						
    }										

}

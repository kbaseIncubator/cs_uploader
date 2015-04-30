package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class Includes extends Dumper {  	

    @Column(name="from_link", type=ColumnType.STRING)		
    private String fromLink;									

    @Column(name="to_link", type=ColumnType.STRING)		
    private String toLink;									

    @Column(name="sequence", type=ColumnType.COUNTER)		
    private Long sequence;									

    @Column(name="abbreviation", type=ColumnType.STRING)		
    private String abbreviation;									

    @Column(name="auxiliary", type=ColumnType.BOOLEAN)		
    private Byte auxiliary;									

    private Includes() throws IOException{		
        super();							
    }										

    public static Includes newDumper() throws IOException{	
        return new Includes();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public Includes withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public String getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(String toLink) {		
        this.toLink = toLink;				
    }								

    public Includes withTo_link(String toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

    public Long getSequence() {		
        return sequence;				
    }							

    public void setSequence(Long sequence) {		
        this.sequence = sequence;				
    }								

    public Includes withSequence(Long sequence) {				
        this.sequence = sequence;						
        return this;						
    }										

    public String getAbbreviation() {		
        return abbreviation;				
    }							

    public void setAbbreviation(String abbreviation) {		
        this.abbreviation = abbreviation;				
    }								

    public Includes withAbbreviation(String abbreviation) {				
        this.abbreviation = abbreviation;						
        return this;						
    }										

    public Byte getAuxiliary() {		
        return auxiliary;				
    }							

    public void setAuxiliary(Byte auxiliary) {		
        this.auxiliary = auxiliary;				
    }								

    public Includes withAuxiliary(Byte auxiliary) {				
        this.auxiliary = auxiliary;						
        return this;						
    }										

}

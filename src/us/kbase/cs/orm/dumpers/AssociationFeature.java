package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class AssociationFeature extends Dumper {  	

    @Column(name="from_link", type=ColumnType.STRING)		
    private String fromLink;									

    @Column(name="to_link", type=ColumnType.STRING)		
    private String toLink;									

    @Column(name="stoichiometry", type=ColumnType.INT)		
    private Integer stoichiometry;									

    @Column(name="strength", type=ColumnType.FLOAT)		
    private Float strength;									

    @Column(name="rank", type=ColumnType.INT)		
    private Integer rank;									

    private AssociationFeature() throws IOException{		
        super();							
    }										

    public static AssociationFeature newDumper() throws IOException{	
        return new AssociationFeature();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public AssociationFeature withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public String getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(String toLink) {		
        this.toLink = toLink;				
    }								

    public AssociationFeature withTo_link(String toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

    public Integer getStoichiometry() {		
        return stoichiometry;				
    }							

    public void setStoichiometry(Integer stoichiometry) {		
        this.stoichiometry = stoichiometry;				
    }								

    public AssociationFeature withStoichiometry(Integer stoichiometry) {				
        this.stoichiometry = stoichiometry;						
        return this;						
    }										

    public Float getStrength() {		
        return strength;				
    }							

    public void setStrength(Float strength) {		
        this.strength = strength;				
    }								

    public AssociationFeature withStrength(Float strength) {				
        this.strength = strength;						
        return this;						
    }										

    public Integer getRank() {		
        return rank;				
    }							

    public void setRank(Integer rank) {		
        this.rank = rank;				
    }								

    public AssociationFeature withRank(Integer rank) {				
        this.rank = rank;						
        return this;						
    }										

}

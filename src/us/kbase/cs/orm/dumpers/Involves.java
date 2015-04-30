package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class Involves extends Dumper {  	

    @Column(name="from_link", type=ColumnType.STRING)		
    private String fromLink;									

    @Column(name="to_link", type=ColumnType.STRING)		
    private String toLink;									

    @Column(name="coefficient", type=ColumnType.FLOAT)		
    private Float coefficient;									

    @Column(name="cofactor", type=ColumnType.BOOLEAN)		
    private Byte cofactor;									

    private Involves() throws IOException{		
        super();							
    }										

    public static Involves newDumper() throws IOException{	
        return new Involves();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public Involves withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public String getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(String toLink) {		
        this.toLink = toLink;				
    }								

    public Involves withTo_link(String toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

    public Float getCoefficient() {		
        return coefficient;				
    }							

    public void setCoefficient(Float coefficient) {		
        this.coefficient = coefficient;				
    }								

    public Involves withCoefficient(Float coefficient) {				
        this.coefficient = coefficient;						
        return this;						
    }										

    public Byte getCofactor() {		
        return cofactor;				
    }							

    public void setCofactor(Byte cofactor) {		
        this.cofactor = cofactor;				
    }								

    public Involves withCofactor(Byte cofactor) {				
        this.cofactor = cofactor;						
        return this;						
    }										

}

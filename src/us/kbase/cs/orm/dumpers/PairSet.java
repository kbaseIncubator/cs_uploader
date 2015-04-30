package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class PairSet extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="score", type=ColumnType.INT)		
    private Integer score;									

    private PairSet() throws IOException{		
        super();							
    }										

    public static PairSet newDumper() throws IOException{	
        return new PairSet();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public PairSet withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public Integer getScore() {		
        return score;				
    }							

    public void setScore(Integer score) {		
        this.score = score;				
    }								

    public PairSet withScore(Integer score) {				
        this.score = score;						
        return this;						
    }										

}

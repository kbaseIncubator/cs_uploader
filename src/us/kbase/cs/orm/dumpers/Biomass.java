package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class Biomass extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="mod_date", type=ColumnType.DATE)		
    private Long modDate;									

    @Column(name="name", type=ColumnType.STRING)		
    private String name;									

    @Column(name="dna", type=ColumnType.FLOAT)		
    private Float dna;									

    @Column(name="protein", type=ColumnType.FLOAT)		
    private Float protein;									

    @Column(name="cell_wall", type=ColumnType.FLOAT)		
    private Float cellWall;									

    @Column(name="lipid", type=ColumnType.FLOAT)		
    private Float lipid;									

    @Column(name="cofactor", type=ColumnType.FLOAT)		
    private Float cofactor;									

    @Column(name="energy", type=ColumnType.FLOAT)		
    private Float energy;									

    private Biomass() throws IOException{		
        super();							
    }										

    public static Biomass newDumper() throws IOException{	
        return new Biomass();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public Biomass withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public Long getMod_date() {		
        return modDate;				
    }							

    public void setMod_date(Long modDate) {		
        this.modDate = modDate;				
    }								

    public Biomass withMod_date(Long modDate) {				
        this.modDate = modDate;						
        return this;						
    }										

    public String getName() {		
        return name;				
    }							

    public void setName(String name) {		
        this.name = name;				
    }								

    public Biomass withName(String name) {				
        this.name = name;						
        return this;						
    }										

    public Float getDna() {		
        return dna;				
    }							

    public void setDna(Float dna) {		
        this.dna = dna;				
    }								

    public Biomass withDna(Float dna) {				
        this.dna = dna;						
        return this;						
    }										

    public Float getProtein() {		
        return protein;				
    }							

    public void setProtein(Float protein) {		
        this.protein = protein;				
    }								

    public Biomass withProtein(Float protein) {				
        this.protein = protein;						
        return this;						
    }										

    public Float getCell_wall() {		
        return cellWall;				
    }							

    public void setCell_wall(Float cellWall) {		
        this.cellWall = cellWall;				
    }								

    public Biomass withCell_wall(Float cellWall) {				
        this.cellWall = cellWall;						
        return this;						
    }										

    public Float getLipid() {		
        return lipid;				
    }							

    public void setLipid(Float lipid) {		
        this.lipid = lipid;				
    }								

    public Biomass withLipid(Float lipid) {				
        this.lipid = lipid;						
        return this;						
    }										

    public Float getCofactor() {		
        return cofactor;				
    }							

    public void setCofactor(Float cofactor) {		
        this.cofactor = cofactor;				
    }								

    public Biomass withCofactor(Float cofactor) {				
        this.cofactor = cofactor;						
        return this;						
    }										

    public Float getEnergy() {		
        return energy;				
    }							

    public void setEnergy(Float energy) {		
        this.energy = energy;				
    }								

    public Biomass withEnergy(Float energy) {				
        this.energy = energy;						
        return this;						
    }										

}

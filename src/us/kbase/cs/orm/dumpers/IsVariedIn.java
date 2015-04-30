package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class IsVariedIn extends Dumper {  	

    @Column(name="from_link", type=ColumnType.STRING)		
    private String fromLink;									

    @Column(name="to_link", type=ColumnType.STRING)		
    private String toLink;									

    @Column(name="position", type=ColumnType.INT)		
    private Integer position;									

    @Column(name="len", type=ColumnType.INT)		
    private Integer len;									

    @Column(name="data", type=ColumnType.STRING)		
    private String data;									

    @Column(name="data2", type=ColumnType.STRING)		
    private String data2;									

    @Column(name="quality", type=ColumnType.FLOAT)		
    private Float quality;									

    private IsVariedIn() throws IOException{		
        super();							
    }										

    public static IsVariedIn newDumper() throws IOException{	
        return new IsVariedIn();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public IsVariedIn withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public String getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(String toLink) {		
        this.toLink = toLink;				
    }								

    public IsVariedIn withTo_link(String toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

    public Integer getPosition() {		
        return position;				
    }							

    public void setPosition(Integer position) {		
        this.position = position;				
    }								

    public IsVariedIn withPosition(Integer position) {				
        this.position = position;						
        return this;						
    }										

    public Integer getLen() {		
        return len;				
    }							

    public void setLen(Integer len) {		
        this.len = len;				
    }								

    public IsVariedIn withLen(Integer len) {				
        this.len = len;						
        return this;						
    }										

    public String getData() {		
        return data;				
    }							

    public void setData(String data) {		
        this.data = data;				
    }								

    public IsVariedIn withData(String data) {				
        this.data = data;						
        return this;						
    }										

    public String getData2() {		
        return data2;				
    }							

    public void setData2(String data2) {		
        this.data2 = data2;				
    }								

    public IsVariedIn withData2(String data2) {				
        this.data2 = data2;						
        return this;						
    }										

    public Float getQuality() {		
        return quality;				
    }							

    public void setQuality(Float quality) {		
        this.quality = quality;				
    }								

    public IsVariedIn withQuality(Float quality) {				
        this.quality = quality;						
        return this;						
    }										

}

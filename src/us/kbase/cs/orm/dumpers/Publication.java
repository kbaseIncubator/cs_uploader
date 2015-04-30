package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class Publication extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="title", type=ColumnType.STRING)		
    private String title;									

    @Column(name="link", type=ColumnType.STRING)		
    private String link;									

    @Column(name="pubdate", type=ColumnType.DATE)		
    private Long pubdate;									

    private Publication() throws IOException{		
        super();							
    }										

    public static Publication newDumper() throws IOException{	
        return new Publication();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public Publication withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public String getTitle() {		
        return title;				
    }							

    public void setTitle(String title) {		
        this.title = title;				
    }								

    public Publication withTitle(String title) {				
        this.title = title;						
        return this;						
    }										

    public String getLink() {		
        return link;				
    }							

    public void setLink(String link) {		
        this.link = link;				
    }								

    public Publication withLink(String link) {				
        this.link = link;						
        return this;						
    }										

    public Long getPubdate() {		
        return pubdate;				
    }							

    public void setPubdate(Long pubdate) {		
        this.pubdate = pubdate;				
    }								

    public Publication withPubdate(Long pubdate) {				
        this.pubdate = pubdate;						
        return this;						
    }										

}

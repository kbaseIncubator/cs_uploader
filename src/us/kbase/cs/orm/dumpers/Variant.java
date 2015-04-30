package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class Variant extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="role_rule", type=ColumnType.TEXT)		
    private String roleRule;									

    @Column(name="code", type=ColumnType.STRING)		
    private String code;									

    @Column(name="type", type=ColumnType.STRING)		
    private String type;									

    @Column(name="comment", type=ColumnType.TEXT)		
    private String comment;									

    private Variant() throws IOException{		
        super();							
    }										

    public static Variant newDumper() throws IOException{	
        return new Variant();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public Variant withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public String getRole_rule() {		
        return roleRule;				
    }							

    public void setRole_rule(String roleRule) {		
        this.roleRule = roleRule;				
    }								

    public Variant withRole_rule(String roleRule) {				
        this.roleRule = roleRule;						
        return this;						
    }										

    public String getCode() {		
        return code;				
    }							

    public void setCode(String code) {		
        this.code = code;				
    }								

    public Variant withCode(String code) {				
        this.code = code;						
        return this;						
    }										

    public String getType() {		
        return type;				
    }							

    public void setType(String type) {		
        this.type = type;				
    }								

    public Variant withType(String type) {				
        this.type = type;						
        return this;						
    }										

    public String getComment() {		
        return comment;				
    }							

    public void setComment(String comment) {		
        this.comment = comment;				
    }								

    public Variant withComment(String comment) {				
        this.comment = comment;						
        return this;						
    }										

}

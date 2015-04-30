package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class EcNumber extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="obsolete", type=ColumnType.BOOLEAN)		
    private Byte obsolete;									

    @Column(name="replacedby", type=ColumnType.STRING)		
    private String replacedby;									

    private EcNumber() throws IOException{		
        super();							
    }										

    public static EcNumber newDumper() throws IOException{	
        return new EcNumber();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public EcNumber withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public Byte getObsolete() {		
        return obsolete;				
    }							

    public void setObsolete(Byte obsolete) {		
        this.obsolete = obsolete;				
    }								

    public EcNumber withObsolete(Byte obsolete) {				
        this.obsolete = obsolete;						
        return this;						
    }										

    public String getReplacedby() {		
        return replacedby;				
    }							

    public void setReplacedby(String replacedby) {		
        this.replacedby = replacedby;				
    }								

    public EcNumber withReplacedby(String replacedby) {				
        this.replacedby = replacedby;						
        return this;						
    }										

}

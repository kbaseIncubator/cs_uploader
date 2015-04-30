package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class DescribesTreeNode extends Dumper {  	

    @Column(name="from_link", type=ColumnType.STRING)		
    private String fromLink;									

    @Column(name="to_link", type=ColumnType.STRING)		
    private String toLink;									

    @Column(name="value", type=ColumnType.STRING)		
    private String value;									

    @Column(name="node_id", type=ColumnType.STRING)		
    private String nodeId;									

    private DescribesTreeNode() throws IOException{		
        super();							
    }										

    public static DescribesTreeNode newDumper() throws IOException{	
        return new DescribesTreeNode();			
    }								

    public String getFrom_link() {		
        return fromLink;				
    }							

    public void setFrom_link(String fromLink) {		
        this.fromLink = fromLink;				
    }								

    public DescribesTreeNode withFrom_link(String fromLink) {				
        this.fromLink = fromLink;						
        return this;						
    }										

    public String getTo_link() {		
        return toLink;				
    }							

    public void setTo_link(String toLink) {		
        this.toLink = toLink;				
    }								

    public DescribesTreeNode withTo_link(String toLink) {				
        this.toLink = toLink;						
        return this;						
    }										

    public String getValue() {		
        return value;				
    }							

    public void setValue(String value) {		
        this.value = value;				
    }								

    public DescribesTreeNode withValue(String value) {				
        this.value = value;						
        return this;						
    }										

    public String getNode_id() {		
        return nodeId;				
    }							

    public void setNode_id(String nodeId) {		
        this.nodeId = nodeId;				
    }								

    public DescribesTreeNode withNode_id(String nodeId) {				
        this.nodeId = nodeId;						
        return this;						
    }										

}

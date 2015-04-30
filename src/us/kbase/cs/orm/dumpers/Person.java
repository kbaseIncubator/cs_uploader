package us.kbase.cs.orm.dumpers;  	

import us.kbase.cs.orm.Column;
import us.kbase.cs.orm.ColumnType;
import us.kbase.cs.orm.Dumper;

import java.io.IOException;	

public class Person extends Dumper {  	

    @Column(name="id", type=ColumnType.STRING)		
    private String id;									

    @Column(name="firstName", type=ColumnType.STRING)		
    private String firstName;									

    @Column(name="lastName", type=ColumnType.STRING)		
    private String lastName;									

    @Column(name="contactEmail", type=ColumnType.STRING)		
    private String contactEmail;									

    @Column(name="institution", type=ColumnType.STRING)		
    private String institution;									

    @Column(name="source_id", type=ColumnType.STRING)		
    private String sourceId;									

    private Person() throws IOException{		
        super();							
    }										

    public static Person newDumper() throws IOException{	
        return new Person();			
    }								

    public String getId() {		
        return id;				
    }							

    public void setId(String id) {		
        this.id = id;				
    }								

    public Person withId(String id) {				
        this.id = id;						
        return this;						
    }										

    public String getFirstName() {		
        return firstName;				
    }							

    public void setFirstName(String firstName) {		
        this.firstName = firstName;				
    }								

    public Person withFirstName(String firstName) {				
        this.firstName = firstName;						
        return this;						
    }										

    public String getLastName() {		
        return lastName;				
    }							

    public void setLastName(String lastName) {		
        this.lastName = lastName;				
    }								

    public Person withLastName(String lastName) {				
        this.lastName = lastName;						
        return this;						
    }										

    public String getContactEmail() {		
        return contactEmail;				
    }							

    public void setContactEmail(String contactEmail) {		
        this.contactEmail = contactEmail;				
    }								

    public Person withContactEmail(String contactEmail) {				
        this.contactEmail = contactEmail;						
        return this;						
    }										

    public String getInstitution() {		
        return institution;				
    }							

    public void setInstitution(String institution) {		
        this.institution = institution;				
    }								

    public Person withInstitution(String institution) {				
        this.institution = institution;						
        return this;						
    }										

    public String getSource_id() {		
        return sourceId;				
    }							

    public void setSource_id(String sourceId) {		
        this.sourceId = sourceId;				
    }								

    public Person withSource_id(String sourceId) {				
        this.sourceId = sourceId;						
        return this;						
    }										

}

package us.kbase.cs.orm;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
/**
 * KSaplingDBDCompiler reads Central Store XML schema and generates dumper classes (for each MySQL table) that 
 * can be used to dump data into CSV files. Such CSV files are ready for upload to CS by mysqlimport.  
 * 
 * @author Pavel Novichkov <psnovichkov@lbl.gov>
 * @version 1.0
 */


public class KSaplingDBDCompiler {
	
	private static final String DUMPERS_PACKAGE = KSaplingDBDCompiler.class.getPackage().getName() + ".dumpers";

	HashSet<String> types = new HashSet<String>();
	Hashtable<String, KSaplingDBDEntity> name2Entities = new Hashtable<String, KSaplingDBDEntity> ();
	Hashtable<String, KSaplingDBDRelationship> name2Relationships = new Hashtable<String, KSaplingDBDRelationship> ();
	
	@SuppressWarnings("unchecked")
	public void compile(String fileName) throws DocumentException, IOException{
		Document document = new SAXReader().read(new File(fileName)); 
        Element root = document.getRootElement();
        
        // Build Entities
        for( Element entities: (List<Element>) root.elements("Entities")){
            for( Element ent: (List<Element>) entities.elements("Entity")){
            	buildEntity(ent);
            }
        }
        
        // Build Relationships
        for( Element rels: (List<Element>) root.elements("Relationships")){
            for( Element rel: (List<Element>) rels.elements("Relationship")){
            	buildRelationships(rel);
            }
        }
        
        
        // Write Entities
        for(KSaplingDBDEntity entity: name2Entities.values()){
        	File file = classFile(entity.getName());
        	entity.write(file, DUMPERS_PACKAGE);
        }
        
        // Write Relationships
        for(KSaplingDBDRelationship relationship: name2Relationships.values()){
        	File file = classFile(relationship.getName());
        	relationship.write(file, DUMPERS_PACKAGE);
        }

        
        System.out.println("Field types: " + types);
	}
	
	private void buildRelationships(Element rel) {
    	String className = rel.attributeValue("name");
    	String entFrom = rel.attributeValue("from");
    	String entTo = rel.attributeValue("to");
    	String converse = rel.attributeValue("converse");
    	//String arity = rel.attributeValue("arity");
    	
    	KSaplingDBDEntity entityFrom = name2Entities.get(entFrom);
    	KSaplingDBDEntity entityTo= name2Entities.get(entTo);
    	
    	List<KSaplingDBDField> fields = getFields(rel);
    	KSaplingDBDRelationship relationship;
    	
    	
    	// Build direct relationship
    	relationship = new KSaplingDBDRelationship(className,fields,entityFrom,entityTo);
        name2Relationships.put(relationship.getName(), relationship);

    	// Build reverse relationship
    	relationship = new KSaplingDBDRelationship(converse,fields,entityTo, entityFrom);
        name2Relationships.put(relationship.getName(), relationship);	
	}


	private void buildEntity(Element ent) throws IOException{
    	String className = ent.attributeValue("name");
    	String keyType = ent.attributeValue("keyType");
    	KSaplingDBDField keyField = new KSaplingDBDField("id", keyType);
    	
    	List<KSaplingDBDField> fields = getFields(ent);
    	KSaplingDBDEntity entity = new KSaplingDBDEntity(className, keyField, fields);
    	name2Entities.put(entity.getName(), entity);
	}

	private File classFile(String name){
		return new File(rootDir(), DUMPERS_PACKAGE.replace(".", "/") + "/" + name + ".java");
	}
	
	
	private File rootDir(){
	    File classPath = new File(KSaplingDBDCompiler.class.getClassLoader().getResource("").getPath());
	    return new File( classPath.getParentFile(), "src");
	}
	
	@SuppressWarnings("unchecked")
	private List<KSaplingDBDField> getFields(Element ent) {
		List<KSaplingDBDField> fields = new ArrayList<KSaplingDBDField>();
    	for(Element flds: (List<Element>) ent.elements("Fields")){
    		for(Element fld: (List<Element>) flds.elements("Field")){
    			String fieldName = fld.attributeValue("name").replace("-", "_");
    			String fieldType = fld.attributeValue("type"); 
    			KSaplingDBDField field = new KSaplingDBDField(fieldName, fieldType);
    			fields.add(field);
    			types.add(fieldType);    			
    		}
    	}
		return fields;
	}


	public static void main(String[] args) throws DocumentException, IOException {
		//new KSaplingDBDCompiler().compile("/kb/dev_container/modules/kb_seed/lib/KSaplingDBD.xml");
		new KSaplingDBDCompiler().compile("/kb/dev_container/modules/kb_seed/lib/KSaplingDBD_Published_JB.xml");		
	}
}

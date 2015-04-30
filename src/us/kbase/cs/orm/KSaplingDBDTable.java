package us.kbase.cs.orm;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/**
 * @author Pavel Novichkov <psnovichkov@lbl.gov>
 * @version 1.0
 */

public abstract class KSaplingDBDTable {
	private String name;
	private List<KSaplingDBDField> fields = new ArrayList<KSaplingDBDField>();
	
	public KSaplingDBDTable(String name, List<KSaplingDBDField> fields) {
		super();
		this.name = name;
		this.fields = fields;
	}

	public String getName() {
		return name;
	}

	public List<KSaplingDBDField> getFields() {
		return fields;
	}

	public abstract List<KSaplingDBDField> getExtraFields();
	
	
	public void write(File file, String packageName) throws IOException{
		
		// Collect all fields
    	List<KSaplingDBDField> allFields = new ArrayList<KSaplingDBDField>();
    	allFields.addAll( getExtraFields() );
    	allFields.addAll(fields);
    	
		// Collect all imports
		HashSet<String> imports = getImports(allFields);
		imports.add(IOException.class.getName());
		imports.add(Dumper.class.getName());
		imports.add(Column.class.getName());
		imports.add(ColumnType.class.getName());
		
		
    	//Write class
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		try{
			writePackage(bw, packageName);
			wirteImports(bw, imports);
			writeClassContent(bw,allFields);
		} 
		finally{
	    	bw.close();
		}
	}
	
	private void writeClassContent(BufferedWriter bw, List<KSaplingDBDField> fields) throws IOException {			
    	writeClassName(bw);
    	writeFieldsDeclarations(bw, fields);
    	writeConstructor(bw);
    	writeMethodNewDumper(bw);
    	writeGettersSettersWiths(bw, fields);
		writeClassEnd(bw);
	}

	
	private HashSet<String> getImports(List<KSaplingDBDField> fields) {
		HashSet<String> imports = new HashSet<String>();
		for(KSaplingDBDField field: fields){
			Class<?> cls = field.getColumnType().getType(); 
			if(!cls.getPackage().getName().startsWith("java.lang")){
				imports.add(cls.getName());
			}  
		}		
		return imports;
	}


	private void writeClassEnd(BufferedWriter bw) throws IOException {
		bw.write("}\n");
	}


	private void writeGettersSettersWiths(BufferedWriter bw, List<KSaplingDBDField> fields) throws IOException {
		
		for(KSaplingDBDField field: fields){
			writeGetter(bw, field);
			writeSetter(bw, field);
			writeWith(bw, field);
		}
	}

	
	private void wirteImports(BufferedWriter bw, HashSet<String> imports) throws IOException {
		for(String imp: imports){
			bw.write( 
					String.format(
							"import %s;	\n" 
							,imp
			));		
		}
		bw.newLine();
	}
	
	
	/**
	 * Example:
	 * public void setId(String id) {
	 * 	this.id = id;
	 * }
	 */
	private void writeSetter(BufferedWriter bw, KSaplingDBDField field) throws IOException {
		bw.write( 
				String.format(
						"    public void set%s(%s %s) {		\n" + 
						"        this.%s = %s;				\n" + 
						"    }								\n"  
						,field.getuName()
						,field.getColumnType().getType().getSimpleName()
						,field.getjName()
						,field.getjName()
						,field.getjName()
		));
		bw.newLine();		
	}


	/**
	 * Example:
	 * 	public String getId() {
	 *   return id;
	 *  }   
	 */
	private void writeGetter(BufferedWriter bw, KSaplingDBDField field) throws IOException {
		bw.write( 
				String.format(
						"    public %s get%s() {		\n" + 
						"        return %s;				\n" + 
						"    }							\n"  
						,field.getColumnType().getType().getSimpleName()
						,field.getuName()
						,field.getjName()
		));
		bw.newLine();		
	}

	
	/**
	 * Example:
	 * public Association withId(String id) {
	 *	 this.id = id;
	 * 	return this;
	 * }	
	 *   
	 */
	private void writeWith(BufferedWriter bw, KSaplingDBDField field) throws IOException {
		bw.write( 
				String.format(
						"    public %s with%s(%s %s) {				\n" + 
						"        this.%s = %s;						\n" + 
						"        return this;						\n" + 
						"    }										\n"  
						,name
						,field.getuName()
						,field.getColumnType().getType().getSimpleName()
						,field.getjName()
						,field.getjName()
						,field.getjName()
		));
		bw.newLine();		
	}


	
	
	/**
	 * Example:
	 * private Association() throws IOException{
	 * 	super();
	 * }
	 */
	private void writeConstructor(BufferedWriter bw) throws IOException {
		bw.write( 
				String.format(
						"    private %s() throws IOException{		\n" +
						"        super();							\n" +
						"    }										\n" 
						,name
		));
		bw.newLine();		
	}
	
	
	/**
	 * public static Association newDumper() throws IOException{
	 *  return new Association();
	 * }  
	 */
	private void writeMethodNewDumper(BufferedWriter bw) throws IOException {
		bw.write( 
				String.format(
						"    public static %s newDumper() throws IOException{	\n" + 
						"        return new %s();			\n" +
						"    }								\n"					
						,name
						,name
		));
		bw.newLine();		
	}


	private void writeFieldsDeclarations(BufferedWriter bw, List<KSaplingDBDField> fields) throws IOException {
		for(KSaplingDBDField field: fields){
			writeFieldDeclaration(bw, field);
		}
	}

	/**
	 * Example:
	 * 	@Column(name="id", type=ColumnType.STRING)
	 *  private String id;
	 */
	private void writeFieldDeclaration(BufferedWriter bw, KSaplingDBDField field) throws IOException {
		bw.write( 
				String.format(
						"    @Column(name=\"%s\", type=ColumnType.%s)		\n" +
						"    private %s %s;									\n"
						,field.getName()
						,field.getColumnType().name() 
						,field.getColumnType().getType().getSimpleName()
						,field.getjName()
		));
		bw.newLine();
	}
	
	
	/**
	 * Example:
	 * public class Association extends Dumper {
	 */
	private void writeClassName(BufferedWriter bw) throws IOException {
		bw.write(
				String.format(
						"public class %s extends Dumper {  	\n"
						,name
		));
		bw.newLine();
	}


	private void writePackage(BufferedWriter bw, String packageName) throws IOException {
		bw.write(
				String.format(
						"package %s;  	\n"
						,packageName
		));
		bw.newLine();
	}
	
}

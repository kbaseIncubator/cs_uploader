package us.kbase.cs.orm;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Comparator;
/**
 * Dumper class is a base class for all dumpers. A particular dumper is used to export 
 * data into CSV file that can be imported into a corresponding CS table using mysqlimport
 *   
 * @author Pavel Novichkov <psnovichkov@lbl.gov>
 * @version 1.0
 */

public abstract class Dumper {
	
	private static final String CSV_EXTENSION = ".csv";
	private static final int MAX_LONG_STRING_SIZE = 500;
	private static final int MAX_STRING_SIZE = 250;
	private static final String NULL = "NULL";
	private static final boolean USE_NULL = false;
	
	private static String targetDir = null;
	private static Comparator<Field> fieldComparator = new Comparator<Field>(){
		@Override
		public int compare(Field f1, Field f2) {
			return f1.getName().compareTo(f2.getName());
		}		
	};
	
	public static void setTargetDirectory(String targetDir){
		Dumper.targetDir = targetDir;	
	}

	private BufferedWriter bw; 
	private boolean commaNeeded;
	
	protected Dumper() throws IOException{
		bw = buildWriter( this.getClass().getSimpleName() + CSV_EXTENSION );
		writeColumnsHeader(this.getClass(), bw);
		bw.write("\n");
	}
		
	private  static  Field[] getFields(Class<?> cls){
		Field[] fields = cls.getDeclaredFields();
		
/*		
		int startIindex = fields[0].getName().equals("id") ? 1: 0;
		int endIndex = fields.length;	
		Arrays.sort(fields, startIindex, endIndex, fieldComparator );
*/		
		return fields;
	}
	
	private static void writeColumnsHeader(Class<?> cls, BufferedWriter bw) throws IOException {
		boolean commaNeeded = false;
		for(Field field: getFields(cls)){
			
			boolean isFieldAccessible = field.isAccessible();  
			if(!isFieldAccessible){
				field.setAccessible(true);
			}
			for(Annotation annotation: field.getDeclaredAnnotations()){
				if(annotation instanceof Column){
					
					Column column = (Column) annotation;
					
					if(commaNeeded){
						bw.write(",");
					}					
					bw.write(column.name());
					commaNeeded = true;
					break;
				}
			}
			if(!isFieldAccessible){
				field.setAccessible(false);
			}
		}
	}
	
	private static BufferedWriter buildWriter(String fileName) throws IOException{
		BufferedWriter bw;
		if(targetDir != null){
			bw = new BufferedWriter(new FileWriter(new File(targetDir, fileName)));
		} else{
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
		}
		return bw;
	}
	
	public void close() throws IOException{
		if( bw != null){
			bw.close();
			bw = null;
		}
	}
	
	public void flush() throws IOException{
		if( bw != null){
			bw.flush();
		}
	}	
	
	public static void createImportScript(DumperBundle bundle, String fileName) throws IOException {
		BufferedWriter bw = buildWriter(fileName);
		

		
		for(Field field: getFields(bundle.getClass())){
			boolean isFieldAccessible = field.isAccessible();  
			if(!isFieldAccessible){
				field.setAccessible(true);
			}
				
			if( Dumper.class.isAssignableFrom( field.getType() ) ){
				
				bw.write(
						"mysqlimport --local --ignore --compress --ignore-lines=1 --fields-optionally-enclosed-by='\"' --fields-terminated-by=',' --lines-terminated-by='\\n' "
				);
				bw.write( " --columns="  );
				writeColumnsHeader(field.getType(), bw);
				bw.write(" $@  ");
				bw.write( " " + field.getType().getSimpleName() + CSV_EXTENSION);	
				bw.write("\n");
			}
			
			if(!isFieldAccessible){
				field.setAccessible(false);
			}
		}
		
		bw.close();
	}

	public static void flush(DumperBundle dumpersBundle) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		invokeMethod(dumpersBundle, "flush");
	}
	
	public static void close(DumperBundle dumpersBundle) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		invokeMethod(dumpersBundle, "close");
	}
	
	private static void invokeMethod(DumperBundle dumpersBundle, String methodName) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		
		for(Field field: getFields(dumpersBundle.getClass())){
			boolean isFieldAccessible = field.isAccessible();  
			if(!isFieldAccessible){
				field.setAccessible(true);
			}
				
				
			if( Dumper.class.isAssignableFrom( field.getType() ) ){
				
				Method method = field.getType().getMethod(methodName);
				method.invoke(field.get(dumpersBundle));
			}
			
			if(!isFieldAccessible){
				field.setAccessible(false);
			}
		}
	}
	
	public static void init(DumperBundle dumpersBundle) throws NoSuchMethodException, SecurityException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {		
		for(Field field: getFields(dumpersBundle.getClass())){
			boolean isFieldAccessible = field.isAccessible();  
			if(!isFieldAccessible){
				field.setAccessible(true);
			}

			if( Dumper.class.isAssignableFrom( field.getType() ) ){
				Method newDumperMethod = field.getType().getMethod("newDumper");
				field.set(dumpersBundle, newDumperMethod.invoke(null));
			}		
			
			if(!isFieldAccessible){
				field.setAccessible(false);
			}
		}
	}

	public void push() throws Exception{

		commaNeeded = false;
		for(Field field: getFields(this.getClass())){
			
			boolean isFieldAccessible = field.isAccessible();  
			if(!isFieldAccessible){
				field.setAccessible(true);
			}
			
			for(Annotation annotation: field.getDeclaredAnnotations()){
				if(annotation instanceof Column){
					Column column = (Column) annotation;
					Object value = field.get(this);
					
					if(commaNeeded){
						addComma();
					}
	
/*					
				TEXT(String.class), 
				CHAR(Character.class), 
				INT (Integer.class),
				COUNTER(Long.class),
				SEMI_BOOLEAN(Character.class),
				LONG_STRING(String.class),
				STRING(String.class), 
				BOOLEAN (Byte.class), 
				DATE (Long.class), 
				FLOAT (Float.class),
				UNSUPPORTED (Object.class);						
*/					
					
					switch(column.type()){
						case TEXT:{
							dumpTEXT(column.name(), (String) value);
							break;
						}
						case CHAR:{
							dumpCHAR(column.name(), (Character) value);
							break;
						}
						case INT:{
							dumpINT(column.name(), (Integer) value);
							break;
						}	
						case COUNTER:{
							dumpCOUNTER(column.name(), (Long) value);
							break;
						}	
						case SEMI_BOOLEAN:{
							dumpSEMI_BOOLEAN(column.name(), (Character) value);
							break;
						}	
						case LONG_STRING:{
							dumpLONG_STRING(column.name(), (String) value);
							break;
						}	
						case STRING:{
							dumpSTRING(column.name(), (String) value);
							break;
						}
						case BOOLEAN:{
							dumpBOOLEAN(column.name(), (Byte) value);
							break;
						}
						case DATE:{
							dumpDATE(column.name(), (Long) value);
							break;
						}
						case FLOAT:{
							dumpFLOAT(column.name(), (Float) value);
							break;
						}
						case UNSUPPORTED:{
							throw new Exception("field: " + field.getName() + " of class" + this.getClass().getName() + " has unsupported type");
						}
					}
					
					commaNeeded = true;
					//Only one annotation of type Column is allowed
					break;
				}
			}
			
			if(!isFieldAccessible){
				field.setAccessible(false);
			}
		}
		
		flushRecord();
	}
	

	private void dumpFLOAT(String name, Float value) throws IOException {
		if(USE_NULL){
			bw.write(value != null ? value.toString(): NULL);
		} else{
			if(value == null){
				value = Float.valueOf(0);
			}
			bw.write(value.toString());
		}
	}

	private void dumpDATE(String name, Long value) throws IOException {
		if(USE_NULL){
			bw.write(value != null ? value.toString(): NULL);
		} else{
			
			if(value == null){
				value = Long.valueOf(0);
			}
			bw.write(value.toString());
		}
	}

	private void dumpBOOLEAN(String name, Byte value) throws IOException {
		if(USE_NULL){
			bw.write(value != null ? value.toString(): NULL);
		} else{
			if(value == null){
				value = Byte.valueOf((byte)0);
			}
			bw.write(value.toString());		
		}
	}

	private void dumpSTRING(String name, String value) throws IOException {
		if(USE_NULL){
			if(value != null && value.length() > MAX_STRING_SIZE){
				value = value.substring(0,MAX_STRING_SIZE);
			}
			
			bw.write(value != null ? value.toString(): NULL);
		} else{
			if(value == null){
				value = String.valueOf("");
			}
			if(value.length() > MAX_STRING_SIZE){
				value = value.substring(0,MAX_STRING_SIZE);
			}		
			bw.write("\"" + value + "\"");		
		}
	}

	private void dumpLONG_STRING(String name, String value) throws IOException {
		if(USE_NULL){
			if(value != null && value.length() > MAX_LONG_STRING_SIZE){
				value = value.substring(0,MAX_LONG_STRING_SIZE);
			}
			bw.write(value != null ? ("\"" + value + "\""): NULL);
		} else{
			if(value == null){
				value = String.valueOf("");
			}
			if(value.length() > MAX_LONG_STRING_SIZE){
				value = value.substring(0,MAX_LONG_STRING_SIZE);
			}
			bw.write("\"" + value + "\"");
		}		
	}

	private void dumpSEMI_BOOLEAN(String name, Character value) throws IOException {
		if(USE_NULL){
			bw.write(value != null ? ("\"" + value + "\""): NULL);	
		} else{
			if(value == null){
				value = Character.valueOf(' ');
			}
			bw.write("\"" + value + "\"");
		}
	}

	private void dumpCOUNTER(String name, Long value) throws IOException {
		if(USE_NULL){
			bw.write(value != null ? value.toString(): NULL);	
		} else{
			if(value == null){
				value = Long.valueOf(0);
			}
			bw.write(value.toString());
		}
	}

	private void dumpINT(String name, Integer value) throws IOException {
		if(USE_NULL){
			bw.write(value != null ? value.toString(): NULL);	
		} else{
			if(value == null){
				value = Integer.valueOf(0);
			}
			bw.write(value.toString());
		}
	}

	private void dumpCHAR(String name, Character value) throws IOException {
		if(USE_NULL){
			bw.write(value != null ? ("\"" + value + "\""): NULL);			
		} else{
			if(value == null){
				value = Character.valueOf(' ');
			}
			bw.write("\"" + value + "\"");	
		}
	}

	private void dumpTEXT(String name, String value) throws IOException {
		if(USE_NULL){
			bw.write(value != null ? ("\"" + value + "\""): NULL);			
		} else{
			if(value == null){
				value = String.valueOf("");
			}
			bw.write("\"" + value + "\"");
		}
	}

	private void addComma() throws IOException {
		bw.write(",");
	}

	private void flushRecord() throws IOException {
		bw.write("\n");
	}
}

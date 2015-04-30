package us.kbase.cs.orm;

/**
 * Data types used in the CS XML schema
 * @author Pavel Novichkov <psnovichkov@lbl.gov>
 * @version 1.0
 */

public enum ColumnType {

	/**
	 * Current types: [rectangle, text, dna, char, int, counter, semi-boolean, string, long-string, image, boolean, date, float, countVector]
	 * Supported types: text, char, int, counter, semi-boolean, string, long-string, boolean, date, float
	 * Unsupported: rectangle, dna, image, countVector
	 *
	 */
	
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

	
	private Class<?> cls;	
	private ColumnType(Class<?> cls){
		this.cls = cls;
	}

	public Class<?> getType(){
		return cls;
	}
	
}

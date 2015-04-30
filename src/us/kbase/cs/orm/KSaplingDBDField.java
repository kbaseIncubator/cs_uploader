package us.kbase.cs.orm;

import java.util.Arrays;
import java.util.HashSet;
/**
 * @author Pavel Novichkov <psnovichkov@lbl.gov>
 * @version 1.0
 */


public class KSaplingDBDField {
	private static final HashSet<String> BAD_FIELD_NAMES = new HashSet<String>(Arrays.asList(new String[]{"private"}));
	
	private String name;
	private String jName;
	private String uName;
	private String type;
	private ColumnType columnType;
	
	KSaplingDBDField(String name, String type){
		this.name = name;
		this.type = type;
		this.columnType = buildColumnType(type);
		this.jName = buildJName(name);
		this.uName = buildUName(name);

	}
	
	private String buildUName(String name) {
		return "" + Character.toUpperCase(name.charAt(0)) + name.substring(1);
	}
	
	
	private String buildJName(String name){
		String jName = name;
		if(BAD_FIELD_NAMES.contains(jName)){
			jName = "_" + jName;
		}
			
		StringBuffer sb = new StringBuffer(jName.length());
		boolean isUnderscoreChar = false;
		for(int i = 0; i < jName.length(); i++){
			char ch = jName.charAt(i);
			if(isUnderscoreChar){
				ch = Character.toUpperCase(ch); 
				isUnderscoreChar = false;
			}
			
			if(ch == '-' || ch == '_'){
				isUnderscoreChar = true;
			} else{
				sb.append(ch);
			}
		}			
		return sb.toString();
	}
	
	private ColumnType buildColumnType(String type) {
		ColumnType columnType = ColumnType.UNSUPPORTED;
		try{
			columnType = Enum.valueOf(ColumnType.class, type.toUpperCase().replace("-", "_"));
		} catch(Exception e){}
		return columnType;
	}

	public String getName() {
		return name;
	}

	public String getjName() {
		return jName;
	}

	public String getuName() {
		return uName;
	}

	public String getType() {
		return type;
	}

	public ColumnType getColumnType() {
		return columnType;
	}
	
	
	
}

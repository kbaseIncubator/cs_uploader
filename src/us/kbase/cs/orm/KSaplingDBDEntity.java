package us.kbase.cs.orm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author Pavel Novichkov <psnovichkov@lbl.gov>
 * @version 1.0
 */

public class KSaplingDBDEntity extends KSaplingDBDTable{

	private KSaplingDBDField keyField;
	
	public KSaplingDBDEntity(String name, KSaplingDBDField keyField,  List<KSaplingDBDField> fields) {
		super(name, fields);
		this.keyField = keyField;
	}

	public KSaplingDBDField getKeyField() {
		return keyField;
	}
	

	public List<KSaplingDBDField> getExtraFields(){
		return new ArrayList<KSaplingDBDField>(Arrays.asList(keyField));
	}	
}

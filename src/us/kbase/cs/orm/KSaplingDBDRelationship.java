package us.kbase.cs.orm;

import java.util.ArrayList;
import java.util.List;
/**
 * @author Pavel Novichkov <psnovichkov@lbl.gov>
 * @version 1.0
 */

public class KSaplingDBDRelationship extends KSaplingDBDTable{
	private KSaplingDBDEntity entityFrom;
	private KSaplingDBDEntity entityTo;
	
	
	public KSaplingDBDRelationship(String name, List<KSaplingDBDField> fields,
			KSaplingDBDEntity entityFrom, KSaplingDBDEntity entityTo) {
		super(name, fields);
		this.entityFrom = entityFrom;
		this.entityTo = entityTo;
	}


	public KSaplingDBDEntity getEntityFrom() {
		return entityFrom;
	}


	public KSaplingDBDEntity getEntityTo() {
		return entityTo;
	}

	
	public List<KSaplingDBDField> getExtraFields(){
		List<KSaplingDBDField> extraFields =  new ArrayList<KSaplingDBDField>();
		extraFields.add(new KSaplingDBDField("from_link", entityFrom.getKeyField().getType()) );
		extraFields.add(new KSaplingDBDField("to_link", entityTo.getKeyField().getType()) );
		
		return extraFields;
	}	
	
	
}

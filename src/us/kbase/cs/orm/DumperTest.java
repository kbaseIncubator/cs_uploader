package us.kbase.cs.orm;

import junit.framework.TestCase;
import us.kbase.cs.orm.dumpers.Association;
import us.kbase.cs.orm.dumpers.StrainWithPlatforms;
/**
 * @author Pavel Novichkov <psnovichkov@lbl.gov>
 * @version 1.0
 */

public class DumperTest extends TestCase {
	
	public class ExpressionBundle implements DumperBundle{
		StrainWithPlatforms csStrainWithPlatforms;
		Association association;
	}
	ExpressionBundle bundle = new ExpressionBundle();

		
		
	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testDumper() throws Exception{
		Dumper.setTargetDirectory("/kb/cds/");
		Dumper.init(bundle);
		
		for(int i = 0; i < 10000; i++){
			bundle.csStrainWithPlatforms
				.withFrom_link("from_" + i)
				.withTo_link("to_" + i)
				.push();
		}
		
		for(int i = 0; i < 10000; i++){
			bundle.association
				.withConfidence( 1/0.5f)
				.withDescription("super description" + i)
				.withDirectional(i%5 == 0 ? (byte)1 : 0)
				.withId("kb|s." + i)
				.withName("name" + i)
				.withUrl("url" + i)
				.push();				
		} 

		
//		Dumper.flushDumpers(this);
		Dumper.close(bundle);
		Dumper.createImportScript(bundle, "load_expression");
		
	}	
}

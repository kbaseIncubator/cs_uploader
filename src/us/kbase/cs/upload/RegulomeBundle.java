package us.kbase.cs.upload;

import us.kbase.cs.orm.DumperBundle;
import us.kbase.cs.orm.dumpers.Effector;
import us.kbase.cs.orm.dumpers.FeatureIsTranscriptionFactorFor;
import us.kbase.cs.orm.dumpers.HasEffector;
import us.kbase.cs.orm.dumpers.IsInOperon;
import us.kbase.cs.orm.dumpers.IsRegulatorForRegulon;
import us.kbase.cs.orm.dumpers.Operon;
import us.kbase.cs.orm.dumpers.Regulator;
import us.kbase.cs.orm.dumpers.Regulome;
import us.kbase.cs.orm.dumpers.RegulomeHasGenome;
import us.kbase.cs.orm.dumpers.RegulomeHasRegulon;
import us.kbase.cs.orm.dumpers.RegulomeSource;
import us.kbase.cs.orm.dumpers.Regulon;
import us.kbase.cs.orm.dumpers.RegulonHasOperon;
import us.kbase.cs.orm.dumpers.Source;

/**
 * Bundle of dumpers for the Regulome WS object  
 * 
 * @author Pavel Novichkov <psnovichkov@lbl.gov>
 * @version 1.0
 */

public class RegulomeBundle implements DumperBundle{
	Source scSource;
	RegulomeSource scRegulomeSource;
	Regulome scRegulome;
	RegulomeHasGenome scRegulomeHasGenome;
	RegulomeHasRegulon scRegulomeHasRegulon;
	Regulon scRegulon;
	IsRegulatorForRegulon scIsRegulatorForRegulon;
	Regulator scRegulator;
	HasEffector scHasEffector;
	Effector scEffector;
	FeatureIsTranscriptionFactorFor scFeatureIsTranscriptionFactorFor;
	RegulonHasOperon scRegulonHasOperon;
	Operon scOperon;
	IsInOperon scIsInOperon;	
}

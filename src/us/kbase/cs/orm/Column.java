package us.kbase.cs.orm;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
/**
 * Represents a column in  CS table
 * @author Pavel Novichkov <psnovichkov@lbl.gov>
 * @version 1.0
 */


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Column {
	
	public String name();
	public ColumnType type();
}

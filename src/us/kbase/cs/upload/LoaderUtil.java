package us.kbase.cs.upload;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Util methods
 * 
 * @author Pavel Novichkov <psnovichkov@lbl.gov>
 * @version 1.0
 */
public class LoaderUtil {

	public static FilenameFilter buildFileNameFilter(final String prefix){
		return new FilenameFilter(){
			public boolean accept(File dir, String name) {
				return name.startsWith(prefix);
		}};
	}

	public static void printFileProgress(String prefix, File[] files, int i) {
		System.out.println("" + prefix + "[" + i + " of " + files.length + "] = " + files[i].getName());
	}	
}

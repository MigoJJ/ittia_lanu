//  https://codechacha.com/ko/java-list-files/


package Ex;

import java.io.File;
import java.io.FilenameFilter; 


public class FileListSample { 
	public static void main(String[] args) { 
//		File dir = new File("/home/migojj/jepansedoncjesuis/ittia"
//				+ "");
//		File files[] = dir.listFiles();
//
//		for (int i = 0; i < files.length; i++) {
//		    System.out.println("file: " + files[i]);
//		}}
	
	File dir = new File("/home/migojj/jepansedoncjesuis/ittia");
	FilenameFilter filter = new FilenameFilter() {
	    public boolean accept(File f, String name) {
	        return name.startsWith("p");
	    }
	};

	File files[] = dir.listFiles(filter);
	for (int i = 0; i < files.length; i++) {
	    System.out.println("file: " + files[i]);
		}
	}
}

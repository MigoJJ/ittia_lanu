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
	
	File dir = new File("/home/migojj/jepansedoncjesuis/ittia/src/ittia/jepanse/gdsclinic/la/result");
	FilenameFilter filter = new FilenameFilter() {
	    public boolean accept(File f, String name) {
	        return name.contains("2");
	    }
	};

	File files[] = dir.listFiles(filter);
	for (int i = 0; i < files.length; i++) {
		int ii = (i + 1);
	    System.out.println("번호 :  " + "[" + ii +"]");
	    System.out.println("directory + files : " + files[i]);
	    System.out.println("--------------------------------------------------------file ");
		}
	}
}

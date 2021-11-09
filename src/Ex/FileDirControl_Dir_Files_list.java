package Ex;

import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class FileDirControl_Dir_Files_list {
	public static void main(String[] args) {
		File temp = new File("/home/migojj/jepansedoncjesuis/ittia/src/Ex/RC_2020__june01_july8");
		File[] contents = temp.listFiles();
		
		SimpleDateFormat sdf = new SimpleDateFormat("\t\t yyyy-MM-dd a HH:mm");
		
		for (File file : contents) {
			System.out.println(sdf.format(new Date(file.lastModified())));
			if(file.isDirectory()) {
				System.out.print("\t<Dir>\t\t\t" + file.getName() );
			}
			else {
				System.out.print("\t<Files>\t" + file.length() + "\t" + file.getName());
				}
				
			}
		}
	}




//File dir = new File ("/home/migojj/jepansedoncjesuis/ittia/src/Ex/data2");
//File file1 = new File ("/home/migojj/jepansedoncjesuis/ittia/src/Ex/FileDirControl.java");
//System.out.println(" Working directory  ...   " + dir);
//System.out.println(" Working file  ...   " + file1);
//
//if (dir.exists() == false ) {dir.mkdirs();
//System.out.println(" Working directory  ...   " + dir);

package ittia.jepanse.gdsclinic.la;

import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class FileList {
	public static void selfilelist(String ptname) {
			File temp = new File("/home/migojj/jepansedoncjesuis/ittia/src/ittia/jepanse/gdsclinic/la/result");
			File[] contents = temp.listFiles();
			
			SimpleDateFormat sdf = new SimpleDateFormat("\t\t yyyy-MM-dd a HH:mm");
			
			for (File file : contents) {
				if (file.getName().contains(ptname) != false) {
					System.out.print("\t<Files>\t" + file.length() + "\t" + file.getName());
					System.out.println(sdf.format(new Date(file.lastModified())));
				}
				else {
				}
			}
		}
	}

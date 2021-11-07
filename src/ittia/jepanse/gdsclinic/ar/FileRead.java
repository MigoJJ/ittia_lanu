package ittia.jepanse.gdsclinic.ar;

import java.io.File;  
import java.util.Scanner;
import java.io.FileNotFoundException;

public class FileRead {
	public void startread(String texttitle) {
		System.out.println(texttitle);

		try    {
					File textDirName = new File(texttitle); 
					Scanner myReader = new Scanner(textDirName);
		
					while (myReader.hasNextLine()) {
							String data = myReader.nextLine();
							System.out.println(data);
					}
			       myReader.close();
	    } 
		catch (FileNotFoundException e) {
					System.out.println("An error occurred.");
					e.printStackTrace();
		}
		String path = System.getProperty("user.dir");
		System.out.println("Working Directory = " + path);
   }

}
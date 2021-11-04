package ittia.jepanse.gdsclinic.nu;

import java.io.File;  
import java.util.Scanner;
import java.io.FileNotFoundException;

public class FileRead {
	public void startread(String texttitle) {
		System.out.println(texttitle);

		try    {
					File myObj = new File(texttitle); 
					Scanner myReader = new Scanner(myObj);
		
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
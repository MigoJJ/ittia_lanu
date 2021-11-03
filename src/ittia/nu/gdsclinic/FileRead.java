package ittia.nu.gdsclinic;

import java.io.File;  
// Import the File class
import java.io.FileNotFoundException;
import java.util.Scanner; // Import the Scanner class to read text files

public class FileRead {
	public static void startread() {
		String texttitle = (CaseSel.myint_c);
		System.out.println(texttitle);
		try {
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
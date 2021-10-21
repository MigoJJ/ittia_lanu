package ittia.nu.gdsclinic;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class FileReading {
  public static void startread() {
	  
    try {
      File myObj = new File("./src/ittia/ius/gdsclinic/StartupMenu.txt"); 
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

	  String path = System.getProperty("user.dir");
	  System.out.println("Working Directory = " + path);
  }
}
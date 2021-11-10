package ittia.jepanse.gdsclinic.la;

import java.io.IOException;
import java.util.Scanner;

public class PatientSelection {

	public static void main(String[] args) throws IOException {
			Scanner ptin = new Scanner (System.in);  
			System.out.print ("Enter a searching code   :   ");
			String ptname = ptin.nextLine();  
			
			FileList.selfilelist(ptname);
			
			System.out.println("Entered code is  :  " + ptname);
		}
	}
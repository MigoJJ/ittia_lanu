package ittia.jepanse.gdsclinic.nu;

import java.io.IOException;
import java.util.Scanner;

public class DoctorId {
		public void doctorCode() throws IOException{
					Scanner in = new Scanner (System.in);  
					    System.out.print ("Enter a Choice Number :   ");
					    int myint = in.nextInt();  
					    System.out.print ("Enter a Choice Number inserted :   ");
					    System.out.println("The Number you entered is .....   " + myint);
					in.close();
	}

}

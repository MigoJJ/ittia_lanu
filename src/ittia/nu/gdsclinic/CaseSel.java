package ittia.nu.gdsclinic;

import java.io.IOException;
import java.util.Scanner;

public class CaseSel {
		    static String myint_c = "./src/ittia/us/gdsclinic/StartupMenu.txt";
//		    static String myint_cc = "";
           
		    static void insertCode() throws IOException {
             FileRead.startread();


				Scanner in = new Scanner (System.in);  
	                   System.out.print ("Enter a Choice Number :   ");

					     int myint = in.nextInt();  
	                   System.out.println("The Number you entered is .....   " + myint);
	   			in.close();
		       switch(myint){
			            case 1:
	                       myint_c = "./src/ittia/us/gdsclinic/Version_infomation.txt";break;
			            case 2:
			                myint_c = "./src/ittia/us/gdsclinic/DoctorLogin.txt";break;
			            case 3:
			                myint_c = "./src/ittia/us/gdsclinic/ClinicMamange.txt";break;
			            default:
			                System.out.println("i value is greater than 2 and less than 5");
		        } 

		       System.out.println(CaseSel.myint_c);
//		       System.out.println(CaseSel.myint_cc);
//		       CaseSel.myint_cc = CaseSel.myint_c;
		       FileRead.startread();
		       
		    }

}

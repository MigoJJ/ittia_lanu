package ittia.la.gdsclinic;

import java.io.IOException;
import java.util.*;
import ittia.nu.gdsclinic.*;  

public class CaseSel {

		    public static String myint_c = "./src/ittia/us/gdsclinic/StartupMenu.txt";
		    public static void insertCode() throws IOException {
		    	  
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

		       FileRead.startread();
		       System.out.println("jj migo Information");
		       PressAny.main(null);
//				PressAnyKeyC.main(null);
      }

}

package ittia.nu.gdsclinic;

import java.util.*;  

public class CaseSelection {
		    public static int myint; 
		    public static String myint_c = "./src/ittia/ius/gdsclinic/StartupMenu.txt";
		    public static void insertCode() {
		    	  
		    	FileReading.startread();
		    	  
				Scanner in = new Scanner (System.in);  
	                   System.out.print ("Enter a Choice Number :   ");
					     int myint = in.nextInt();  
	                   System.out.println("The Number you entered is .....   " + myint);
	           in.close();

		              switch(myint){
			            case 1:
			                System.out.println("1. Program Information");
	                       myint_c = "./src/ittia/ius/gdsclinic/version_infomation.txt";
			                break;
			            case 2:
			                System.out.println("2. Doctor's Login");
			                myint_c = "./src/ittia/ius/gdsclinic/DoctorLogin.txt";
			                break;
			            case 3:
			                System.out.println("3. Clinic Management System");
			                myint_c = "./src/ittia/ius/gdsclinic/ClinicMamange.txt";
			                break;
			            default:
			                System.out.println("i value is greater than 2 and less than 5");
	
		              } 
     
	        FileReading.startread();
	        System.out.println("jj migo Information");
            }
	}
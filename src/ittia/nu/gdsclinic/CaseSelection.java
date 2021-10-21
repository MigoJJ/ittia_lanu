package ittia.nu.gdsclinic;
import java.util.*;  

public class CaseSelection {
		    public static int myint; 
		    public String myint_c = "text";
		    public static void insertCode() {
		    	
				  Scanner in = new Scanner (System.in);  
	              System.out.print ("Enter a Choice Number :   ");
					   int myint = in.nextInt();  
	              System.out.println("The Number you entered is .....   " + myint);
	              in.close();

	              switch(myint){
		            case 1:
		                System.out.println("1. Program Information");
			             FileReading.startread();
		                break;
		            case 2:
		                System.out.println("2. Doctor's Login");
		                break;
		            case 3:
		                System.out.println("3. Clinic Management System");
		                break;
		            default:
		                System.out.println("i value is greater than 2 and less than 5");
            }
        }
	}


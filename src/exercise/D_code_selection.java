package exercise;

import java.util.Scanner;

public class D_code_selection {
	static String myint_c ="./src/ittia/ius/gdsclinic/StartupMenu.txt";
	public static void dcs() {
		
		FileReading.startread();
   	  
		Scanner in = new Scanner (System.in);  
              System.out.print ("Enter a Choice Number :   ");
			     int myint = in.nextInt();  
              System.out.println("The Number you entered is .....   " + myint);
       in.close();
   
    switch(myint){
    case 1:
       myint_c = "./src/ittia/ius/gdsclinic/version_infomation.txt";break;
    case 2:
        myint_c = "./src/ittia/ius/gdsclinic/DoctorLogin.txt";break;
    case 3:
        myint_c = "./src/ittia/ius/gdsclinic/ClinicMamange.txt";break;
    default:
        System.out.println("i value is greater than 2 and less than 5");
       } 
	FileReading.startread(); 
}}
package ittia.nu.gdsclinic;

import java.util.Scanner;
import ittia.la.gdsclinic.Startup;

public class PressKey {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter to be continued :  ");
        int stoptobeContinue = 1;
        stoptobeContinue = sc.nextInt();

//        System.out.print("Enter your First Name: ");
//        String firstName = sc.nextLine();
//
//        System.out.print("Enter your last Name: ");
//        String lastName = sc.nextLine();
//
//        System.out.println("Your Info:\nAge: " + age + "\nFull Name: " + firstName + " " + lastName);

        sc.close();    
        
    	if ( stoptobeContinue > 3 ){
            System.out.print("Enter to be continued 11111111111111111111 :  ");
            FileRead.startread();
    	}

        	else;{
                System.out.print(stoptobeContinue + "Enter to be continued 2222222222222 :  ");
        	}
       
	}
}
		

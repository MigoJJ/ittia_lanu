package ittia.nu.gdsclinic;

import java.util.Scanner;



//public class PressKey {
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Press Any Key to Continue " );
//		
//		while(scan.hasNext()) {
//			System.out.println(scan.nextLine());
//			
//		}
//	}	
//}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Startup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> questList = new ArrayList<>();

        while (true) {// Infinite loop
            String nextGuest = scanner.next();
            if (nextGuest.equalsIgnoreCase("quit")) {
                break;
            }
            questList.add(nextGuest);
        }

        Collections.reverse(questList);

        questList.forEach(System.out::println);
    }
}
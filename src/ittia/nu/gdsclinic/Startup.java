package ittia.nu.gdsclinic;

import java.io.IOException;
import java.util.Scanner;

public class Startup {
	public static void main(String[] args) throws IOException {
		
		CurrDate.c_time();
		CaseSel.insertCode();
		System.out.println("Hello Migo WJ ~");
		
		pa();		
	}
	
	static void pa() throws IOException {
        System.out.println("Press enter to continue...");
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
        System.out.println(N);

        scanner.close();
        System.out.println("Press enter to continued ...................");
        main(null);
    }
	}
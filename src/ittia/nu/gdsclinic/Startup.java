package ittia.nu.gdsclinic;

import java.io.IOException;

public class Startup {
	public static void main(String[] args) throws IOException {
		
		CurrDate.c_time();
		CaseSel.insertCode();
		System.out.println("Hello Migo WJ ~");
		
		pa();		
	}
	
	static void pa() throws IOException {
        System.out.println("Press enter to continue...");
        System.in.read();
        System.out.println("Press enter to continued ...................");
//        main(null);
    }
}
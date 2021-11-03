package ittia.la.gdsclinic;

import java.io.IOException;
import ittia.nu.gdsclinic.*;

public class Startup1 {
	public static void main(String[] args) throws IOException {
		
		CurrDate.c_time();
		CaseSel1.insertCode();
				System.out.println("Hello Migo WJ ~");
		pa();		
	}
	
	static void pa() throws IOException {
        System.out.println("Press enter to continue...");
        System.in.read();
        System.out.println("Press enter to continued ...................");
        main(null);
    }
}
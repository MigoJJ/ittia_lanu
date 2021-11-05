package ittia.jepanse.gdsclinic.la;

import ittia.jepanse.gdsclinic.nu.*;
import java.io.IOException;

class Startup {
	public static void main(String[] args) throws IOException {
		
		CurrDate.c_time();
		CaseSel cs = new CaseSel();
				 cs.insertCode();
				
		PressAnyKey.PAK();		
		
		System.out.println("Hello Migo WJ ~");
    	System.out.println(System.lineSeparator().repeat(10));
		main(null);
	}
}
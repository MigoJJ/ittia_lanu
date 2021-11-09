package ittia.jepanse.gdsclinic.nu;

import ittia.jepanse.gdsclinic.ar.CurrDate;
import ittia.jepanse.gdsclinic.ar.PressAnyKey;

import java.io.IOException;

public class Startup {
	public static void main(String[] args) throws IOException {
		System.out.println(System.lineSeparator().repeat(10));
		CurrDate.c_time();
		
		CaseSel cs = new CaseSel();
				 cs.insertCode();
				
		PressAnyKey.PAK();		
		
		System.out.println("Hello Migo WJ ~");
		main(null);
	}
}
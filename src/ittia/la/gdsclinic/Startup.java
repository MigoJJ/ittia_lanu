package ittia.la.gdsclinic;

import java.io.IOException;
import ittia.nu.gdsclinic.*;

public class Startup {
	public static void main(String[] args) throws IOException {
		
		CurrDate.c_time();
		CaseSel.insertCode();
				System.out.println("Hello Migo WJ ~");
		PressAny.main("Continued   :   ");
	}
}

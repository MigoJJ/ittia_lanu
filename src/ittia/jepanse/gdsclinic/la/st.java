package ittia.jepanse.gdsclinic.la;

import ittia.jepanse.gdsclinic.ar.CurrDate;
import ittia.jepanse.gdsclinic.ar.PressAnyKey;
import ittia.jepanse.gdsclinic.nu.*;
import java.io.IOException;

import Ex.DoctorId;

class st {
	public static void main(String[] args) throws IOException {
		
		CurrDate.c_time();
		DoctorId di = new DoctorId();
				di.doctorCode();
				
		PressAnyKey.PAK();		
		
		System.out.println("Hello Migo WJ ~");
}


}

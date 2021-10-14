package ittia.la.gdsclinic;
import ittia.nu.gdsclinic.CaseSelection;
import ittia.nu.gdsclinic.CurrentDate;
import ittia.nu.gdsclinic.FileReading;

public class Startup {
	public static void main(String[] args) {
		
		CurrentDate.c_time();
		
		FileReading.startread();
		
		CaseSelection.insertCode();
		
	}

}

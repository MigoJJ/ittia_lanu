package ittia.nu.gdsclinic;

import ittia.la.gdsclinic.Startup;

public class PressAnyKeyC {

	public static void main(String args[])
	{
			System.out.println("Press Enter to continue");
			try{System.in.read();}
			catch(Exception e){}
			
			Startup.main(args);
	}
}
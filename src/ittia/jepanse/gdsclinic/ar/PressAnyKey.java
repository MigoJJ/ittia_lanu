package ittia.jepanse.gdsclinic.ar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PressAnyKey {

	public static void PAK() throws IOException {
			    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			    System.out.print("Press enter to continue......");
			    try {  
			    	input.readLine();  
			    	} 
			    catch (Exception e) { 
			    	e.printStackTrace();
			    	}
		}
}
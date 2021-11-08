package ittia.jepanse.gdsclinic.ar;

import java.util.*;
import java.text.*;

	public class CurrDate {
	public static void c_time() {
	      Date dNow = new Date( );
	      SimpleDateFormat ft = 
	      new SimpleDateFormat ("E'요일'  yyyy.MM.dd 'at' hh:mm:ss a zzz");
	      System.out.println("Current Date: " + ft.format(dNow));
   }
}
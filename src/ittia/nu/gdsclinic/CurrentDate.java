package ittia.nu.gdsclinic;

import java.util.*;
import java.text.*;

public class CurrentDate {

   public static void c_time() {
      Date dNow = new Date( );
      SimpleDateFormat ft = 
      new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

      System.out.println("Current Date: " + ft.format(dNow));
   }
}
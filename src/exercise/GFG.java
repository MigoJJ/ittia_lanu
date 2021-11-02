package exercise;

import java.io.*;

import ittia.la.gdsclinic.Startup;

class GFG {

  static int count = 0;

  // The method that calls the main() method
  static void mainCaller()
  {

      System.out.println("mainCaller!");
      count++;

      // Calling the main() only 3 times
      if (count < 3) {

          // Calling the main() method
          main(null);
          Startup.main(null);
          
      }
  }

  // main() method
  public static void main(String[] args)
  {
      System.out.println("main");

      // Calling the mainCalller() method
      // so that main() methiod is called externally
      mainCaller();
  }
}
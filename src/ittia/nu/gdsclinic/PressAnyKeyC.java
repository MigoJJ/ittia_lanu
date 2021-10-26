package ittia.nu.gdsclinic;

public class PressAnyKeyC {
	public static void main(String[] args) {

	    int i = 5;
	    System.out.println(i + "초 동안 머무릅니다...");


	    try {
	      Thread.sleep(i * 1000);
	    } catch (InterruptedException e) { }


	    System.out.println(i + "초 동안 머물렀습니다 ~~^^");
	    
	    clearScreen();

	  }

    public static void clearScreen() {
    		for (int i = 0; i < 80; i++)
    			System.out.println("");
    }
}


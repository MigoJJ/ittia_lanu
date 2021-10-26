package exercise;

public class Myclassex {

	    int x = 5;
	    String y = "ABCD";
	    String z = "FGHI";
		
	    public static void main(String[] args) {
	       Myclassex myObj = new Myclassex();
			     System.out.println(myObj.x);
			     System.out.println((myObj.y).getClass().getSimpleName());

	       Typetester t = new Typetester();
			     t.printType(myObj.x);
			     t.printType(myObj.y);
			     t.printType(myObj.z);

			     t.printType(12345.96);
			     t.printType(myObj.x*100);
	    }
}
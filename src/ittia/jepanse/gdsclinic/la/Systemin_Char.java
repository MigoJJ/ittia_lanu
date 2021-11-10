package ittia.jepanse.gdsclinic.la;

import java.io.IOException;
import java.io.InputStream;

public class Systemin_Char {

	public static void main(String[] args) throws IOException {
		InputStream is  = System.in ;
		System.out.println(" 환자이름을 입력하세요 ... ");
		char inputChar = (char) is.read();
		
		switch(inputChar){ 
				case '1': System.out.println(" 38963 김태호"); 	break;
				case '2': System.out.println(" 39890 고재준"); 	break;
				case '3': System.out.println(" 38963 최이령"); 	break;       
				case '4': System.out.println(" 38963 이찬주"); 	break;
				case '5': System.out.println(" 38963 이인희"); 	break;
				default:
		        	System.out.println("Please reinsert number ... ");
		}
		
	}
}

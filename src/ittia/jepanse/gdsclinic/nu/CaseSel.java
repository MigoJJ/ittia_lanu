package ittia.jepanse.gdsclinic.nu;

import java.io.IOException;
import java.util.Scanner;

import ittia.jepanse.gdsclinic.ar.FileRead;
import ittia.jepanse.gdsclinic.ar.PressAnyKey;
import ittia.jepanse.gdsclinic.la.Startup;

public class CaseSel {
		static String wd = "./src/ittia/jepanse/gdsclinic/ius";
	    static String myint_c = wd + "/StartupMenu.txt";
       
	    public void insertCode() throws IOException{
		       FileRead fr = new FileRead();
		       fr.startread(CaseSel.myint_c);
			       
				Scanner dcin = new Scanner (System.in);  
				    System.out.print ("Enter a Choice Number :   ");
				    int myint = dcin.nextInt();  
				    
				switch(myint){
			        case 1: myint_c = wd + "/Version_infomation.txt";	returnToHome(); break;
			        case 2: myint_c = wd + "/DoctorLogin.txt";
			        			DoctorCode.insertDR_Code();
			        			break;
			        case 3: myint_c = wd + "/ClinicMamange.txt";			returnToHome(); break;
			        
			        default:System.out.println("i value is less than 4...");
				}
//				in.close(); 
//			    스택의 맨 위를 보면 insertCode() 메소드가 호출되고 있는데 이 메소드는 스트림이 열려있는지 닫혀있는지 확인하게 되는데 이때 스트림이 닫혀 있기에 출력 버퍼에 남아 있는 데이터를 송신하지 못하므로 예외가 발생하게 됩니다.
//              출처: https://chanchan-father.tistory.com/418 [찬찬이 아빠 블로그]
	    }
	    
	    public void returnToHome() throws IOException {
	       	FileRead fr = new FileRead();
		       fr.startread(CaseSel.myint_c); 
		   		CaseSel.myint_c = wd + "/StartupMenu.txt";
    			PressAnyKey.PAK();
    			Startup.main(null);
	    }  
}
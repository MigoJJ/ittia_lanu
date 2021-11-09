package ittia.jepanse.gdsclinic.nu;

import java.io.IOException;
import java.util.Scanner;

import ittia.jepanse.gdsclinic.ar.PressAnyKey;
import ittia.jepanse.gdsclinic.ar.PrintFormat_f;

public class DoctorCode {
	String doctor_code;
	String doctor_name;
	static int clinic_code = 12303291;
	static String clinic_address = "서울 강남구 도곡로 205 (역삼동) YK 빌딩 2층 지디스내과의원";
	static String clinic_phonenumber = "+82-2-501-1828";
	static String clinic_faxnumber = "+82-2-3452-2192";
	static String clinic_email = "su@gdclinic.com";
	
	public static void insertDR_Code() throws IOException {
		Scanner clinic = new Scanner (System.in);  
				System.out.print ("--------   Enter a Doctor's Number :  ----- ");
			    int doctorselection = clinic.nextInt();

		DoctorCode dc = new DoctorCode();	    	
			    
		switch(doctorselection){ 
			case 38963: dc.doctor_code  = "38963"; dc.doctor_name  = "김태호"; 	break;
			case 39890: dc.doctor_code  = "39890"; dc.doctor_name  = "고재준"; 	break;
			case 46285: dc.doctor_code  = "46285"; dc.doctor_name  = "이찬주"; 	break;        
			case 88000: dc.doctor_code  = "88000"; dc.doctor_name  = "최이령"; 	break;
			case 53671: dc.doctor_code  = "53671"; dc.doctor_name  = "이인희"; 	break;
			default:
            	System.out.println("Please reinsert number ... ");
		}
	    System.out.println("-----------------------------------------------------------------------");
	    PrintFormat_f.pf_space(dc.doctor_code , dc.doctor_name);
	    System.out.println("   병원코드        :   " + clinic_code);
	    System.out.println("   병원주소        :   " + clinic_address);
	    System.out.println("   전화번호        :   " + clinic_phonenumber);
	    System.out.println("   팩스번호        :   " + clinic_faxnumber);
	    System.out.println("   이메일          :   " + clinic_email);
	    System.out.println("-----------------------------------------------------------------------");
		PressAnyKey.PAK();
// 		clinic.close(); 
		}
}

package Ex;

import java.io.IOException;
import java.util.Scanner;
import ittia.jepanse.gdsclinic.nu.CaseSel;

public class DoctorCode {
	public static void main(String[] args) throws IOException {
		insertDR_Code();
}
		String doctor_code;
		String doctor_name;
		static String clinic_address = "서울 강남구 도곡로 205 (역삼동) YK 빌딩 2층 지디스내과의원";
		static int clinic_code = 12303291;
		static String clinic_phonenumber = "+82-2-501-1828";
		static String clinic_faxnumber = "+82-2-3452-2192";
		static String clinic_email = "su@gdclinic.com";
		
		
		
	public static void insertDR_Code() throws IOException {
		Scanner clinic = new Scanner (System.in);  
				System.out.print ("Enter a Doctor's Number :   ");
			    int doctorselection = clinic.nextInt();  
			    System.out.println("The Number you entered is .....   " + doctorselection);
		DoctorCode dc = new DoctorCode();	    	
			    
		switch(doctorselection){
			case 1:
				dc.doctor_code  = "38963"; 
				dc.doctor_name  = "김태호"; 
				break;
//        case 2:
//        case 3:
        default:
            	System.out.println("i value is greater than 2 and less than 5");
		}
	    System.out.println("   의사면허 번호     :    " + dc.doctor_code);
	    System.out.println("   의사 이름        :   " + dc.doctor_name);
	    System.out.println("   병원 코드        :   " + clinic_code);
	    System.out.println("   주소             :   " + clinic_address);
	    System.out.println("   전화번호         :   " + clinic_phonenumber);
	    System.out.println("   팩스번호         :   " + clinic_faxnumber);
	    System.out.println("   이메일           :   " + clinic_email);
	    
	    
	    
	    
	    
 		clinic.close(); 
		}
}
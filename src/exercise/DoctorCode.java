package exercise;

public class DoctorCode {
       String doctor_code = ("doctor code 123...................");
       String doctor_name = ("jjkoh");
       static int clinic_code = 50182;
       static String clinic_phonenumber = ("Tel   02-501-1828");
       static String clinic_faxnumber = ("Fax   02-3452-2192");
       static String clinic_address = ("서울 강남구 도곡로 205 (역삼동) YK bldg 2층  지디스내과의원");
       static String logindate;
       
	    static void printType() {
	    	DoctorCode DC = new DoctorCode();
	       System.out.println(DC + " is an byte");
	       System.out.println(DC.doctor_code + " is an doctor code");
	       System.out.println(DC.doctor_name + " is an doctor name");
	       System.out.println(clinic_code + " is an clinic code");	  
	       System.out.println(clinic_phonenumber + " is an clinic_phonenumber");	
	       System.out.println(clinic_faxnumber + " is an clinic fax");	
	       System.out.println(clinic_address + " is an clinic address");	
	       
	    }
}
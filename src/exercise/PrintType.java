package exercise;

public class PrintType {
	public static void printtType() {
    	DoctorCode DC = new DoctorCode() ;
    	
       System.out.println(DC + " is an byte");
       System.out.println(DC.doctor_code + " is an doctor code");
       System.out.println(DC.doctor_name + " is an doctor name");
       System.out.println(DoctorCode.clinic_code + " is an clinic code");	  
       System.out.println(DoctorCode.clinic_phonenumber + " is an clinic_phonenumber");	
       System.out.println(DoctorCode.clinic_faxnumber + " is an clinic fax");	
       System.out.println(DoctorCode.clinic_address + " is an clinic address");
	}	 
}

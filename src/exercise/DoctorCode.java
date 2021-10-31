package exercise;

public class DoctorCode {
    String doctor_code;
    String doctor_name;
    static int clinic_code;
    static String clinic_phonenumber;
	 static String clinic_faxnumber;
	 static String clinic_address;
	 
	    DoctorCode(){
	    	this("39890",
	    			"김태호",
	    			50182,
	    			"Tel   02-501-1828",
	    			"Fax   02-3452-2192",
	    			"서울 강남구 도곡로 205 (역삼동) YK bldg 2층  지디스내과의원");
	    }   
		 DoctorCode (String doctor_code, String b, int c, String d,String e,String f){
	    	   this.doctor_code = doctor_code;
	    	   doctor_name = b;
	    	   clinic_code = c;
	    	   clinic_phonenumber = d;
	    	   clinic_faxnumber = e;
	    	   clinic_address = f;
		 }

}
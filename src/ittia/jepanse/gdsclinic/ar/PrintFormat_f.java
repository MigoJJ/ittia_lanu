package ittia.jepanse.gdsclinic.ar;

public class PrintFormat_f {
	public static void pf_space(String dcname , String dcdc) {
//		DoctorCode dc = new DoctorCode();	  
	    System.out.printf("[%15s] %20s%n" , "의사이름" , dcdc);
	    System.out.printf("[%15s] %22s%n" , "면허번호" , dcname);
	}
}

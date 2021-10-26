package exercise;

class Student{
	String name;
	int d_number = 123456;
	
	Student(String name){
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
}

public class SimpleTesting {
	public static void main(String[] args) {	
		Student student1 = new Student("Migo WJ ~~^^");
		String name2 = student1.getName();
		System.out.println("Student name is : " + name2);
		System.out.println("Doctor number is : " + student1.d_number);
	}
}
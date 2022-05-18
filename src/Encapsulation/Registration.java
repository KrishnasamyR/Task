package Encapsulation;

import java.util.Scanner;

public class Registration {
	
	Scanner scan =new Scanner(System.in);
	
	public void show() {
		Student student= new Student();
		
		student.setAdmissionId(scan.nextInt());
		student.setPhoneNumber(scan.nextLong());
		student.setName(scan.next());
		student.setEmail(scan.next());
		System.out.println("Student Admission ID: "+ student.getAdmissionId()+"\n"+"Student Phone Number: "+student.getPhoneNumber()+"\n"+"Student Name:"+student.getName()+"\n"+"Student Email Id:"+student.getEmail());
		}
	
	
	
		/*public void show() {
		Student student= new Student();
		student.setAdmissionId(4033);
		student.setPhoneNumber(1255195870);
		student.setName("Krishna");
		student.setEmail("krishna@atmecs.com");
		System.out.println("Student Admission ID: "+ student.getAdmissionId()+"\n"+"Student Phone Number: "+student.getAdmissionId()+"\n"+"Student Name:"+student.getName()+"\n"+"Student Email Id:"+student.getEmail());
		}*/
		public static void main(String[] args) {
			Registration register = new Registration();
			register.show();
			
		
	}

}

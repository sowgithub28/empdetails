package org.emp;

public class Employee {
	
	private void empId() {
		System.out.println("Employee Id is 9878");
	}
	private void empName() {
		System.out.println("Employee name is Sow");
	}
	private void empPhone() {
		System.out.println("Employee phone no is 2334555");
	}
	private void empEmail() {
		System.out.println("Employee email address is abc@gmail");
	}
	private void empAddress() {
		System.out.println("Employee address is jhjdh");
	}
	//main method
	public static void main(String[]args) {
		//create object
		Employee obj= new Employee();
		//  method calling
		obj.empId();
		obj.empName();
		obj.empPhone();
		obj.empEmail();
		obj.empAddress();
	}
}
	

package com.ak.constructor_basic;

import java.util.Scanner;

public class TesterEmp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Name :");
		String firstName=sc.nextLine();
		System.out.print("Enter Last Name :");
		String lastName= sc.nextLine();
		System.out.println("Enter Employee Id :");
		int employeeId=Integer.parseInt(sc.nextLine());
		Employee raj = new Employee(null, null, 0, 0, 0);
		
	}

}
class Employee{
	private String firstName;
	private String lastName;
	private int employeeId;
	private double salary;
	private int noOfProject;
	public Employee(String firstName, String lastName, int employeeId, double salary, int noOfProject) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.salary = salary;
		if(noOfProject>=0) {
			this.noOfProject = noOfProject;
		}else {
			System.err.println("Number of projects cannot be negative");
		}
	}
	public void calculateSalary() {
		double increment;
		if(noOfProject>=20) {
			increment=15000;
		}else if(noOfProject>=10) {
			increment=10000;
		}else if(noOfProject>=5) {
			increment=5000;
		}else {
			increment=0;
		}
		salary+=increment;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", employeeId=" + employeeId
				+ ", salary=" + salary + ", noOfProject=" + noOfProject + "]";
	}
	
	
}
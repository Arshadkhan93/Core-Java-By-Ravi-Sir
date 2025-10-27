package com.ak.oop_concept;

import java.util.Scanner;

public class EmployeeElc {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Employee raj = new Employee();
		System.out.print("Enter First Name      :");
		String firstName=sc.nextLine();
		System.out.print("Enter Last Name       :");
		String lastName = sc.nextLine();
		System.out.print("Enter Employee Id     :");
		int EmployeeId= Integer.parseInt(sc.nextLine());
		System.out.print("Enter Employee Salary :");
		double Salary = Double.parseDouble(sc.nextLine());
		System.out.print("Enter No Of Project   :");
		int projectNo=Integer.parseInt(sc.nextLine());
		
		raj.setEmployeeData(firstName, lastName, EmployeeId, Salary, projectNo);
		raj.calculateSalary();
		raj.displayDetails();
		sc.close();

	}

}

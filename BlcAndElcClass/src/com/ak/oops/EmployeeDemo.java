package com.ak.oops;

import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee raj = new Employee();
		System.out.print("Enter Employee ID    : ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.print("Enter Employee Name  : ");
		String name= sc.nextLine();
		System.out.print("Enter Employee Salary: ");
		double salary = Double.parseDouble(sc.nextLine());
		raj.setEmployeeDetails(id, name, salary);
		raj.calculateSalaryIncrement();
		System.out.println("----- Employee Information -----");
		System.out.println("Employee Details:\n"+raj);
		sc.close();

	}

}

package com.ak.elc;

import java.util.Scanner;

import com.ak.blc.Employee;

public class EmployeeInfo {

	public static void main(String[] args) {
		Employee e=new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee Id :");
		int employeeId=Integer.parseInt(sc.nextLine());
		System.out.print("Enter Employee Name :");
		String employeeName=sc.nextLine();
		System.out.print("Enter Employee Salary :");
		double employeeSalary=Double.parseDouble(sc.nextLine());
		e.setEmployeeData(employeeId, employeeName, employeeSalary);
		e.getEmployeeData();
		sc.close();

	}

}

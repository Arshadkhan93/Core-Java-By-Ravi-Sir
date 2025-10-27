package com.ak.blc;

public class Employee {
	int employeeId;
	String employeeName;
	double employeeSalary;
	public void setEmployeeData(int id, String name, double salary) {
		employeeId=id;
		employeeName=name;
		employeeSalary=salary;
		
	}
	public void getEmployeeData() {
		System.out.println("Employee Id is :"+employeeId);
		System.out.println("Employee Name is :"+employeeName);
		System.out.println("Employee Salary is :"+employeeSalary);
	}
}

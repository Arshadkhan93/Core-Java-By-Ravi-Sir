package com.ak.oop_concept;

public class Employee 
{
	private String firstName;
	private String lastName;
	private int employeeId;
	private double salary;
	private int noOfProject;
	public void setEmployeeData(String fname,String lname,int id,double salary,int project) 
	{
		firstName=fname;
		lastName=lname;
		employeeId=id;
		this.salary=salary;
		noOfProject=project;
	}
	public void calculateSalary() {
		if(noOfProject>=20) {
			salary+=15000;
		}else if(noOfProject>=10) {
			salary+=10000;
		}else {
			salary+=5000;
		}
	}
	public void displayDetails() {
		System.out.println("First Name                 :"+firstName);
		System.out.println("Last Name                  :"+lastName);
		System.out.println("Employee Id is    	       :"+employeeId);
		System.out.println("Employee Salary is         :"+salary);
		System.out.println("Employee No Of Project are :"+noOfProject);
	}
		
	
}

package com.ak.factory_method;

import java.util.Scanner;

public class TestEmployee 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int count=0;
		System.out.println("--- Employee Details ---");
		while(true) 
		{			
			System.out.println("Enter details for Employee "+ ++count+":");
			System.out.print("Enter Employee ID: ");
			int id =Integer.parseInt(sc.nextLine());
			System.out.print("Enter Employee Name: ");
			String name = sc.nextLine();
			System.out.print("Enter Monthly Salary: ");
			double salary=Double.parseDouble(sc.nextLine());
			System.out.print("Enter Department (Sales, Engineering, HR, Other): ");
			String department = sc.nextLine();
			Employee raj = Employee.createEmployeeObject(name, id, department, salary);
			System.out.println(raj);
			System.out.print("You want to Create More Object [yes/no]");
			String choice=sc.nextLine();
			if(choice.equalsIgnoreCase("no")) {
				sc.close();
				System.exit(0);
			}	
		}
	}
}

class Employee
{
	private String name;
	private int id;	
	private String department;
	private double salary;
	private Employee(String name, int id, String department, double salary) 
	{
		super();
		this.name = name;
		this.id = id;
		this.department = department;
		this.salary = salary;
	}
	
	public static Employee createEmployeeObject(String name, int id, String department, double salary) 
	{
		return new Employee(name, id, department, salary);
	}
	@Override
	public String toString() 
	{
		return "Employee [name=" + name + ", id=" + id + ", department=" + department + ", salary=" + salary
				+ ", Annual Salary (with Bonus): " + calculateAnnualSalary() + "]";
	}

	public double calculateAnnualSalary() 
	{
		String depart =this.department.toLowerCase();
		
		double asalary=(this.salary*12);
		double bonus= switch(depart) 
		{
		case "sales"->asalary*0.10;
		case "engineering"->asalary*0.15;
		case "hr"->asalary*0.08;
		default->asalary*0.05;
		};
		
		return asalary+bonus;
	}
}

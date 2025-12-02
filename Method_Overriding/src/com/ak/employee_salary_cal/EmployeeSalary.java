package com.ak.employee_salary_cal;

import java.util.Scanner;

public class EmployeeSalary {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("****Salary Calculation Menu****");
		System.out.println("FullTime Employees");
		System.out.println("PartTime Employees");
		System.out.print("Please Select the Employee Type : ");
		int choice = Integer.parseInt(sc.nextLine());
		switch(choice)
		{
			case 1:
			{
				System.out.print("Enter FullTime Employee ID :");
				int id=Integer.parseInt(sc.nextLine());
				System.out.print("Enter FullTime Employee Name :");
				String name=sc.nextLine();
				System.out.print("Enter the Salary :");
				double salary=Double.parseDouble(sc.nextLine());
				FullTimeEmployee femp= new FullTimeEmployee(id, name, salary);
				System.out.println(name+" Salary is "+femp.calculateSalary());
				break;
			}
			case 2:
			{
				System.out.print("Enter PartTime Employee ID :");
				int id=Integer.parseInt(sc.nextLine());
				System.out.print("Enter PartTime Employee Name :");
				String name=sc.nextLine();
				System.out.print("Enter Your Hourly Rate:");
				double hourlyRate=Double.parseDouble(sc.nextLine());
				System.out.print("Enter Your total works hour in the month:");
				int hoursWorked=Integer.parseInt(sc.nextLine());
				PartTimeEmployee pemp=new PartTimeEmployee(id, name, hoursWorked, hourlyRate);
				System.out.println(name+" Salary is "+pemp.calculateSalary());
				
			}
		}
		sc.close();
		
		
	}

}

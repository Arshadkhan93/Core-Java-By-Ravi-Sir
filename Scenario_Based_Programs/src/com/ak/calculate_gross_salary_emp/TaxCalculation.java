package com.ak.calculate_gross_salary_emp;

import java.util.Scanner;

public class TaxCalculation {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
//		Employee raj = new Employee(101, "raj", 40000, 5000, 5000);
		TaxUtil tax = new TaxUtil();
//		double empTax =tax.calculateTax(raj);
//		System.out.println("Employee Tax is :"+(empTax));
		System.out.println("----Tax Calculator App----");
		System.out.println("1. Employee");
		System.out.println("2. Manager");
		System.out.println("3. Trainer");
		System.out.println("4. Sourcing");
		System.out.print("Enter your Choice: ");
		int choice = Integer.parseInt(sc.nextLine());
		switch(choice) 
		{
		case 1:
		{
			System.out.print("Enter Employee Id:");
			int employeeId=Integer.parseInt(sc.nextLine());
			System.out.print("Enter Employee Name:");
			String employeeName=sc.nextLine();
			System.out.print("Enter Employee Basic Salary:");
			double basicSalary=Double.parseDouble(sc.nextLine());
			System.out.print("Enter Employee HRAPer:");
			double HRAPer =Double.parseDouble(sc.nextLine());
			System.out.print("Enter Employee DAPer:");
			double DAPer=Double.parseDouble(sc.nextLine());
			Employee raj = new Employee(employeeId, employeeName, basicSalary, HRAPer, DAPer);
			System.out.println("Employee "+raj.getEmployeeName()+" TAX is :"+tax.calculateTax(raj));
			break;
		}
		case 2:
		{
			System.out.print("Enter Manager Id:");
			int Id=Integer.parseInt(sc.nextLine());
			System.out.print("Enter Manager Name:");
			String Name=sc.nextLine();
			System.out.print("Enter Manager Basic Salary:");
			double basicSalary=Double.parseDouble(sc.nextLine());
			System.out.print("Enter Manager HRAPer:");
			double HRAPer =Double.parseDouble(sc.nextLine());
			System.out.print("Enter Manager DAPer:");
			double DAPer=Double.parseDouble(sc.nextLine());
			System.out.print("Enter Project Allowance:");
			double projectAllowance=Double.parseDouble(sc.nextLine());
			Manager raj = new Manager(Id, Name, basicSalary, HRAPer, DAPer, projectAllowance);
			System.out.println("Employee "+raj.getManagerName()+" TAX is :"+tax.calculateTax(raj));
			break;
		}
		case 3:
		{
			System.out.print("Enter Trainer Id:");
			int Id=Integer.parseInt(sc.nextLine());
			System.out.print("Enter Trainer Name:");
			String Name=sc.nextLine();
			System.out.print("Enter Trainer Basic Salary:");
			double basicSalary=Double.parseDouble(sc.nextLine());
			System.out.print("Enter Trainer HRAPer:");
			double HRAPer =Double.parseDouble(sc.nextLine());
			System.out.print("Enter Trainer DAPer:");
			double DAPer=Double.parseDouble(sc.nextLine());
			System.out.print("Enter Batch count:");
			int batchCount = Integer.parseInt(sc.nextLine());
			System.out.print("Enter Perk Per Batch:");
			double perkPerBatch=Double.parseDouble(sc.nextLine());
			Trainer raj = new Trainer(Id, Name, basicSalary, HRAPer, DAPer, batchCount, perkPerBatch);
			System.out.println("Employee "+raj.getTrainerName()+" TAX is :"+tax.calculateTax(raj));
			break;
		}
		case 4:
		{
			System.out.print("Enter Sourcing Id:");
			int Id=Integer.parseInt(sc.nextLine());
			System.out.print("Enter Sourcing Name:");
			String Name=sc.nextLine();
			System.out.print("Enter Sourcing Basic Salary:");
			double basicSalary=Double.parseDouble(sc.nextLine());
			System.out.print("Enter Sourcing HRAPer:");
			double HRAPer =Double.parseDouble(sc.nextLine());
			System.out.print("Enter Sourcing DAPer:");
			double DAPer=Double.parseDouble(sc.nextLine());
			System.out.print("Enter Enrollment Reached:");
			int enrollmentReached = Integer.parseInt(sc.nextLine());
			System.out.print("Enter Enrollment Target:");
			int enrollmentTarget = Integer.parseInt(sc.nextLine());
			System.out.print("Enter Perk Per Enrollment:");
			double perkPerEnrollment=Double.parseDouble(sc.nextLine());
			Sourcing raj = new Sourcing(Id, Name, basicSalary, DAPer, HRAPer, enrollmentTarget, enrollmentReached, perkPerEnrollment);
			System.out.println("Employee '"+raj.getSourceName()+"' TAX is :"+tax.calculateTax(raj));
			break;
		}
		default:{
			System.err.println("Enter Valid Choice!!!");
			sc.close();
			System.exit(0);
		}	
		}

	}

}

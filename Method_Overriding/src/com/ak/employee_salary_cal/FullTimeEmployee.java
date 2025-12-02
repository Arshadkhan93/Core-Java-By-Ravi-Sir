package com.ak.employee_salary_cal;

public class FullTimeEmployee extends Employee
{
	protected double salary;

	public FullTimeEmployee(int id, String name, double salary) 
	{
		super(id, name);
		if(salary<0) 
		{
			System.err.println("Salary Cannot be negative!!");
			System.exit(0);
		}
		this.salary = salary;
	}
	public double calculateSalary()
	{
		return salary;
	}
}

package com.ak.employee_salary_cal;

class PartTimeEmployee extends Employee
{
	protected int hoursWorked;
	protected double hourlyRate;
	public PartTimeEmployee(int id, String name, int hoursWorked, double hourlyRate) 
	{
		super(id, name);
		if(hourlyRate<0){
			System.err.println("Employee hourly rate can't be zero OR Negative");
			System.exit(0);
		}
		if(hoursWorked<0) 
		{
			System.err.println("Employee hours of work cannot be Negative");
			System.exit(0);			
		}
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	
	public double calculateSalary()
	{
		return hourlyRate*hoursWorked;
	}
	
	
	
}

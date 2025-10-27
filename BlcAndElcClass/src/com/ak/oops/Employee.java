package com.ak.oops;

public class Employee 
{ 
	private int id;
	private String name;
	private double salary;
	
	public void setEmployeeDetails(int id,String name,double salary) 
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public void calculateSalaryIncrement()
	{
		double increment;
		if(salary<50000) {
			increment=salary*0.10;
		}
		else if(salary<80000) {
			increment=salary*0.07;
		}
		else {
			increment=salary*0.05;
		}
		salary+=increment;
		System.out.println("Salary increment is :"+increment);
		System.out.println("Updated Salary is :"+salary);
	}
	@Override
	public String toString() {
		
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

}

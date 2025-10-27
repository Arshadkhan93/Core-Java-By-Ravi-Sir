package com.ak.senario_gpt;

public class Employee 
{
	private String name;
	private double salary;
	private int experience;
	
	public Employee(String name,double salary,int experience) 
	{
		this.name=name;
		this.salary=salary;
		this.experience=experience;
	}
	
	public void setName(String name) 
	{
		this.name=name;
	}
	public void setSalary(double salary) 
	{
		this.salary=salary;
	}
	public void setExperiene(int experience) 
	{
		this.experience=experience;
	}
	public String getName() 
	{
		return this.name;
	}
	public double getSalary()
	{
		return this.salary;
	}
	public int getExperience()
	{
		return this.experience;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}

}

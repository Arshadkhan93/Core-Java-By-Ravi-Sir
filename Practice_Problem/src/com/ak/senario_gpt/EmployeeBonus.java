package com.ak.senario_gpt;

public class EmployeeBonus 
{
	private Employee employee;
	private double bonus;
	
	public EmployeeBonus(Employee employee,double bonus)
	{
		this.employee=employee;
		this.bonus=bonus;
	}

	public Employee getEmployee() 
	{
		return employee;
	}

	public double getBonus() 
	{
		return bonus;
	}

	public void setEmployee(Employee employee) 
	{
		this.employee = employee;
	}

	public void setBonus(double bonus) 
	{
		this.bonus = bonus;
	}
	@Override
	public String toString()
	{
		return "[The Employee "+employee.getName()+" will get "+this.bonus+" as a Bonus]";
	}
	

}

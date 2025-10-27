package com.ak.calculate_simple_interest;

public class Customer 
{
	private String name;
	private double principalAmount;
	private double timeInMonths;
	public Customer(String name,double principalAmount,double time) 
	{
		this.name=name;
		this.principalAmount=principalAmount;
		this.timeInMonths=time;
	}
	public String getName() 
	{
		return name;
	}
	public double getPrincipalAmount() 
	{
		return principalAmount;
	}
	public double getTimeInMonths() 
	{
		return timeInMonths;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public void setPrincipalAmount(double principalAmount) 
	{
		this.principalAmount = principalAmount;
	}
	public void setTimeInMonths(double timeInMonths) 
	{
		this.timeInMonths = timeInMonths;
	}
	
	@Override
	public String toString() 
	{
		return name;
	}
	
	

}

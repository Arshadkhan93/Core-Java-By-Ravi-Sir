package com.ak.calculate_simple_interest;

public class InvestmentResult 
{
	private Customer customer;
	private double interestRate;
	private double interestEarned;
	private double finalAmount;
	public InvestmentResult(double interestRate, double interestEarned, Customer customer, double finalAmount)
	{
		super();
		this.interestRate = interestRate;
		this.interestEarned = interestEarned;
		this.customer = customer;
		this.finalAmount = finalAmount;
	}
	public Customer getCustomer() 
	{
		return customer;
	}
	public void setCustomer(Customer customer) 
	{
		this.customer = customer;
	}
	public double getInterestRate() 
	{
		return interestRate;
	}
	public void setInterestRate(double interestRate) 
	{
		this.interestRate = interestRate;
	}
	public double getInterestEarned() 
	{
		return interestEarned;
	}
	public void setInterestEarned(double interestEarned) 
	{
		this.interestEarned = interestEarned;
	}
	public double getFinalAmount() 
	{
		return finalAmount;
	}
	public void setFinalAmount(double finalAmount) 
	{
		this.finalAmount = finalAmount;
	}
	public String toString() {
		return "[Customer "+customer.getName()+" invested ₹"+customer.getPrincipalAmount()+"for "+customer.getTimeInMonths()+" months at "+this.getInterestRate()+"% interest — "
				+ "Earned ₹"+this.getInterestEarned()+", Final Amount ₹"+this.getFinalAmount()+"]";

	}
	
	
	
}

package com.ak.calculate_simple_interest;

public class CalculateInvestment 
{
	public static InvestmentResult calculateInvestment(Customer customer) 
	{
		double rate=0;
		double time=customer.getTimeInMonths();
		double principalAmount=customer.getPrincipalAmount();
		if(time>=1 && time<=2)
			rate=20;
		else if(time<=5)
			rate=10;
		else
			rate=5;
		double interestEarned=principalAmount*(rate/100);
		double finalAmount=principalAmount+interestEarned;
		return new InvestmentResult(rate, interestEarned, customer, finalAmount);
	}

}

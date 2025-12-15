package com.ak.number_check;

import java.util.function.Predicate;

public record Customer(String name,Double salary,Integer creditScore,Integer age)
{
	public boolean checkLoanEligibility()
	{		
		Predicate<Customer> isEligible= (cust)->cust.salary()>25000 && cust.creditScore()>700 && cust.age()>21;
			    
		return isEligible.test(this)?true:false;
	}
}

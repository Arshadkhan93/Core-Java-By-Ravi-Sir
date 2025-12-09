package com.ak.payable_interface;

class Contractor 
{
	Payable payable = new Payable()
			{
				@Override
				public void pay(double amount)
				{
					IO.println("Contractor Amount is : "+amount);
				}
			};

}

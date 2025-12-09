package com.ak.payable_interface;

class Employee{

	Payable payable1= new Payable()
			{
				public void pay(double amount)
				{
					IO.println("Employee Amount is : "+amount);
				}
		
			};

}

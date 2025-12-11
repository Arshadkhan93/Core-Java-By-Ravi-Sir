package com.ak.payment_by_factory_method;

public class UPIPayment implements Payment
{
	@Override
	public void processPayment()
	{
		IO.println("Processing UPI payment...");
	}
	
	@Override
	public void applyDiscount()
	{
		IO.println("Applying 5% discount for UPI payment");
		
	}
}

package com.ak.payment_processing_app;

public class CreditCardPayment extends Payment
{
	@Override
	public void processPayment()
	{
		System.out.println("Processing Credit Card payment");
	}

}

package com.ak.payment_processing_app;

public class DebitCardPayment extends Payment
{
	@Override
	public void processPayment()
	{
		System.out.println("Processing Debit Card Payment");
	}

}

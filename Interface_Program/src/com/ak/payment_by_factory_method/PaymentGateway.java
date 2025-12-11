package com.ak.payment_by_factory_method;

public class PaymentGateway 
{
	public Payment initiatePayment(String paymentType)
	{
		if(paymentType.equalsIgnoreCase("CreditCardPayment"))
		{
			IO.println("Initiating Credit Card payment");
			return new CreditCardPayment();
		}
		else if(paymentType.equalsIgnoreCase("UPIPayment"))
		{
			IO.println("Initiating UPI payment");
			return new UPIPayment();
		}
		else 
		{
			IO.println("Invalid payment type selected!");
			return null;
		}
	}
}

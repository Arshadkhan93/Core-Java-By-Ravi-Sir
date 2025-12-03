package com.ak.payment_processing_app;

public class PaymentProcessing 
{

	public static void main(String[] args) 
	{
		Payment payment = new Payment();
		Payment payment1 = new CreditCardPayment();
		Payment payment2 = new DebitCardPayment();
		Payment payment3 = new UPI();
		paymentGateway(payment,payment1,payment2,payment3);

	}
	public static void paymentGateway(Payment ...payments)
	{
		for(Payment p:payments)
		{
			p.processPayment();
		}
	}

}

package com.ak.payment_by_factory_method;

public class PaymentGatewayUsingInterface 
{

	public static void main(String[] args) 
	{
		String paymentType = IO.readln("Enter Payment Type [CreditCard / UPI]: ");
		PaymentGateway paymentGateway = new PaymentGateway();
		Payment payment = paymentGateway.initiatePayment(paymentType);
		payment.processPayment();
		payment.applyDiscount();
	
		
	}

}

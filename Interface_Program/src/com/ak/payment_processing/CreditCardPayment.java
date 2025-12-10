package com.ak.payment_processing;

public final class CreditCardPayment implements Payment 
{
	private String cardHolderName;
	public CreditCardPayment(String name) 
	{
		this.cardHolderName=name;
	}

	@Override
	public void makePayment(double amount) 
	{
		IO.println("Paid RS :"+amount+" using Credit Card Holder : "+cardHolderName);		
		
	}

	@Override
	public void makeRefund(double amount) 
	{
		IO.println("Refunded RS :"+amount+" to Credit Card Holder : "+cardHolderName);
		
	}
	

}

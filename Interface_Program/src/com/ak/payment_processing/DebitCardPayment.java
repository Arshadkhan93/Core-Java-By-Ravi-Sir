package com.ak.payment_processing;

public final class DebitCardPayment implements Payment 
{
	private String bankName;
	
	public DebitCardPayment(String bankName) 
	{
		this.bankName=bankName;
	}
	
	@Override
	public void makePayment(double amount)
	{
		IO.println("Paid RS :"+amount+" using Debit Card Bank: "+bankName);
	}
	
	@Override
	public void makeRefund(double amount)
	{
		IO.println("Refunded RS :"+amount+" to Debit Card Bank: "+bankName);
	}
	

}

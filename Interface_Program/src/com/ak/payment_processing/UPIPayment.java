package com.ak.payment_processing;

public final class UPIPayment implements Payment 
{
	private String upiId;
	
	public UPIPayment(String upiId)
	{
		this.upiId=upiId;
	}
	
	@Override
	public void makePayment(double amount)
	{
		IO.println("Paid RS "+amount+" using UPI ID : "+upiId);
	}
	
	@Override
	public void makeRefund(double amount)
	{
		IO.println("Refunded RS "+amount+" to UPI ID : "+upiId);
	}

}

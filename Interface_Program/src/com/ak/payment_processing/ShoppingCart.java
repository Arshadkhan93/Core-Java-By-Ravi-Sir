package com.ak.payment_processing;

public class ShoppingCart 
{
	private double totalAmount;
	
	public ShoppingCart(double totalAmount)
	{
		this.totalAmount=totalAmount;
	}
	
	public void checkout(Payment payment)
	{
		IO.println("Starting checkout for amount RS :"+totalAmount);
		payment.makePayment(totalAmount);
	}
	
	public void cancelOrder(Payment payment)
	{
		IO.println("\n\nOrder Canceled. Initiating Refund...");
		IO.println("Cancelling order for amount RS :"+totalAmount);
		payment.makeRefund(totalAmount);
	}

}

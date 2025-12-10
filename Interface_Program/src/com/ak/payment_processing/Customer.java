package com.ak.payment_processing;

public class Customer 
{
	public static void main(String[] args) 
	{
		double amount=Double.parseDouble(IO.readln("Enter your total bill Amount :"));
		if(amount<0)
		{
			System.err.println("Invalid Amount, Amount must be greater than zero");
			System.exit(0);
		}
		ShoppingCart shoppingcart = new ShoppingCart(amount);
		int choice=Integer.parseInt(IO.readln("1. Credit Card\n2. Debit Card\n3.UPI"));
		switch(choice)
		{
		case 1->
		{
			String name= IO.readln("Enter your Name:");
			Payment creditCardPayment= new CreditCardPayment(name);
			shoppingcart.checkout(creditCardPayment);
			shoppingcart.cancelOrder(creditCardPayment);
		}
		case 2->
		{
			String bankName=IO.readln("Enter Bank Name :");
			Payment debitCardPayment = new DebitCardPayment(bankName);
			shoppingcart.checkout(debitCardPayment);
			shoppingcart.cancelOrder(debitCardPayment);
		}
		case 3->
		{
			String upiId=IO.readln("Enter UPI Id :");
			Payment upipayment = new UPIPayment(upiId);
			shoppingcart.checkout(upipayment);
			shoppingcart.cancelOrder(upipayment);
		}
		default->IO.println("Invalid Choice");
		};
	}

}

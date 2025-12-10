package com.ak.payment_processing;

public sealed interface Payment permits CreditCardPayment,DebitCardPayment,UPIPayment
{
	void makePayment(double amount);
	void makeRefund(double amount);
}

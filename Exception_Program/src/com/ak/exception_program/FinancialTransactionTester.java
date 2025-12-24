package com.ak.exception_program;

public class FinancialTransactionTester 
{

	public static void main(String[] args) 
	{
		FinancialTransaction financialTransaction = new FinancialTransaction();
		try
		{
		double amount = Double.parseDouble(IO.readln("Transaction Amount :"));
		long acno = Long.parseLong(IO.readln("Account Number :"));
		financialTransaction.processTransaction(amount, acno);
		}
		catch(IllegalArgumentException e)
		{
			IO.println("Invalid input: Please enter a valid number for transaction amount.");
		}

	}

}

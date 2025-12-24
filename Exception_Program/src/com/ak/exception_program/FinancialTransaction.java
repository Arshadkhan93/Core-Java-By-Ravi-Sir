package com.ak.exception_program;

public class FinancialTransaction 
{

	public void processTransaction(double amount, Long acno)
	{
		try
		{
			if(amount<0)
				throw new IllegalArgumentException();
			else
				IO.println("Processing transaction...\r\n"
						+ "Transaction successful: Amount Rs."+amount+" transferred to account "+acno);
		}
		catch(IllegalArgumentException e)
		{
			IO.println("Error processing transaction: Transaction amount must be positive.");
		}
		
				
	}
}

package com.ak.exception_program;

public class CommandLineDivision 
{

	public static void main(String[] args) 
	{
		try
		{
			int dividend = Integer.parseInt(args[0]);
			int divisor = Integer.parseInt(args[1]);
			try
			{
				IO.println("Division Result :"+(dividend/divisor));
			}
			catch(ArithmeticException e)
			{
				IO.println(e);
			}
			finally
			{
				IO.println("Division Operation Completed.");
			}
			
		}
		catch(NumberFormatException | ArrayIndexOutOfBoundsException e)
		{
			IO.println(e);
		}



	}

}

package com.ak.exception_types;

public class DivisionExample 
{

	public static void main(String[] args) 
	{
		int dividend = Integer.parseInt(IO.readln("Enter Divident :"));
		int divisor = Integer.parseInt(IO.readln("Enter Divisor :"));
		
		
		try
		{
			
			IO.println("Result of division : "+performDivision(dividend,divisor));
		}
		catch(ArithmeticException e)
		{
			IO.println("ArithmeticException caught: Division by zero: dividend="+dividend+", divisor="+divisor);
		}

	}

	public static int performDivision(int dividend,int divisor) throws ArithmeticException
	{
		return dividend/divisor;
	}
}

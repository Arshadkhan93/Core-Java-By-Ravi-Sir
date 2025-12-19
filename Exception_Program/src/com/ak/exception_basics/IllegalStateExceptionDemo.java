package com.ak.exception_basics;

public class IllegalStateExceptionDemo 
{

	public static void main(String[] args) 
	{
		
		IO.println("Calling throwIllegalException from main method:");
		throwIllegalException();
	}
	
	static void throwIllegalException()
	{
		try
		{
			throw new IllegalStateException("My Exception");
		}
		catch(IllegalStateException obj)
		{
			IO.println("Catch :"+obj);
		}
		
	}

}

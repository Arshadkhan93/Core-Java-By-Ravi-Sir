package com.ak.exception_basics;

public class SimpleExceptionDemo {

	public static void main(String[] args) 
	{
		try
		{
			int a= Integer.parseInt(IO.readln("Enter the first integer (a):"));
			int b= Integer.parseInt(IO.readln("Enter the Second integer (b):"));
			
			IO.println("You Entered : a = "+a+" b = "+b);
		}
		catch(Exception e)
		{
			IO.println(e);
			IO.println("InputMismatchException occurred. Please enter only integer numbers.");
			IO.println(e.getMessage());
			e.printStackTrace();
			
		}
	}

}

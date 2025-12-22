package com.ak.exception_types;

import java.util.Scanner;

public class ExceptionHandlingDemo 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = IO.readln("Input :");
		if(s.equalsIgnoreCase("null"))
			s=null;
		sc.close();
		handleExceptions(s);

	}
	
	public static void handleExceptions(String str)
	{
		try
		{
			IO.println("Length of the input string: "+str.length());
			int num = Integer.parseInt(str);
			IO.println("Converted to integer: "+num);
			IO.println("Uppercase version: "+str.toUpperCase());
		}
		catch(NullPointerException | NumberFormatException e)
		{
			if(e instanceof NumberFormatException)
				IO.println("NumberFormatException: Input is not a valid integer.");
			else
				IO.println("NullPointerException: Input is null.");
				
		}
	}

}

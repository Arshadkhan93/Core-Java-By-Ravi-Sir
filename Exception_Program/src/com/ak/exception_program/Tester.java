package com.ak.exception_program;

public class Tester 
{

	public static void main(String[] args) 
	{
		ChildClass childClass = new ChildClass();
		for(String str:args)
		{
			try
			{			
				childClass.loadingClass(str);
				IO.println(str);
				IO.println("Class "+str+" loaded successfully.");
				
			}
			catch(ClassNotFoundException | IllegalArgumentException e)
			{
				IO.println("Error: Class not found - null");
			}
		}

	}

}

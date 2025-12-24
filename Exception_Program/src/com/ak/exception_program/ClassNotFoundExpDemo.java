package com.ak.exception_program;


public class ClassNotFoundExpDemo 
{

	public ClassNotFoundExpDemo(String str) 
	{
		try 
		{
			Class<?> cls = Class.forName(str);
			IO.println("Class loaded successfully: "+cls);
		}
		catch (ClassNotFoundException e) 
		{
			IO.println("Error: Class '"+str+"' not found.");
			e.printStackTrace();
		}
	}
	void main()
	{
		String name = IO.readln("Enter the Class Name to Load :");
		new ClassNotFoundExpDemo(name);
	}
}

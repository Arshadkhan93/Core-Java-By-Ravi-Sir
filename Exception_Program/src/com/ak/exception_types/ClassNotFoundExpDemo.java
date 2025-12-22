package com.ak.exception_types;

public class ClassNotFoundExpDemo 
{

	public static void main(String[] args) 
	{
		String className=IO.readln("Enter the class name to load: ");
		new ClassNotFoundExpDemo(className);
		
	}
	
	public ClassNotFoundExpDemo(String className) 
	{
		
		Class<?> cls = null;
			try 
			{
				cls = Class.forName(className);
				IO.println("Class loaded successfully: "+cls);
			} 
			catch (ClassNotFoundException e) 
			{
				IO.println("Error: Class '"+className+"' not found.");
				e.printStackTrace();
			}
		
	}
}
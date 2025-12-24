package com.ak.exception_program;

public class ParentClass 
{
	public void loadingClass(String name) throws ClassNotFoundException
	{
		
		Class.forName(name);
		
	}
		

}

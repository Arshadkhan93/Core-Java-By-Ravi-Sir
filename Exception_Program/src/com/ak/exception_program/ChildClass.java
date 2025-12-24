package com.ak.exception_program;

public class ChildClass extends ParentClass 
{
	@Override
	public void loadingClass(String name) throws ClassNotFoundException
	{
		if(name.isEmpty() || name==null || name.isBlank())
		{
			throw new IllegalArgumentException();
		}
		else
			super.loadingClass(name);	
	}

	
}

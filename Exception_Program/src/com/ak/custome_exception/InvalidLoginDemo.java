package com.ak.custome_exception;

class InvalidLoginDemo
{
	void main()
	{
		IO.println("Hellow User...");
		String userName=IO.readln("Enter User Name :");
		String password=IO.readln("Enter Password for User "+userName+":");
		try
		{
		validateLogin(userName, password);
		}
		catch(InvalidLoginException e)
		{
			IO.println(e);
		}
	}
	
	public static void validateLogin(String userName, String password)
	{
		if(userName.isEmpty() || password.isEmpty())
		{
			throw new InvalidLoginException("Enter values fields cannot be Empty!!!");
		}
		if(password.length()<6)
		{
			throw new InvalidLoginException("Password must be at least 6 Digit long!!!");
		}
		else
		{
			
			IO.println("Successfull Login. \n User Name :"+userName);
			IO.println("Wellcome To Application!!");
			IO.println();
		}
	}
}

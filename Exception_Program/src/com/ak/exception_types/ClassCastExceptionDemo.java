package com.ak.exception_types;

public class ClassCastExceptionDemo 
{

	public static void main(String[] args) 
	{
		handleClassCastException();

	}
	
	public static void handleClassCastException()
	{
		Object arr[]= {"Hello", true, 123, "Java"};
		
		for(Object obj: arr)
		{
			try
			{
				String str=(String) obj;
				IO.println("Casting successful: "+str);
			}
			catch(ClassCastException e)
			{
				IO.println(e);
				e.printStackTrace();
			}
		}
	}

}

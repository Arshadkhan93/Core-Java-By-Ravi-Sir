package com.ak.exception_basics;

public class ArrayIndexExceptionDemo 
{

	public static void main(String[] args) 
	{
		int arr[] = new int[2];
		   arr[0] = 10;
		   arr[1] = 20;
		   
		   try
		   {
			   int index=Integer.parseInt(IO.readln("Enter index to Fetch Element :"));
			   IO.println("Element on "+index+" is :"+arr[index]);
		   }
		   catch(Exception e)
		   {
			   IO.println(e.getMessage());
			   IO.println(e);
			   e.printStackTrace();
			   IO.println("Please Enter Index between range (0 to 1) !!!");
		   }

	}

}

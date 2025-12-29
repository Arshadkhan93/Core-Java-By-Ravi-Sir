package com.ak.array_program;

/*Que 4 :
=======
Write a java program to print all even elements and odd elements 
separately from an array.

Input as  : 1 2 3 4 5 6 7
Even elements are : 2 4 6
Odd elements are : 1 3 5 7
*/

public class SeparateEvenOdd 
{

	public static void main(String[] args) 
	{
		int arr[]=new int[] {1,2,3,4,5,6,7};
		IO.print("Even Elements Are :");
		for(int e:arr)
		{
			if(e%2==0)
				IO.print(e+" ");
		}
		IO.print("\nOdd Elements Are :");
		for(int o:arr)
		{
			if(o%2!=0)
				IO.print(o+" ");
		}

	}

}

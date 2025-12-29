package com.ak.array_program;

/*Que 5:
=======
Write a java program to find the middle elements of a given array. 
If array is odd then print only the middle element, if array is even
then print both the middle elements.

Input as : 1 2 3 4 5     
Output is : 3

Input is :1 2 3 4 5 6    
Output is :3 4*/

public class FindMiddleElement 
{

	public static void main(String[] args) 
	{
		int s=Integer.parseInt(IO.readln("Enter The Size Of Array:"));
		int arr[]=new int[s];
		for(int i=0;i<s;i++)
		{
			arr[i]=Integer.parseInt(IO.readln("Enter "+i+"th Element:"));
		}
			if(s%2==0)
			{
				IO.print("Middle Elements From Even Array is: ");
				IO.print(arr[s/2]+" ");
				IO.print(arr[(s/2)-1]);
			}
			else
			{
				IO.print("Middle Element From Odd Array is: ");
				IO.print(arr[s/2]);
			}
		

	}

}

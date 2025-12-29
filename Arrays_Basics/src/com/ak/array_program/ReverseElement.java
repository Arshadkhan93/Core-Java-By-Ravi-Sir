package com.ak.array_program;
/*Que 2:
=======
Print all elements in reverse order of an Array.

Input as: 1 2 3 4 5
Output as: 5 4 3 2 1*/
public class ReverseElement {

	public static void main(String[] args) 
	{
		int arr[]= new int[] {1,2,3,4,5};
		IO.println("Orignal Array");
		for(int a: arr)
		{
			IO.print(a+" ");
		}
		IO.println("\nReversed Array");
		for(int i=arr.length-1;i>=0;i--)
		{
			IO.print(arr[i]+" ");
		}

	}

}

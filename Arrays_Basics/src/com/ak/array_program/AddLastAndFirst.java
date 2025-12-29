package com.ak.array_program;

/*Que 3 :
=======
Write a java program to add the last and first element of a given array.

Input as: [1,2,3,4,5,6]   
Output as: 7
*/

public class AddLastAndFirst 
{

	public static void main(String[] args) 
	{
		int arr[]=new int[] {1,2,3,4,5,6};
		IO.println("Addition of First And Last Elements of Array :"+(arr[0]+arr[arr.length-1]));

	}

}

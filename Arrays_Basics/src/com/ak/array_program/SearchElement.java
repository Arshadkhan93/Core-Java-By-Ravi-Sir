package com.ak.array_program;
/*Que 1 :
========
Search for a given Element in an Array if present then print
"Element found at index : ", if not present print "Element not found"
    
Input as: 1 4 3 5 2 6 5
Enter searching element: 5
Output: Element found at index 3

Input as: 1 4 3 5 2 6
Enter searching element: 7
Output: Element not found*/
public class SearchElement 
{

	public static void main(String[] args) 
	{
		
		int arr[]=new int[] {1,4,3,5,2,6,5};
		int element=Integer.parseInt(IO.readln("Enter Searching Element"));
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element)
			{
				IO.println("Element found at index "+i);
				System.exit(0);;
			}
		}
		IO.println("Element Not Found");

	}

}

package com.ak.array_basics;

import java.util.*;
/*
 Write a Java program to remove duplicate elements from a given array and display the resulting array with only unique elements.

Input Format:

First line: Integer n representing the number of elements in the array

Second line: n integers separated by spaces

Output Format:

Display the array after removing duplicates.

Examples
Example 1
Input:
8
1 2 2 3 4 4 5 5
Output:
Array after removing duplicates: [1, 2, 3, 4, 5]
*/
public class RemoveDuplicateEle {
	
	    public static void main(String[] args)
	    {
	        // int arr[]={1,2,1,1,2,3};
	        Scanner sc= new Scanner(System.in);
	        System.out.print("Enter array size: ");
	        int s= sc.nextInt();
	        if(s<=0)
	        {
	            System.out.print("Invalid Array Size");
	            System.exit(0);
	        }
	        int arr[]=new int[s];
	        for(int i=0;i<s;i++)
	        {
	        	System.out.println("Enter "+i+"th Elements of Array");
	            arr[i]=sc.nextInt();
	        }
	        sc.close();
	        arr = Arrays.stream(arr).distinct().toArray();
	        System.out.print("Array after removing duplicates: "+Arrays.toString(arr));
	    }

	}


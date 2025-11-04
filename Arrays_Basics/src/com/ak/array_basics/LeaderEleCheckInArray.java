package com.ak.array_basics;
import java.util.*;
/*
 * An element is called a leader if it is greater than all the elements to its right side.
Write a Java program to print all leader elements in the given array.

Input Format:

First line: Integer n representing number of elements

Second line: n integers separated by spaces

Output Format:

Display leader elements separated by spaces.

Examples
Example 1
Input:
6
16 17 4 3 5 2
Output:
Leader elements are: 17 5 2
 */
public class LeaderEleCheckInArray {
	
	    public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter array size: ");
	        int s= sc.nextInt();
	        int arr[]=new int[s];
	        for(int i=0;i<s;i++)
	        {
	        	System.out.println("Enter "+i+"th Elements of Array");
	            arr[i]=sc.nextInt();

	        }
	        sc.close();
	        System.out.print("Leader elements are: ");
	        int max=0;
	        int last=0;
	        for(int i=0;i<s;i++)
	        {
	            max=arr[i];
	            last=arr[s-1];
	            for(int j=i+1;j<s;j++)
	            {
	                if(arr[i]<arr[j])
	                {
	                    max=arr[j];
	                }
	            }
	            System.out.print(max+" ");
	            if(max==last)
	            break;
	        
	        }
	    }

}

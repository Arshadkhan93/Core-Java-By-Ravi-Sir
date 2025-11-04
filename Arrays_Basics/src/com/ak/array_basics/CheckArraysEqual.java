
package com.ak.array_basics;
import java.util.*;
/*
  Write a Java program to check whether two integer arrays are equal.
-> Two arrays are considered equal if:
   They have the same length & All elements at the same positions.

Example1 :
input    : 
arr1     : [1,2,3,4,5]
arr2     : [1,2,3,4,5]
output   : Equal


Example2 :
input    : 
arr1     : [1,2,3,4,5]
arr2     : [5,2,3,4,1]
output   : Not Equal


Example3 :
input    : 
arr1     : [2,3,1]
arr2     : [2,3,1,1]
output   : Not Equal

Testcase 1:- 
Enter number of elements in first array: 4
Enter elements of first array:
1
2
3
4
Enter number of elements in second array: 4
Enter elements of second array:
1
2
3
4

Expected Output :-


Equal


Examples
Example 1
Input:
4
1
2
3
4
4
1
2
3
4
Output:
Equal

 */
public class CheckArraysEqual {

	    public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter array size: ");
	        int s1= sc.nextInt();
	        int arr[]=new int[s1];
	        for(int i=0;i<s1;i++)
	        {
	        	System.out.println("Enter "+i+"th Elements of Array");
	            arr[i]=sc.nextInt();
	        }
	        System.out.print("Enter array size: ");
	        int s2=sc.nextInt();
	        int arr2[]=new int[s2];
	        for(int i=0;i<s2;i++)
	        {
	        	System.out.println("Enter "+i+"th Elements of Array");
	            arr2[i]=sc.nextInt();
	        }
	        sc.close();
	        if(s2==s1)
	        {
	            int eq=0;
	            for(int i=0;i<s1;i++){
	                if(arr[i]==arr2[i])
	                {
	                    eq++;
	                }
	            }
	            if(eq==s1)
	            {
	                System.out.print("Equal");
	            }else
	            System.out.print("Not Equal");

	        }
	        else{
	            System.out.print("Not Equal");
	        }

	    }
	}


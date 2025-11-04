package com.ak.array_basics;

import java.util.Scanner;
/*
 * Write a Java program to find the frequency of each element present in the given array.
Each unique element should be displayed once along with its frequency count.

Input Format:

First line: Integer n representing the number of elements in the array

Second line: n integers separated by spaces

Output Format:

Display each element and its frequency in the following format:
Element: x, Frequency: y

Examples
Example 1
Input:
7
1 2 2 3 3 3 4
Output:
Element: 1, Frequency: 1
Element: 2, Frequency: 2
Element: 3, Frequency: 3
Element: 4, Frequency: 1

 */
public class ArrayFreqCheck {
	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int s= sc.nextInt();
        if(s<=0)
        {
            System.out.print("Invalid Array Size");
            System.exit(0);
        }
        int arr[]= new int[s];
        for(int i=0;i<s;i++)
        {
        	System.out.println("Enter "+i+"th Elements of Array");
            arr[i]=sc.nextInt();
        }
        //arr= Arrays.stream(arr).distinct().toArray();
        /*for(int i=0;i<s;i++)
        {
            int count=0;
            for(int j=0;j<s;j++)
            {
                
            }
        }*/
        for(int i=0;i<arr.length;i++)
        {
            int freq=1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    freq++;
                    arr[j]='*';
                    
                }

            }
            sc.close();
            if(arr[i]!='*')
            System.out.print("Element: "+arr[i]+", Frequency: "+freq+"\n");
        }
    }
}

package com.ak.array_basics;
import java.util.*;
/*
 * Write a Java program to count and display the total number of digits in each element of an array.

Input Format:

First line: Integer n (size of array)

Second line: n integers separated by spaces

Output Format:

Display each element along with its digit count in the following format:
Number: x, Digits: y

Examples
Example 1
Input:
5
12 345 2 6789 56

 */
public class ArrayElementDigitCounter{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int s=sc.nextInt();
        int arr[] =new int[s];
        for(int i=0;i<s;i++)
        {
        	System.out.println("Enter "+i+"th Elements of Array");
            arr[i]=sc.nextInt();
        }
        sc.close();
        for(int i=0;i<s;i++)
        {
            int digit=0;
            int num=arr[i];
            while(num!=0)
            {
                num/=10;
                digit++;
            }
            System.out.print("Number: "+arr[i]+", Digits: "+digit+"\n");
        }

    }
}
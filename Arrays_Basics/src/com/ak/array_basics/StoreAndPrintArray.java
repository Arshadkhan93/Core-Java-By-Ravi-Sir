package com.ak.array_basics;

import java.util.Arrays;
import java.util.Scanner;

public class StoreAndPrintArray 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size :");
		int size = Integer.parseInt(sc.nextLine());
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.print("Enter arr["+i+"]"+"th Element:");
			arr[i]=Integer.parseInt(sc.nextLine());
		}
		System.out.print("Output :");
//		for(int i=0;i<size;i++)
//		{
//		}
		System.out.println(Arrays.toString(arr));
		sc.close();
		
	}

}

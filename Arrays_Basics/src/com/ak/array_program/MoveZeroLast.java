package com.ak.array_program;

import java.util.Arrays;

public class MoveZeroLast 
{
	void main()
	{
		int arr[]= {1,2,0,0,6,89,0,52,9,0,8};
		int ar[]= new int[arr.length];
		
		int index=0;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
				ar[index++]=arr[i];
			else
				count++;		
				
		}
		for(int i=ar.length-1;i>=count;i--)
		{
			ar[i]=0;
		}
		IO.println(Arrays.toString(ar));
	}

}

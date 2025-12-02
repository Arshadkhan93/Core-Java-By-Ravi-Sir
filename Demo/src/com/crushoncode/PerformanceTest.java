package com.crushoncode;

public class PerformanceTest {

	public static void main(String[] args) 
	{
		int iteration = 1000000;
		
		StringBuilder builder = new StringBuilder("Java");
		
		long startTime = System.currentTimeMillis();
		
		for(int i=1; i<=iteration; i++) 
		{
		    builder.append(" technology");	
		}		
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("Total time taken by StringBuilder class :"+(endTime - startTime)+" ms");
	
	
		System.out.println("...........................");
		
        StringBuffer buffer = new StringBuffer("Java");
		
		startTime = System.currentTimeMillis();
		
		for(int i=1; i<=iteration; i++) 
		{
		    buffer.append(" technology");	
		}		
		
		endTime = System.currentTimeMillis();
		
		System.out.println("Total time taken by StringBuffer class :"+(endTime - startTime)+" ms");
	}

}







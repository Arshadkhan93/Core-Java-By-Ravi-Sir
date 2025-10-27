package com.task.sep_24th;

public class Program01_Sum {
public static void main(String[] args) {
	int sum = 0;
	int argument1=Integer.parseInt(args[0]);
	int argument2=Integer.parseInt(args[1]);
	int argument3=Integer.parseInt(args[2]);
	int argument4=Integer.parseInt(args[3]);
	sum = argument1+argument2+argument3+argument4;
	System.out.println("The Sum of Arguments is :"+sum);
	
}
}

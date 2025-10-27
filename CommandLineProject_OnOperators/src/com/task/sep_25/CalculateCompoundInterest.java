package com.task.sep_25;
/*3) Write a Java program to calculate compound interest for 3 years? 
Formula = amount=principle*((1+rate/100)*(1+rate/100)*(1+rate/100));
 */
public class CalculateCompoundInterest {
	public static void main(String[] args) {
		double principle = Double.parseDouble(args[0]);
		double rate = Double.parseDouble(args[1]);
		double amount= principle*((1+rate/100)*(1+rate/100)*(1+rate/100));
		System.out.println("Amount After 3 Years :"+amount);
		
	}

}

package com.ak.blc;

public class NextMultipleOfHundred 
{
	public static int getNextMultipleOfHundred(int num) {
		int div=num/100;
		
		return ++div*100;
		
	}

}

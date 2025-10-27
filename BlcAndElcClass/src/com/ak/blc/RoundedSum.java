package com.ak.blc;

public class RoundedSum {
	public static int sumOfRoundedValues(int a,int b,int c) {
		
//		int a1=(a%10)>5?((a/10)+1)*10:(a/10)*10;
//		int b1=(b%10)>5?((b/10)+1)*10:(b/10)*10;
//		int c1=(c%10)>5?((c/10)+1)*10:(c/10)*10;
//		return a1+b1+c1;
	return (int)(Math.round(a/10.0)*10+Math.round(b/10.0)*10+Math.round(c/10.0)*10);
	}

}

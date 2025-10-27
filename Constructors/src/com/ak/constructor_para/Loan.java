package com.ak.constructor_para;

public class Loan 
{
	private double principal;
	private double interestRate;
	private int durationMonths;
	public Loan(double principal, double interestRate, int durationMonths) {
		super();
		if(principal<0) {System.err.println("Error");
		System.exit(0);}
		this.principal = principal;
		if(interestRate<0) {System.err.println("Error");}
		this.interestRate = interestRate;
		if(durationMonths<0) {System.err.println("Error");
		System.exit(0);}
		
		this.durationMonths = durationMonths;
	}
	public double getPrincipal() {
		return principal;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public int getDurationMonths() {
		return durationMonths;
	}
	
	
	
	
	
}

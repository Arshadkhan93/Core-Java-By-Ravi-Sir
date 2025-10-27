package com.ak.calculate_simple_interest;

import java.util.Scanner;

public class InvestmentCalculator {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your name: ");
		String name=sc.nextLine();
		System.out.print("Enter Principal Amount: ");
		double principalAmount=Double.parseDouble(sc.nextLine());
		System.out.print("Enter Duration Time (in months): ");
		double time= Double.parseDouble(sc.nextLine());
		Customer raj = new Customer(name, principalAmount, time);
		InvestmentResult result = CalculateInvestment.calculateInvestment(raj);
		System.out.println(result);
		sc.close();

	}

}

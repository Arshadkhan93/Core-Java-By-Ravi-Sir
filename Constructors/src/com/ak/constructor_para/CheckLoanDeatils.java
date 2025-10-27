package com.ak.constructor_para;

import java.util.Scanner;
//hello
public class CheckLoanDeatils {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Loan Amount :");
		double amount=Double.parseDouble(sc.nextLine());
		System.out.print("Enter Interest Rate :");
		double rate = Double.parseDouble(sc.nextLine());
		System.out.print("Enter Number of Months For Laon :");
		int duration = Integer.parseInt(sc.nextLine());
		Loan l = new Loan(amount, rate, duration);
		System.out.println("Principal : "+l.getPrincipal());
		System.out.println("Interest Rate (Yearly %): "+l.getInterestRate());
		System.out.println("Duration (months): "+l.getDurationMonths());
		sc.close();
		
				

	}

}

package com.ak.oop_concept;

import java.util.Scanner;

public class BankCustomer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank raj = new Bank();
		System.out.println("===== Welcome to "+Bank.bankName+" =====");
		System.out.print("Enter Customer Name : ");
		String customerName = sc.nextLine();
		System.out.print("Enter Account Number : ");
		int acountNumber = Integer.parseInt(sc.nextLine());
		System.out.print("Enter Opening Balance : ");
		double balance = Double.parseDouble(sc.nextLine());
		System.out.println("Customer account created successfully!");
		raj.setCustomerDeatils(customerName, acountNumber, balance);
		
		while(true) {
			System.out.println("\n\n=====MENU=====\n 1.Deposit\n 2.Withdraw\n 3.Check Balance\n 4.Display Customer Details\n 5.Exit");
			System.out.print("Enter Your Choice : ");
			int choice = Integer.parseInt(sc.nextLine());
			switch(choice) {
			case 1->{
				System.out.print("Enter deposit amount: ");
				double amount = Double.parseDouble(sc.nextLine());
				raj.deposit(amount);
				}
			
			case 2->{
				System.out.print("Enter Withdraw amount: ");
				double amount = Double.parseDouble(sc.nextLine());
				raj.withdraw(amount);
				}
			
			case 3->{
				System.out.println("Current Balance : "+raj.getCurrentBalance());;
				}
			
			case 4->{
				System.out.println(raj.displayDetails());
				}
			
			case 5->{
				System.out.println("Thank you for banking with "+Bank.bankName+" Bank!");
				sc.close();
				System.exit(0);
				}
			default->{
				System.err.println("Enter Valid Choice!!");
			}
			
			}
		}
		
		
	}
	

}

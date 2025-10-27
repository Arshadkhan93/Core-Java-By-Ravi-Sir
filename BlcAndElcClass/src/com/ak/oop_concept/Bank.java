package com.ak.oop_concept;

public class Bank {
	private String customerName;
	private int accountNumber;
	private double currentBalance;
	public static String bankName="SBI";
	public static String bankAddress="Hyderabad";
	public static String IFSCcode="SBIN005449";
	
	public void setCustomerDeatils(String name,int ACNO,double balance) 
	{
		if(balance<=0) {
			System.err.println("Enter Valid Balnce");
			System.exit(0);
		}
		customerName=name;
		currentBalance=balance;
		accountNumber=ACNO;
		
	}
	public void withdraw(double amount) 
	{
		if(amount>currentBalance) {
			System.err.println("You have insufficient balance");
			System.exit(0);
		}else {
		currentBalance-=amount;
		System.out.println("Withdrar successful! ₹"+amount+" debited.");
		}
	}
	
	public void deposit(double amount) 
	{
		if(amount<=0) {
			System.err.println("Invalid Amount");
			System.exit(0);
		}else {
		currentBalance+=amount;
		System.out.println("Deposit successful! ₹"+amount+" credited.");
		}
	}
	
	public double getCurrentBalance()
	{
		return currentBalance;
	}
	
	public String displayDetails() {
		return "Bank [customerName=" + customerName + ", accountNumber=" + accountNumber + ", currentBalance="
				+ currentBalance + "]";
	}
	
	
	

}

package com.ak.exam_11_oct;

import java.util.Scanner;

public class ShoppingCart {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name :");
		String name = sc.nextLine();
		System.out.print("Enter Bill Amount :");
		double billAmount =Double.parseDouble(sc.nextLine());
		double result =Discount.calculateDiscount(billAmount);
		System.out.println("------ BILL SUMMARY ------");
		System.out.println("Customer Name: "+name);
		System.out.println("Original Bill: "+billAmount);
		System.out.println("Amount Payable after Discount: "+result);
		sc.close();
	}

}

package com.ak.elc;
import com.ak.blc.*;
import java.util.Scanner;

public class ShoppingCart {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Customer Name :");
		String name=sc.nextLine();
		System.out.print("Enter Total Bill Amount:");
		double billAmount=Double.parseDouble(sc.nextLine());
		
		System.out.println("------ BILL SUMMARY ------");
		System.out.println("Customer Name: "+name);
		System.out.println("Original Bill: "+billAmount);
		System.out.println("Amount Payable after Discount: "+Discount.calculateDiscount(billAmount));
		sc.close();
	}

}

package com.ak.elc;
import com.ak.blc.*;
import java.util.Scanner;

public class HotelBookingApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.print("Enter Customer Name :");
		String name = sc.nextLine();
		System.out.print("Enter Hotel Name :");
		String hotelName = sc.nextLine();
		System.out.print("Enter Room Rate per Day: ");
		double roomRate = Double.parseDouble(sc.nextLine());
		System.out.print("Enter Number of Days Stayed: ");
		int days = Integer.parseInt(sc.nextLine());
		double totalAmount = Hotel.calculateTotalAmount(roomRate, days);
		System.out.println("----- HOTEL BOOKING SUMMARY ----- ");
		System.out.println("Customer Name     : "+name);
		System.out.println("Hotel Name        : "+hotelName);
		System.out.println("Room Rate (per day): "+roomRate);
		System.out.println("Days Stayed       : "+days);
		System.out.println("Total Amount      : ₹"+totalAmount);
		System.out.println("Amount after Discount: ₹"+Hotel.calculateDiscountedAmount(days, totalAmount));
		sc.close();

	}

}

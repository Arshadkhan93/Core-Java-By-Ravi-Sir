package com.ak.oops;

import java.util.Scanner;

public class ProductDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product laptop = new Product();
		System.out.print("Enter Product Id :");
		int id = Integer.parseInt(sc.nextLine());
		System.out.print("Enter Product Name :");
		String name= sc.nextLine();
		System.out.print("Enter Product Price :");
		double price = Double.parseDouble(sc.nextLine());
		laptop.setProductDetails(name, id, price);
		System.out.println("----- Product Details -----");
		System.out.println(laptop);
		laptop.calculateDiscount();
		sc.close();

	}

}

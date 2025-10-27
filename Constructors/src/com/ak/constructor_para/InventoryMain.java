package com.ak.constructor_para;

import java.util.Scanner;

public class InventoryMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Item Name :");
		String itemName=sc.nextLine();
		System.out.print("Enter price Per Unit :");
		double price=Double.parseDouble(sc.nextLine());
		System.out.print("Enter Quantity in Stock :");
		int quantity=Integer.parseInt(sc.nextLine());
		InventoryItem item = new InventoryItem(itemName, price, quantity);
		System.out.println("Inventory Item Details:");
		while(true) {
		System.out.println("Item Name :"+item.getItemName());
		System.out.println("Price per unit :"+item.getPricePerUnit());
		System.out.println("Quantity in Stock : "+item.getQuantityInStock());
		System.out.println("Total Inventory Value: "+item.calculateTotalValue());
		
		System.out.print("Any updation in Stock Price OR Quantity :");
		String choice = sc.nextLine();
		if(choice.equalsIgnoreCase("yes"))
		{
			System.out.print("Enter New Price Per Unit :");
			item.setPricePerUnit(Double.parseDouble(sc.nextLine()));
			System.out.print("Enter New Quantity in Stock :");
			item.setQuantityInStock(Integer.parseInt(sc.nextLine()));
			System.out.println("Updated Inventory Item Details:");
			
		}
		else
		{
			sc.close();
			System.exit(0);
		}
		}
		

	}

}




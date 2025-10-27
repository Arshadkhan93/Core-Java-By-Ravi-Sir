package com.ak.constructor_basic;

import java.util.Scanner;

public class ConstructorDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Car Model :");
		String model = sc.nextLine();
		System.out.print("Enter Car Manufacturing year :");
		int year = Integer.parseInt(sc.nextLine());
		System.out.print("Enter Car price :");
		double price = Double.parseDouble(sc.nextLine());
		Car swift = new Car(model, year, price);
		System.out.println(swift);
		sc.close();

	}

}

class Car{
	private String model;
	private int year;
	private double price;
	public Car(String model, int year, double price) {
		super();
		this.model = model;
		if(year>2010) {
			this.year = year;
		}else{
			System.err.println("year must be greater than 2010");
			System.exit(0);
			}
		if(price>0) {
			this.price = price;
		}
		else{
			System.err.println("Price must be positive integer");
			System.exit(0);
		}
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", year=" + year + ", price=" + price + "]";
	}
	
}
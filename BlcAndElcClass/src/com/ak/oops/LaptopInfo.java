package com.ak.oops;

public class LaptopInfo {

	public static void main(String[] args) {
		Laptop l=new Laptop();
		l.name="DELL";
		l.processor="i5";
		l.price=3900.0;
		l.color="Silver";
		l.getLaptopInfo();

	}

}
class Laptop{
	String name;
	String processor;
	double price;
	String color;
	public void getLaptopInfo() {
		System.out.println("Laptop Name Is :"+name);
		System.out.println("Laptop processor Is :"+processor);
		System.out.println("Laptop Price Is :"+price);
		System.out.println("Laptop Color Is :"+color);
	}
	
}
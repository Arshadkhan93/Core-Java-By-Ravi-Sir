package com.ak.cake_order;

public class CakeOrder {

	public static void main(String[] args) {
		Cake order1 = new OrderedCake();
		System.out.println(order1);
		Cake order2= new OrderedCake("Round", "Vanilla", 3);
		IO.println(order2);
		Cake order3= new OrderedCake("Squre", "Vanilla", 4, "Junaid");
		IO.println(order3);
	}

}

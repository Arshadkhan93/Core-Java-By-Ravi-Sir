package com.ak.oops;

public class CarInformation {

	public static void main(String[] args) {
		Car c=new Car();
		c.name="Thar";
		c.model=1990;
		c.color="Black";
		c.getCarInformation();
		c.drive();
	}

}
class Car{
	String name;
	String color;
	int model;
	public void getCarInformation(){
		System.out.println("The Car name is "+name+"\nThe Car Color is "+color+"\nThe car Model is "+model);
		
	}
	public void drive(){
		System.out.println("We can Drive Car");
	}
}
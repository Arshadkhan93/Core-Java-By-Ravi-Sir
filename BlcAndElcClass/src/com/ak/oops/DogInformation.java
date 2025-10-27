package com.ak.oops;

public class DogInformation {
	public static void main(String[] args) {
		Dog di =new Dog();
		di.name="Tom";
		di.height=3.7;
		di.age=2;
		di.getDoginformation();
		di.bark();
	}

}
class Dog{
	String name;
	double height;
	int age;
	public void getDoginformation() {
		System.out.println("Hellow Everyone The name of dog is "+name+"\n And his Height is "+height+"\n And his age is "+age+" years");
		
	}
	public void bark() {
		System.out.println("The Dog Can Bark.");
	}
	
}

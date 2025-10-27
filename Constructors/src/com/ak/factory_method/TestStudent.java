package com.ak.factory_method;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("Enter Your Name: ");
			String name = sc.nextLine();
			System.out.print("Enter Your Age: ");
			int age = Integer.parseInt(sc.nextLine());
			System.out.print("Enter Your Grade: ");
			String grade =sc.nextLine();
			Student raj =Student.createStudentObject(name, age, grade);
			System.out.println(raj);
			
			System.out.println("You want to Create more objects [yes/no]:");
			String choice=sc.nextLine();
			if(choice.equalsIgnoreCase("no")) {
				sc.close();
				System.exit(0);
			}
		}
		
		
	}

}
class Student{
	private String name;
	private int age;
	private String grade;
	
	private Student(String name, int age, String grade) {
		super();
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	public static Student createStudentObject(String name, int age, String grade) {
		return new Student(name, age, grade);
	}

	
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}
	
	
}

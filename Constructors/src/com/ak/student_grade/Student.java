package com.ak.student_grade;

public class Student 
{
	private String name; //raj
	private int marks; //95
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public int getMarks() {
		return marks;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return this.name;
	}
	
	
	
}

package com.ak.oop_concept;

public class Student 
{
	private String studentName;
	private int studentId;
	private int studentMark;
	private char studentGrade;
	public void setStudentData(int id,String name,int mark) 
	{
		studentId=id;
		studentMark=mark;
		studentName=name;
	}
	public void calculateGrade() 
	{
		/*
		 if(studentMark>=90) {
			studentGrade='A';
		}else if(studentMark>80) {
			studentGrade='B';
		}else if(studentMark>70) {
			studentGrade='C';
		}else if(studentMark>60) {
			studentGrade='D';
		}else{
			studentGrade='E';
		}
		*/
		studentGrade=switch(studentMark){
		case 90,91,92,93,94,95,96,97,98,99,100->'A';
		case 80,81,82,83,84,85,86,87,88,89 ->'B';
		case 70,71,72,73,74,75,76,77,78,79 ->'C';
		case 60,61,62,63,64,65,66,67,68,69 ->'D';
		default ->'E';
		};
	}
	public String getstudentDetails() {
		return "Student [name="+studentName+", studentId="+studentId+", marks="+studentMark+", grade="+studentGrade+"]";
	}
	

}

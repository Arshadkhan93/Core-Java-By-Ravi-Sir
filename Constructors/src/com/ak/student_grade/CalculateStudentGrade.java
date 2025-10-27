package com.ak.student_grade;

public class CalculateStudentGrade 
{
	public static StudentGrade calculateGrade(Student s) {
		int marks=s.getMarks();
		char grade=0;
		if(marks>90) {
			grade='A';
		}
		else if(marks>=75) {
			grade='B';
		}else if(marks>=60) {
			grade='C';
		}else {
			grade='D';
		}
		return new StudentGrade(s,grade);
		
	}
	
	

}

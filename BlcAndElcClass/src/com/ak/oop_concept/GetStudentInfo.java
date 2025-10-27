package com.ak.oop_concept;

import java.util.Scanner;

public class GetStudentInfo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student raj = new Student();
		System.out.print("Enter Student Name :");
		String studentName = sc.nextLine();
		System.out.print("Enter Student Id :");
		int studentId = Integer.parseInt(sc.nextLine());
		System.out.print("Enter Student Mark :");
		int studentMark = Integer.parseInt(sc.nextLine());
		
		raj.setStudentData(studentId, studentName, studentMark);
		raj.calculateGrade();
		String result = raj.getstudentDetails();
		System.out.println(result);
		sc.close();
		
	}

}

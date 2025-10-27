package com.ak.elc;

import java.util.Scanner;

import com.ak.blc.StudentDeatils;

public class GetStudentDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Name :");
		String name = sc.nextLine();
		System.out.print("Enter Your Roll Number :");
		int rollNumber =Integer.parseInt(sc.nextLine());
		System.out.print("Enter Your Fees :");
		double fees=Double.parseDouble(sc.nextLine());
		String result = StudentDeatils.getStudentDetails(rollNumber, name, fees);
		System.out.println(result);
		sc.close();
	}

}

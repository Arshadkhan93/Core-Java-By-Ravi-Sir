package com.ak.elc;
import com.ak.blc.*;
import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Marks :");
		double marks = Double.parseDouble(sc.nextLine());
		System.out.println("The Grade is :"+Student.calculateGrade(marks));
		sc.close();
	}

}

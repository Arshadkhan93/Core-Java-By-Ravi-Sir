package com.ak.elc;
import java.util.Scanner;

import com.ak.blc.*;
public class DigitsDifference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Two Digit Number :");
		int num = Integer.parseInt(sc.nextLine());
		System.out.println("The Difference of Digit is :"+TwoDigitsDifference.getDiffOfDigits(num));
		sc.close();
	}

}

package com.ak.elc;
import com.ak.blc.*;
import java.util.Scanner;

public class SumOfTwoDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Two Digit Number :");
		int num = Integer.parseInt(sc.nextLine());
		System.out.println("Sum Of Digits Are :"+TwoDigitsSum.getSumOfDigits(num));
		sc.close();
	}

}

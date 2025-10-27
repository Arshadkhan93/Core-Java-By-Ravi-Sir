package com.ak.elc;
import com.ak.blc.*;
import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number :");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("Enter Second Number :");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.println("The Addition is :"+Calculator.add(num1,num2));
		System.out.println("The Substraction is :"+Calculator.sub(num1,num2));
		System.out.println("The Multiplication is :"+Calculator.mul(num1,num2));
		System.out.println("The Division is :"+Calculator.div(num1,num2));
		sc.close();
	}

}

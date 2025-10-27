package com.ak.elc;
import com.ak.blc.*;
import java.util.Scanner;

public class FindNextMultipicationOfHundred {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number :");
		int num=Integer.parseInt(sc.nextLine());
		System.out.println("The Next Multiple Of Hundred Is :"+NextMultipleOfHundred.getNextMultipleOfHundred(num));
		sc.close();

	}

}

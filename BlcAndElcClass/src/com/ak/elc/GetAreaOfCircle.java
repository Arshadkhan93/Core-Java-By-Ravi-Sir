package com.ak.elc;

import java.text.DecimalFormat;
import java.util.Scanner;

import com.ak.blc.Circle;

public class GetAreaOfCircle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Radius Of Circle :");
		double radius = Double.parseDouble(sc.nextLine());
		DecimalFormat df=new DecimalFormat("00.00");
		System.out.println("The Area Of Circle Is :"+df.format(Double.parseDouble( Circle.getArea(radius))));
		sc.close();
	}

}

package com.task.sep_25;
/*1) Write a java program to calculate the curved surface area of a cube?
Formula = 6*side Square.
*/

public class Day5CurvedSurfaceArea {

	public static void main(String[] args) {
		int side = Integer.parseInt(args[0]);
		if(side>0) {
		int csa = 6*(side*side);
		System.out.println("Curved Surface Area = "+csa);
		}else {System.out.println("Invalid Input");
	}

}}

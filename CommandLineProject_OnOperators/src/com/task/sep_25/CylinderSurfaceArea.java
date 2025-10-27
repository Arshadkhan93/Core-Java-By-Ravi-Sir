package com.task.sep_25;
/*2) Write a java program to calculate the total surface area of a cylinder? 
Formula = 2 pi square r * 2 pi r h (take the pi as 3.14 with final modifier).
*/
public class CylinderSurfaceArea {
	public static void main(String[] args)
	{
		final double PI = 3.14;
		double radius = Double.parseDouble(args[0]);
		double height = Double.parseDouble(args[1]);
		double surfaceArea=(2*PI*radius*radius)+(2*PI*radius*height);
		System.out.println("Surface Area Is :"+surfaceArea);
	}

}

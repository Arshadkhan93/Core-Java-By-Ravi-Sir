package com.ak.blc;

public class Circle {
	public static String getArea(double radius) {
		if(radius<=0) {
			return "0";
		}else {
			
			return Math.PI*radius*radius+"";
		}
		
		
	}

}

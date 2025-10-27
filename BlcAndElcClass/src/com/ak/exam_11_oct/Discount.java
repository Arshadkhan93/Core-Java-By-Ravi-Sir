package com.ak.exam_11_oct;

public class Discount {
	public static double calculateDiscount(double bill) {
		
		if(bill>=5000) {
			return bill-(bill*0.20);
		}
		else if(bill>=3000) {
			return bill-(bill*0.15);
		}
		else if (bill>=1000) {
			return bill-(bill*0.10);
		}
		else {
			return bill-(bill*0.05);
		}
	}
}

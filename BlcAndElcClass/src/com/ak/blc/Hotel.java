package com.ak.blc;

public class Hotel {
	public static double calculateTotalAmount(double roomRate,int days)
	{
		return roomRate*days;
	}
	public static double calculateDiscountedAmount(int days,double totalAmount) {
		return days>=10?totalAmount-(totalAmount*0.20):
			days>=5?totalAmount-(totalAmount*0.10):
				days>=3?totalAmount-(totalAmount*0.05):
					totalAmount;
	}

}

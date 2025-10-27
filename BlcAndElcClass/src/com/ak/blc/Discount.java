package com.ak.blc;

public class Discount {
	public static double calculateDiscount(double billAmount) {
		return billAmount>=5000?billAmount-(billAmount*0.20):
			billAmount>=3000?billAmount-(billAmount*0.15):
				billAmount>=1000?billAmount-(billAmount*0.10):
					billAmount-(billAmount*0.05);
		
		
	}

}

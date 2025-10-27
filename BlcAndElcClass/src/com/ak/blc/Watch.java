package com.ak.blc;

public class Watch {
	String watchName;
	double watchPrice;
	
	public void setWatchData(String name,double price) {
		watchName=name;
		watchPrice=price;
		
	}
	public void getWatchData() {
		System.out.println("Watch Name is :"+watchName);
		System.out.println("Watch Price is :"+watchPrice);
		
	}
}

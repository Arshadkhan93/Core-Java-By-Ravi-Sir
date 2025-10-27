package com.ak.blc;

public class Television {
	String tvname;
	double tvPrice;
	int tvModel;
	String tvOs;
	public void setTvData(String name,double price,int model,String os) {
		tvname=name;
		tvPrice=price;
		tvModel=model;
		tvOs=os;
	}
	public void getTvData() {
		System.out.println("TV Name is :"+tvname);
		System.out.println("TV Price is :"+tvPrice);
		System.out.println("TV Model is :"+tvModel);
		System.out.println("TV OS is :"+tvOs);
	}
}

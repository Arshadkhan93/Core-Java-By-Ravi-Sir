package com.ak.oops;

public class Product {
	private String name;
	private int id;
	private double price;
	public void setProductDetails(String name,int id,double price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	public void calculateDiscount()
	{
		double discount;
		if(price<1000) {
			discount=price*0.05;
		}
		else if(price<=5000) {
			discount=price*0.10;
		}else {
			discount=price*0.15;
		}
		price-=discount;
		System.out.println("Discount Amount: "+discount);
		System.out.println("Price After Discount: "+price);
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", id=" + id + ", price=" + price + "]";
	}
	
}

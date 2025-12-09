package com.ak.product_tax_application;

public class PhysicalProduct extends Product 
{
	private double shippingWeight;
	

	public PhysicalProduct(String name, double price, String category, double shippingWeight) 
	{
		super(name, price, category);
		this.shippingWeight = shippingWeight;
	}


	@Override
	public void applyDiscount(double percentage) 
	{
		double discount=getPrice()*(percentage/100);
		IO.println("Discount applied :"+discount);
		setPrice(getPrice()-discount);
		IO.println("New Price :"+getPrice());
	}

	@Override
	public void calculateTax() 
	{
		IO.println("Tax RS :"+(getPrice()*0.08));

	}
	
	public double calculateShippingCost()
	{
		return shippingWeight*5;
	}


	@Override
	public String toString() {
		return "Physical :\nProduct Name: "+getName()+"\nCategory: "+getCategory()+"\nPrice RS: "+getPrice()+"\nShipping Weight: "+shippingWeight+" kg";
	}
	
	

}

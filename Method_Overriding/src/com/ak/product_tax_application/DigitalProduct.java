package com.ak.product_tax_application;

public class DigitalProduct extends Product 
{

	private String licenseKey;
	public DigitalProduct(String name, double price, String category,String licenseKey) 
	{
		super(name, price, category);
		this.licenseKey=licenseKey;
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
	public void calculateTax() {
		IO.println("Tax RS :"+(getPrice()*0.05));

	}


	@Override
	public String toString() {
		return "DigitalProduct :\nProduct Name: "+getName()+"\nCategory: "+getCategory()+"\nPrice RS: "+getPrice()+"\nLicense Key: "+licenseKey+"\n";
	}
	
	
}

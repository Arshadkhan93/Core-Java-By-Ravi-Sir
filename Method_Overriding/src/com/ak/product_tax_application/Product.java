package com.ak.product_tax_application;

public abstract class Product 
{
	private String name;
	private double price;
	private String category;
	public Product(String name, double price, String category) 
	{
		if(name==null || name.isEmpty())
		{
			IO.println("Product name cannot be empty or null.");
			System.exit(0);
		}
		if(category==null || category.isEmpty())
		{
			IO.println("Category cannot be empty or null.");
			System.exit(0);
		}
		if(price<0)
		{
			IO.println("Price cannot be negative.");
			System.exit(0);
		}
		super();
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
	public abstract void applyDiscount(double percentage);
	public abstract void calculateTax();

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public String getCategory() {
		return category;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", category=" + category + "]";
	}
	
	
}

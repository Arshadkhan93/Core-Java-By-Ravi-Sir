package com.ak.cake_order;

class Cake 
{
	private String shape;
	private String flavor;
	private int quantity;
	public static double price=400;
	public Cake(String shape, String flavor, int quantity) 
	{
		super();
		this.shape = shape;
		this.flavor = flavor;
		this.quantity = quantity;
	}
	public String getShape() 
	{
		return shape;
	}
	public String getFlavor() 
	{
		return flavor;
	}
	public int getQuantity() 
	{
		return quantity;
	}
	
	public void setShape(String shape) 
	{
		this.shape = shape;
	}
	public void setFlavor(String flavor) 
	{
		this.flavor = flavor;
	}
	public void setQuantity(int quantity) 
	{
		this.quantity = quantity;
	}
	
	public String toString()
	{
		return "A "+this.shape+" "+this.flavor+" Cake Of "+this.quantity+" KG is Ready @ Rs."+(this.quantity*price)+"";
	}	
}


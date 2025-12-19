package com.ak.object_override;

public class Product 
{
	private int productId;
	private String productName;
	
	public Product(int id,String name) 
	{
		productId=id;
		productName=name;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Product)
		{
			Product p = (Product) obj;
			if(this.productId==p.productId && this.productName.equals(p.productName))
			{
				return true;
			}
			else
				return false;
		}
		else
			IO.println("Object is not Product Type!!!");		
		return false;
	}
	
	@Override
	public int hashCode()
	{
		return this.productId;
	}
}

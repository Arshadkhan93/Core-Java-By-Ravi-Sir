package com.ak.functional_discount;

import java.util.function.Function;

public class CalculateProductDiscount 
{

	public static void main(String[] args) 
	{
		Integer id = Integer.valueOf(IO.readln("Enter Product Id :"));
		String name = IO.readln("Enter Product Name :");
		Double priceMRP = Double.valueOf(IO.readln("Enter Product Price :"));
		Product p1 = new Product(id,name,priceMRP);
		
		Function<Product,Double> discount = (product)->
		{
			double price = product.price();
			if(price>=50000)
				return price-(price*0.10);
			else
				return price-(price*0.05);
			
		};
		
		IO.println("Final price of the product is :"+discount.apply(p1));
		

	}

}

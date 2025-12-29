package com.ak.array_program;

public class ProductArrayDemo 
{
	void main()
	{
		int n =Integer.parseInt(IO.readln("Enter Numbers Of Products :"));
		Product product[]= new Product[n];
		for(int i=0;i<n;i++)
		{
			IO.println("Enter Details For Products: "+(i+1));
			int id =Integer.parseInt(IO.readln("Enter Product ID: "));
			String name = IO.readln("Enter Product Name :");
			double price = Double.parseDouble(IO.readln("Enter Product Price: "));
			product[i]=new Product(id, name, price);
			
		}
		int searchID = Integer.parseInt(IO.readln("Enter Product Id to Search :"));
		boolean isFound=false;
		for(Product p: product)
		{
			if(p.getId()==searchID) 
			{
				isFound=true;
				IO.println("Product Found : "+p.toString());
			}
		}
		if(!isFound)
			IO.println("Product with ID "+searchID+" not found.");
	}

}

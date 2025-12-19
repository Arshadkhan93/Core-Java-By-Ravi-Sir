package com.ak.object_override;

public class ProductEquality 
{

	public static void main(String[] args) 
	{
		int id = Integer.parseInt(IO.readln("Enter Id for first Object:"));
		String name = IO.readln("Enter Name for first Object:");
		int id1 = Integer.parseInt(IO.readln("Enter Id for Second Object:"));
		String name1 = IO.readln("Enter Name for Second Object:");
		
		Product p1= new Product(id, name);
		Product p2= new Product(id1, name1);
		
		IO.println("Is both object are Equal:"+p1.equals(p2));
		IO.println("HashCode :"+p1.hashCode());
		

	}

}

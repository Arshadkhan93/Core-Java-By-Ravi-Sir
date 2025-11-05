/*
 * Assignment 03 :
---------------
Develop an array for Custom class object.

Coding requirement :
--------------------
Create a BLC class called Product.

Attributes/Properties/Fields [tightly encapsulated]

id, name and price

Take a parameetrized constructor to initialize all the fields.

Take getter method for id field.

Generate toString() method.

Take an ELC class called ProductArrayDemo with main method.

Create Scanner class object to initialize product array dynamically. [User choice] 

Take a for loop to initialize the product array with user input.

We need to search the Prodcut from product array based on the product id, With the help of Scanner class ask user to input id value, using for each loop, search whether the given id product is available or not. [see test cases for more details]

If product is available based on the given id, print the product object otherwise print 
product object is not available with the given id. [Product id is working as a primary key]

Sample Output :
----------------
Test Case 1 :
--------------
Enter number of products: 3

Enter details for Product 1:
Enter Product ID: 111
Enter Product Name: Camera
Enter Product Price: 67890

Enter details for Product 2:
Enter Product ID: 222
Enter Product Name: Laptop
Enter Product Price: 89000

Enter details for Product 3:
Enter Product ID: 333
Enter Product Name: Mobile
Enter Product Price: 75000

Enter Product ID to search: 222

Product Found: Product [id=222, name=Laptop, price=89000.0]

Test case 2 :
-------------
Enter number of products: 3

Enter details for Product 1:
Enter Product ID: 111
Enter Product Name: Camera
Enter Product Price: 78908

Enter details for Product 2:
Enter Product ID: 222
Enter Product Name: Mobile
Enter Product Price: 56789

Enter details for Product 3:
Enter Product ID: 333
Enter Product Name: Laptop
Enter Product Price: 78908

Enter Product ID to search: 4

Product with ID 4 not found.
 */
package com.ak.custom_object;

import java.util.*;

public class ProductArrayDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of products: ");
		int size=Integer.parseInt(sc.nextLine());
		if(size<=0)
		{
			System.out.println("Invalid array size");
			System.exit(0);
		}
		Product product[]=new Product[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter details for Product :"+(i+1));
			System.out.print("Enter Product ID: ");
			int id=Integer.parseInt(sc.nextLine());
			System.out.print("Enter Product Name: ");
			String name= sc.nextLine();
			System.out.print("Enter Product Price: ");
			Double price=Double.parseDouble(sc.nextLine());
			product[i]=new Product(id, name, price);
		}
		System.out.print("Enter Product ID to Search :");
		int search=Integer.parseInt(sc.nextLine());
		sc.close();
		boolean isFound=false;
		for(Product p:product)
		{
			if(p.getId()==search)
			{
				isFound=true;
				System.out.println(p);
			}
		}
		if(!(isFound))
		{
			System.out.println("Product with ID "+search+" not found.");
		}
	}

}

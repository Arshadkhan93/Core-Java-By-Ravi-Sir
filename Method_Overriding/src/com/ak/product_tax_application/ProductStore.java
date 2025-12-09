package com.ak.product_tax_application;

public class ProductStore 
{

	public static void main(String[] args) 
	{
		IO.println("Select Product Type:");
		IO.println("1. Digital Product:");
		IO.println("2. Physical Product:");
		
		int choice=Integer.parseInt(IO.readln());
		switch(choice) 
		{
		case 1->
		{
			String name=IO.readln("Enter Digital Product Name:");
			double price=Double.parseDouble(IO.readln("Enter Digital Product Price:"));
			String category=IO.readln("Enter Product Category:");
			category= category.equals("null")?null:category;
			String licensekey=IO.readln("Enter Product License Key:");
			licensekey= licensekey.equals("null")?null:licensekey;
			DigitalProduct digitalproduct = new DigitalProduct(name, price, category, licensekey);
			double discount=Double.parseDouble(IO.readln("Enter the discount % on final bill"));
			IO.println(digitalproduct);
			digitalproduct.applyDiscount(discount);
			digitalproduct.calculateTax();
		}
		case 2->
		{
			String name=IO.readln("Enter Physical Product Name:");
			double price=Double.parseDouble(IO.readln("Enter Product Price:"));
			String category=IO.readln("Enter Product Category:");
			double shippingweight=Double.parseDouble(IO.readln("Enter Product weight :"));
			PhysicalProduct physicalproduct = new PhysicalProduct(name, price, category, shippingweight);
			double discount=Double.parseDouble(IO.readln("Enter the discount % on final bill"));
			IO.println(physicalproduct);
			physicalproduct.applyDiscount(discount);
			physicalproduct.calculateTax();
			IO.println("Shipping Cost RS :"+physicalproduct.calculateShippingCost());
		}
		default->IO.println("Invalid Choice");
		};
	}

}

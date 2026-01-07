package com.ak.array_compaire;
import module java.base;


/*
Q1)Create a record called Customer, which accepts id, name and bill as a component.

Create an ELC class CustomerComparator with main method.

Create a Customer array with dynamic size and dynamic array initialization using Scanner class. 

Sort the Customer object based on following criteria :

  a) By using Customer id
  b) By using Customer name
  c) By using Customer bill*/
public class CustomerComparator 
{

	public static void main(String[] args) 
	{
		Vector<Customer> customer = new Vector<Customer>();
		
		customer.add(new Customer(333,"scott",2000));
		customer.add(new Customer(444,"smith",2500));
		customer.add(new Customer(111,"raj",1000));
		customer.add(new Customer(222,"alen",1500));
		String choice=IO.readln("which basis you want to Sort (Id/Name/Bill): ");
		Comparator<Customer> byId =(c1,c2)->Integer.compare(c1.id(),c2.id());
		Comparator<Customer> byName =(c1,c2)->c1.name().compareTo(c2.name());
		Comparator<Customer> byBill =(c1,c2)->Double.compare(c1.bill(),c2.bill());
		switch(choice.toLowerCase()){
			case "id" -> Collections.sort(customer, byId);
			case "name" -> Collections.sort(customer, byName);
			case "bill" -> Collections.sort(customer, byBill);
			default->IO.println("Invalid Choice:");
			}
		
		for(Customer c:customer)
		{
			IO.println(c);
		}
		
		

	}

}

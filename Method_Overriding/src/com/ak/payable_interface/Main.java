package com.ak.payable_interface;

public class Main {

	public static void main(String[] args) 
	{
		Contractor contractor = new Contractor();
		Employee employee = new Employee();
		contractor.payable.pay(10000.0);
		employee.payable1.pay(8000);
	}

}

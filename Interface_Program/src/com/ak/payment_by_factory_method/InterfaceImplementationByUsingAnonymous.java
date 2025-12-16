package com.ak.payment_by_factory_method;

public class InterfaceImplementationByUsingAnonymous 
{

	public static void main(String[] args) 
	{
		PrinterDemo printerDemo = new PrinterDemo();
		Printer printer = printerDemo.getPrinter();
		printer.print();

	}

}

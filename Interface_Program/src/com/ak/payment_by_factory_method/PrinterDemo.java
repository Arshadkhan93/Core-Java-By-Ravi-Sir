package com.ak.payment_by_factory_method;

public class PrinterDemo 
{
	public Printer getPrinter()
	{
		return new Printer()
		{	@Override
			public void print()
			{			
				IO.println("Printer is Printing...");
			}
		};
	}

}

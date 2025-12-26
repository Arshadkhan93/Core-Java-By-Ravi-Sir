package com.ak.custome_exception;

public class CarUser 
{

	public static void main(String[] args) 
	{
		try
		{
			
			CarTest.stop("stop");
			CarTest.stop("start");
			CarTest.puncture("puncture");
			CarTest.puncture("move");
			CarTest.carHeat(60);
			CarTest.carHeat(40);
		}
		catch(CarStoppedException | CarPunctureException | CarHeatException e)
		{
			IO.println(e.getMessage());
		}

	}

}
class CarTest 
{
	public static void stop(String str) throws CarStoppedException
	{
		if(str.equals("stop"))
			throw new CarStoppedException("Car stopped for some reason.");
		else
			IO.println("Car not stalled.");
		
	}
	
	public static void puncture(String str) throws CarPunctureException
	{
		if(str.equals("puncture"))
			throw new CarPunctureException("Car is punctured.");
		else
			IO.println("Car not punctured.");
	}
	
	public static void carHeat(int n) throws CarHeatException
	{
		if(n>50)
			throw new CarHeatException("Car is heated more than 50 degrees Celsius.");
		else
			IO.println("Car temperature normal.");
		
	}

}


package com.ak.number_check;

import java.util.function.Predicate;

public class CarSelling 
{

	public static void main(String[] args) 
	{
		String brand=IO.readln("Enter the brand name of the Car :");
		Double price=Double.parseDouble(IO.readln("Enter the price of the Car :"));
		Integer mileage=Integer.parseInt(IO.readln("Enter the mileage of the Car :"));
		Car carObj = new Car(brand,price,mileage);
		Predicate<Car> isEligible= (car)->
		{
			if(car.price()<=500000 && car.mileage()>=20)
		        return true;
			else
				return false;
		};
		if(isEligible.test(carObj))
		IO.println(carObj.brand()+" is eligible for sale.");
		else
		IO.println(carObj.brand()+" is not eligible for sale.");

	}

}


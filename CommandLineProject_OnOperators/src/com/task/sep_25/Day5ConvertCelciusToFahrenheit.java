package com.task.sep_25;

public class Day5ConvertCelciusToFahrenheit {

	public static void main(String[] args) {
		double celcius = Double.parseDouble(args[0]);
		double fahrenheit = 9 * celcius/5 +32;
		System.out.println("Fahrenheit :"+fahrenheit);
	}

}

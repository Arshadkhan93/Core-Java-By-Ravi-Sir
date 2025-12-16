package com.ak.consumer_modifyvalue;
import java.util.function.*;
public class ValueModifier 
{

	public static void main(String[] args) 
	{
		Integer n = Integer.parseInt(IO.readln("Enter any Number:"));
		IO.println("Original value: "+n);
		Consumer<Integer> doubleValue = (num)->IO.println("After doubling the value: "+(num*2));
		Consumer<Integer> IncrementBy = (num)->IO.println("After incrementing the value by 3: "+(num+3));
		Consumer<Integer> squareValue =(num)->IO.println("After squaring the value: "+(num*num));
		
		modifyValue(n, doubleValue);
		modifyValue(n, IncrementBy);
		modifyValue(n, squareValue);

	}
	
	public static void modifyValue(Integer value,Consumer<Integer> consumer)
	{
		consumer.accept(value);
	}

}

package com.ak.number_check;

import java.util.function.Predicate;

public class CalculationLogic 
{

	public static void main(String[] args) 
	{
		Predicate<Integer> isEven=(n)->n%2==0;
		Predicate<Integer> isGreaterThanTen=(n)->n>10;
		Predicate<Integer> isPrime=(n)->
		{
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					return false;
				}
			}
			return true;
		};
		
		Integer num=Integer.parseInt(IO.readln("Enter Any Number to Check:"));
		IO.println(num+" is even :"+testPredicate(num, (n)->n%2==0));
		IO.println(num+" is Greater than 10 :"+testPredicate(num, (n)->n>10));
		IO.println(num+" is Prime :"+testPredicate(num, (n)->
		{
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					return false;
				}
			}
			return true;
		}));

	}
	
	public static boolean testPredicate(int num,Predicate<Integer> p)
	{
		return p.test(num);
	}

}

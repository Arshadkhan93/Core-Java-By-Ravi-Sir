package lab.day2_05_02_Logical;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 Q3) WAP to print all the Prime Numbers from an Integer Array.

    Integer[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    Output : Prime Numbers: [2, 3, 5, 7, 11] 
 */
public class PrimeNumber
{
	void main()
	{
		Integer[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		IO.println("ORG Array is "+Arrays.toString(numbers));
		
		List<Integer> primeNumbers = Stream.of(numbers).filter(n->prime(n)).toList();
		
		IO.println(primeNumbers);
		
		
	}
	public static  boolean prime(Integer num)
	{
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}

}

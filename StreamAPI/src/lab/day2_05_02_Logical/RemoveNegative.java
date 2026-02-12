package lab.day2_05_02_Logical;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 Q1) WAP to remove Negative Numbers from an Integer Array.

    Integer[] numbers = {-10, -5, 0, 5, 10, 15, -20};
   
    Output : Positive Numbers: [5, 10, 15]
 * */

public class RemoveNegative 
{

	void main()
	{
		Integer[] numbers = {-10, -5, 0, 5, 10, 15, -20};
		IO.println("Orignal Array Is :"+Arrays.toString(numbers));
		
		List<Integer> list = Stream.of(numbers).filter(n->n>=0).toList();
		
		IO.println("Positive Integers Are :"+list);
	}
}

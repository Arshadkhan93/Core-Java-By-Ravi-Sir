package lab.day2_05_02_Logical;

import java.util.Arrays;
import java.util.stream.Stream;

/*
 Q5) WAP to print all the unique numbers from the Array.

    Integer[] numbers = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 4};
    Output : Unique Numbers: [1, 2, 3, 4, 5, 6, 7, 8]

 * */
public class UniqueNumber {
	void main()
	{
		Integer[] numbers = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 4};
		IO.println("ORG Array is "+Arrays.toString(numbers));
		
		IO.println("Unique Numbers :");
		Stream.of(numbers).distinct().forEach(IO::println);
	}

}

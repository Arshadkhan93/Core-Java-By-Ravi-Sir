package lab.day2_05_02_Logical;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 Q7) WAP to convert Integer Array to String Representation

    Integer[] numbers = {10, 20, 30, 40, 50};
    Converted Strings: [Number: 10, Number: 20, Number: 30, Number: 40, Number: 50]
 
 */
public class IntegerToString 
{
	void main()
	{
		Integer[] numbers = {10, 20, 30, 40, 50};
		IO.println("ORG Array is "+Arrays.toString(numbers));
		
		List<String> list = Stream.of(numbers).map(num->"Number: "+num).toList();
		IO.println("Integer Array To String Array :"+list);
		
	}

}

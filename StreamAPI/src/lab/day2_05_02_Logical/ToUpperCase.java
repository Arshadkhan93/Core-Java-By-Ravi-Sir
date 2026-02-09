package lab.day2_05_02_Logical;

import java.util.Arrays;
import java.util.stream.Stream;

/*
 Q8) WAP to convert all the names of String array into uppercase 

    String[] names = {"Virat", "Sanju", "Rohit", "Bumrah"};

    Output : [VIRAT, SANJU, ROHIT, BUMRAH]
 
 */
public class ToUpperCase 
{
	void main()
	{
		String[] names = {"Virat", "Sanju", "Rohit", "Bumrah"};
		IO.println("ORG Array is "+Arrays.toString(names));
		
		IO.println("Names In UpperCase:");
		Stream.of(names).map(str->str.toUpperCase()).forEach(IO::println);

		
		
	}

}

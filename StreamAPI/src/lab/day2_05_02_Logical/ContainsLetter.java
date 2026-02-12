package lab.day2_05_02_Logical;

import java.util.Arrays;
import java.util.stream.Stream;

/*
 Q2) WAP to print all the names from String array which contains 
    letter 'a' in the name.

    String[] names = {"Rahul", "Raj", "Arnav", "Scott", "Smith"};
    Output : Names Containing 'A' or 'a' : [Rahul, Raj, Arnav] 
 */

public class ContainsLetter 
{

	void main()		
	{
		String[] names = {"Rahul", "Raj", "Arnav", "Scott", "Smith"};
		
		IO.println("ORG Array is "+Arrays.toString(names));
		
		Stream.of(names).filter(s->(s.contains("A") || s.contains("a"))).forEach(IO::println);
		
	}
}

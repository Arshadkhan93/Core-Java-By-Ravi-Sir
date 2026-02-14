package lab.day2_05_02_Logical;

import java.util.Arrays;
import java.util.stream.Stream;

/*
 Q4) WAP to print all the names from String array where the length of the 
    name must be greater than 3.

    String[] words = {"Raj", "Rohit", "Smirti", "Richa", "Sky"};
    Output : [Rohit, Smirti, Richa] 
 */
public class LengthGreater3 
{

	void main()
	{
		String[] words = {"Raj", "Rohit", "Smirti", "Richa", "Sky"};
		IO.println("ORG Array is "+Arrays.toString(words));
		IO.println("Words which contains more than 3 charecter");
		Stream.of(words).filter(str->str.length()>3).forEach(IO::println);
	}
}

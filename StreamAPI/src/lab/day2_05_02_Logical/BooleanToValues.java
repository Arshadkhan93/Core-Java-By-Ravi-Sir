package lab.day2_05_02_Logical;

import java.util.List;
import java.util.stream.Stream;

/*
 Q9) WAP to convert boolean value to "Yes" or "No"

    Boolean[] flags = {true, false, true, false, true};

    Yes/No Values: [Yes, No, Yes, No, Yes]
 * */
public class BooleanToValues 
{
	void main()
	{
		IO.println("Boolean[] flags = {true, false, true, false, true};");
		Boolean[] flags = {true, false, true, false, true};
		
		List<String> values = Stream.of(flags).map(bool->bool?"Yes":"No").toList();
		IO.println(values);
		
	}

}

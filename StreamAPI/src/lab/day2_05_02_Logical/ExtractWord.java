package lab.day2_05_02_Logical;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 Q10) WAP to extract First Letter of Each Word from String Array

      String []names = {"James", "Aryan", "Vibha", "Aniket"};

      First Letters: [J, A, V, A] 
 */
public class ExtractWord 
{
	void main()
	{
		String []names = {"James", "Aryan", "Vibha", "Aniket"};
		IO.println("ORG Array is "+Arrays.toString(names));
		
		List<Character> letters = Stream.of(names).map(str->str.charAt(0)).toList();
		IO.println(letters);
	}

}

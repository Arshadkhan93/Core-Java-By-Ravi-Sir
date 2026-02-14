package lab.day2_05_02_Logical;

import java.util.stream.Stream;

/*
 Q6) WAP to filter Palindrome Words from an Array.

String[] words = {"madam", "hello", "racecar", "java", "level", "world"};

Output : Palindrome Words: [madam, racecar, level]
 * */

public class PalindromeWords 
{
void main()
{
	String[] words = {"madam", "hello", "racecar", "java", "level", "world"};
	
	Stream.of(words).filter(str->palindrome(str)).forEach(IO::println);
	
	
}
static boolean palindrome(String word)
{
	for(int i=0;i<word.length()/2;i++)
	{
		if(word.charAt(i)!=word.charAt(word.length()-i-1))
			return false;
	}
	return true;
}
}

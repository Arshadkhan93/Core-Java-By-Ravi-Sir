package lab.day4_10_02_grouping;

import java.util.Arrays;
import java.util.List;

/*Ques - 3
-------------------
Sorting:
Write a program to sort a list of strings in descending order using Java 8 streams.
Input:
List<String> strings = ["apple", "banana", "orange", "grape", "pear"];
Expected Output:
Sorted Strings in Descending Order:
pear
orange
grape
banana
apple*/
public class SortStringsDescending 
{
	void main()
	{
		List<String> str = Arrays.asList("apple", "banana", "orange", "grape", "pear");
		
		List<String> list = str.stream().sorted((s1,s2)->s2.compareTo(s1)).toList();
		
		list.forEach(IO::println);
		
	}

}

package lab.day4_10_02_grouping;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupingByCounting 
{
	void main()
	{
		List<String> str = Arrays.asList("apple", "banana", "orange", "grape", "pear");
		Map<Integer, Long> map = str.stream().collect(Collectors.groupingBy(String::length,Collectors.counting()));
		map.forEach((len,count)->IO.println(len+" :-> "+count));
	}

}

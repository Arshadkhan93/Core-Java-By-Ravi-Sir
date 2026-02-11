package lab.day4_10_02_grouping;

import java.util.Arrays;
import java.util.List;

public class SquareOfEven 
{
	void main()
	{
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		numbers.stream().filter(n->n%2!=0).map(n->n*n).forEach(IO::println);
	}

}

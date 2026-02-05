package lab.day1_04_02_assignment;

import java.util.Arrays;
import java.util.Comparator;


public class ReverseArrayByStream 
{
	void main()
	{
		int arr[]= new int[]{1,2,3,4,5,6,7,8,9};
		
		 Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).forEach(IO::println);
		
	}

}

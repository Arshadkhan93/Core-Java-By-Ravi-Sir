package lab.day3_09_02_list_sort;

import java.util.Iterator;
import java.util.List;

public class FirstCharUpper 
{
	void main()
	{
		List<String> list = List.of("abcd" , "efgh" , "jklm" , "xyz");
		list.stream().map(str->str.substring(0, 1).toUpperCase()+ str.substring(1)).forEach(System.out::println);
		
	}

}

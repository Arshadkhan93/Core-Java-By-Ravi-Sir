package lab.day3_09_02_list_sort;

import java.util.List;

public class StringToUppercase
{
	void main()
	{
		List<String> list = List.of("abcd" , "efgh" , "jklm" , "xyz");
		
		IO.println("\nIn Upper Case:\n");
		list = list.stream().map((s1)->s1.toUpperCase()).toList();
		list.forEach(IO::println);
		IO.println("\nIn lower Case:\n");
		list = list.stream().map((s1)->s1.toLowerCase()).toList();
		list.forEach(IO::println);
	}

}

package lab.day3_09_02_list_sort;

import java.util.ArrayList;
import java.util.List;

public class List_Person 
{
	void main()
	{
		List<Person> list = new ArrayList<>();
		list.add(new Person(1, "raj"));
		list.add(new Person(4, "alen"));
		list.add(new Person(3, "rahul"));
		list.add(new Person(2, "smith"));
		
		list.stream().sorted((p1,p2)->p1.id().compareTo(p2.id())).forEach(IO::println);
		
	}
}

record Person(Integer id, String name)
{
	
}
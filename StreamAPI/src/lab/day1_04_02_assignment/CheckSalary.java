package lab.day1_04_02_assignment;

import java.util.ArrayList;

record Employee(Integer id, String name, Double salary) 
{

}

public class CheckSalary
{
	

	void main()
	{
		ArrayList<Employee> listOfEmp = new ArrayList<>();
		listOfEmp.add(new Employee(1, "alen", 70000D));
		listOfEmp.add(new Employee(2, "smith", 90000D));
		listOfEmp.add(new Employee(3, "blake", 60000D));
		listOfEmp.add(new Employee(4, "king", 70000D));
		listOfEmp.add(new Employee(5, "raj", 40000D));
		listOfEmp.add(new Employee(6, "rahul", 50000D));
		
		listOfEmp.stream().filter(list->list.salary()>50000).map(list->list.name().toUpperCase()).forEach(IO::println);
	}
	
}
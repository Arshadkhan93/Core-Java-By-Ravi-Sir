package com.ak.employee_directory;
import module java.base;

public class Directory 
{

	ArrayList<Employee> listOfEmp = new ArrayList<>();
	
	public void addEmployee()
	{
		String name = IO.readln("Enter Emp name:");
		String position = IO.readln("Enter Position Of Emp ");
		double salary = Double.parseDouble(IO.readln("Enter Salary Of Emp"));
		listOfEmp.add(new Employee(name, position, salary));		
	}
	
	public void displayAllEmployees()
	{
		Iterator<Employee> itr = listOfEmp.iterator();
		while(itr.hasNext())
		{
			IO.println(itr.next());
		}
	}
	
	public void updateEmployee(int index)
	{
		Employee employee = listOfEmp.get(index);
		String position = IO.readln("Enter new Position");
		employee.setPosition(position);
	}
	
	public void deleteEmployee(int index)
	{
		Employee employee = listOfEmp.get(index);
		listOfEmp.remove(employee);
	}
}

package com.ak.employee_directory;
import module java.base;

public class Directory 
{

	ArrayList<Employee> listOfEmp ;
	
	public Directory() 
	{
		listOfEmp = new ArrayList<>();
	}
	
	public void addEmployee(Employee emp)
	{
		listOfEmp.add(emp);
		 System.out.println(emp.getName() + " added to directory.");
	}
	
	public void displayAllEmployees()
	{
		if(listOfEmp.isEmpty())
		{
			IO.println("The List Is Empty!!");
			return;
		}
		IO.println("Emplpoyee Details:");
		for(int i=0;i<listOfEmp.size();i++)
		{
			IO.println((i+1)+" . "+listOfEmp.get(i));
		}
	}
	
	public void updateEmployee(int index,String newPosition,double newSalary)
	{
		if(index<0 || index>listOfEmp.size())
		{
			IO.println("Invalid index. Cannot update employee.");
			return;
		}
		Employee emp = listOfEmp.get(index);
		emp.setPosition(newPosition);
		emp.setSalary(newSalary);
		IO.println(emp.getName()+"'s updated.");
	}
	
	public void deleteEmployee(int index)
	{
		if(index <0 || index>listOfEmp.size())
		{
			IO.println("Invalid Index. Connot delete employee");
			return;
		}
		Employee removed = listOfEmp.remove(index);
		IO.println(removed.getName()+" Removed from directory.");
	}
}

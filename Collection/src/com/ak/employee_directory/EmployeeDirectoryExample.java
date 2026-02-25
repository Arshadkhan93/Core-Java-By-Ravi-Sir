package com.ak.employee_directory;

public class EmployeeDirectoryExample 
{

	public static void main(String[] args) 
	{
		Directory directory = new Directory();
		 
		Employee alice = new Employee("Alice", "Developer", 60000);
        Employee bob = new Employee("Bob", "Designer", 55000);

        directory.addEmployee(alice);
        directory.addEmployee(bob);

     // Display all employees
        directory.displayAllEmployees();

        // Update Bob's information
        directory.updateEmployee(1, "Senior Designer", 65000);

        // Delete Alice
        directory.deleteEmployee(0);
        
        directory.displayAllEmployees();
	}

}

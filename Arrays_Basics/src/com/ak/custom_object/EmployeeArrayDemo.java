package com.ak.custom_object;

import java.util.*;

public class EmployeeArrayDemo {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Array Size: ");
		int size=Integer.parseInt(sc.nextLine());
		if(size<=0)
		{
			System.out.println("Invalid Size:");
			System.exit(0);
		}
		Employee emp[]=new Employee[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter Details For Employee "+(i+1));
			System.out.print("Enter ID :");
			int id=Integer.parseInt(sc.nextLine());
			System.out.print("Enter Name :");
			String name=sc.nextLine();
			System.out.print("Enter Salary :");
			double salary=Double.parseDouble(sc.nextLine());
			Employee e=new Employee(id, name, salary);
			emp[i]=e;
			
		}
		sc.close();
		for(Employee e:emp)
		{
			System.out.println(e);
		}
		
	}

}

package com.ak.functional_discount;
import module java.base;
public class StudentNotification 
{

	public static void main(String[] args) 
	{
		Consumer<Student> message = (stu)->IO.println(stu);
		
		int num = Integer.parseInt(IO.readln("Enter Number of Students :"));
		
		for(int i=1;i<=num;i++)
		{
			IO.println("\nEnter details for Student :"+i);
			Integer id = Integer.valueOf(IO.readln("Enter ID :"));
			String name = IO.readln("Enter Name :");
			String course = IO.readln("Enter Course :");
			
			Student student = new Student(id,name,course);
			message.accept(student);
			
		}

	}

}

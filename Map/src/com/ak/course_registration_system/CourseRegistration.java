package com.ak.course_registration_system;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.Map;

public class CourseRegistration 
{

	public static void main(String[] args) 
	{
		HashMap<String,List<String> > hm = new HashMap<>();
		try
		{
		while(true)
		{
			IO.println("--- Course Registration Menu ---\r\n"
					+ "1. Register student to course\r\n"
					+ "2. View course-wise student list\r\n"
					+ "3. Remove student from course\r\n"
					+ "4. Exit");
			int choice = Integer.parseInt(IO.readln("Enter Your Choice :"));
			
			switch(choice)
			{
			case 1->
			{
				String courseName = IO.readln("Enter course name: ");
				String studentName = IO.readln("Enter student name: ");
				hm.computeIfAbsent(courseName, key->new ArrayList<String>()).add(studentName);
				IO.println(studentName +" Registered to "+courseName);
			}
			case 2->
			{
				for(Map.Entry<String,List<String>> entry : hm.entrySet())
				{
					//hm.forEach((entry.getKey(),entry.getValue())->IO.println(entry));
					IO.println(entry.getKey()+" -> "+entry.getValue());
				}
			}
			case 3->
			{
				String courseName = IO.readln("Enter course name: ");
				String studentName = IO.readln("Enter student name to remove: ");
				
				hm.computeIfPresent(courseName, (k,v)->
				{
					if(v.remove(studentName))
						IO.println(studentName+": has Removed From "+k);
					return v;
				});
				
				
//				for(Map.Entry<String, List<String>> entry : hm.entrySet())
//				{
//					if(entry.getKey().equals(courseName))
//					{
//						Iterator<String> list = entry.getValue().iterator();
//						while(list.hasNext())
//						{
//							if(list.next().equals(studentName))
//								list.remove();
//							
//						}
//					}
//				}
				
			}
			case 4->IO.println("Exiting Course Registration System.");
			
			default->IO.println("Invalid Choice!!!!");
			}
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}

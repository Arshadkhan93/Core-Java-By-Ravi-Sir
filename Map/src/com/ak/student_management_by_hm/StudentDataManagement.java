package com.ak.student_management_by_hm;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StudentDataManagement 
{

	public static void main(String[] args) 
	{
		HashMap<String, Integer> student = new HashMap<>();
		
		while(true)
		{
			IO.println("------ Student Management Menu ------\r\n"
					+ "1. Add Student\r\n"
					+ "2. Update Marks\r\n"
					+ "3. Delete Student\r\n"
					+ "4. Search Student\r\n"
					+ "5. Display All Students\r\n"
					+ "6. Show Topper\r\n"
					+ "7. Show Lowest Scorer\r\n"
					+ "8. Show Total and Average Marks\r\n"
					+ "9. Exit");
			
			int choice = Integer.parseInt(IO.readln("Enter Your Choice: "));
			
			switch(choice)
			{
				case 1->
				{
					String name = IO.readln("Enter student name: ");
					Integer marks= Integer.parseInt("Enter student Marks: ");
					student.put(name, marks);
					IO.println("Student added successfully!");
				}
				case 2->
				{
					String name = IO.readln("Enter student name to update the marks : ");
					Integer marks = Integer.parseInt(IO.readln("Enter new marks: "));
					if(student.containsKey(name))
						student.put(name, marks);
					IO.println("Marks Updated!!");
				}
				case 3->
				{
					String name = IO.readln("Enter student name to delete: ");
					if(student.containsKey(name))
						student.remove(name);
					else
						IO.println("Student Not Found!!!");
				}
				case 4->
				{
					String name = IO.readln("Enter student name to search: ");
					if(student.containsKey(name))
						IO.println(name+" Scored "+student.get(name));
					else
						IO.println("Student Not Found!!!");
				}
				case 5->
				{
					IO.println("---- Student Records ----");
					for(Entry<String, Integer> entry: student.entrySet())
					{
						
						IO.println(entry.getKey()+" => "+entry.getValue());
					}
					//student.forEach((k,v)->IO.println(k+" => "+v));
				}
				case 6->
				{
					int max= Collections.max(student.values());
					for(Map.Entry<String, Integer> entry : student.entrySet())
					{
						if(max == entry.getValue())
							IO.println("Topper: "+entry.getKey()+" => "+entry.getValue());
							
					}
					
				}
				case 7->
				{
					int min= Collections.min(student.values());
					for(Map.Entry<String, Integer> entry : student.entrySet())
					{
						if(min == entry.getValue())
							IO.println("Lowest Scorer: "+entry.getKey()+" => "+entry.getValue());
							
					}
				}
				
				default->IO.println("Invalid Choice!!!");
			}
		}

	}

}

package com.ak.weakhashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/*
 Assignment 01 :
--------------
Write a program to show that WeakHashMap keys are weak in comparison to HashMap,
 if key is a reference key and it's value is set to be null.

Assignment 02 :
--------------
Write a program to show the internal working of IdentityHashMap in comparison
 to HashMap.

Assignment 03:
--------------
Create a Java program that uses a PriorityQueue to manage a collection of 
strings. 
You need to implement the following functionality:

Initialize a PriorityQueue that stores strings.
Add five different colors ("Red", "Green", "Orange", "White", "Black") to 
the queue.
Print all elements of the priority queue. 
 */

record Employee(Integer id,String name)
{
	
}
public class WeakHashMapDemo 
{

	void main()
	{
		Employee e1 = new Employee(1, "Raj");
		Employee e2 = new Employee(2, "raju");
		
		Map<Employee, String> map1= new HashMap<>();
		Map<Employee, String> map2= new WeakHashMap<>();
		
		map1.put(e1, "HashMap");
		map2.put(e2, "WeakHashMap");
		IO.println("Before GC");
		IO.println(map1);
		IO.println(map2);
		
		e1=null;
		e2=null;
		
		System.gc();
		IO.println("After GC");
		IO.println(map1);
		IO.println(map2);
	}
}

package com.ak.collection_retrieval;
import module java.base;
import java.util.ListIterator;
public class PossibleWaysToRetrieveCollectionObject 
{
	void main()
	{
		Vector<String> listOfCity = new Vector<>();
		listOfCity.add("Hyderabad");
		listOfCity.add("Kolkata");
		listOfCity.add("Pune");
		listOfCity.add("Indore");
		listOfCity.add("Mumbai");
		
		IO.println("\n1) By using toString() method:");
		IO.println(listOfCity.toString());
		
		IO.println("\n2) By using Ordinary for loop:");
		for(int i=0; i<listOfCity.size();i++)
		{
			IO.println(listOfCity.get(i));
		}
		
		IO.println("\n3) By using for-each loop:");
		for(String city:listOfCity)
		{
			IO.println(city);
		}
		
		IO.println("\n4) By using Enumeration interface :");
		Enumeration<String> elements=listOfCity.elements();
		
		while(elements.hasMoreElements())
		{
			IO.println(elements.nextElement());
		}
		
		IO.println("\n5) By using Iterator interface :");
		Iterator<String> iterator = listOfCity.iterator();
		
		while(iterator.hasNext())
		{
			IO.println(iterator.next());
		}
		IO.println();
		iterator.forEachRemaining(str->IO.println(str));
		
		IO.println("\n6) By using ListIterator interface:");
		ListIterator<String> listItr = listOfCity.listIterator();
		
		IO.println("IN FORWARD DIRECTION");
		while(listItr.hasNext())
		{
			IO.println(listItr.next());
		}
		
		IO.println("IN BACKWARD DIRECTION");
		while(listItr.hasPrevious())
		{
			IO.println(listItr.previous());
		}
		
		IO.println("\n7) By using Spliterator interface:");
		
		Spliterator<String> spliterator=listOfCity.spliterator();
		spliterator.forEachRemaining(str->IO.println(str));
		
		IO.println("\n8) By using forEach() :");
		listOfCity.forEach(city->IO.println(city));
		
		IO.println("\n9) By Method Reference :");
		listOfCity.forEach(System.out::println);
		
		IO.println("\n10) By using Stream() method:");
		listOfCity.stream().forEach(System.out::println);
		
		IO.println("\n11) By using parallelStream() method:");
		listOfCity.parallelStream().forEach(System.out::println);
	}

}

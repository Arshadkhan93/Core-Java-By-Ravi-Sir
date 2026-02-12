package lab.day4_10_02_grouping;
/*Ques - 4
----------------
Person Class(BLC): Represents a Person with name, age, and gender properties.
Create a ELC class Tester :
List of Persons: An ArrayList of Person objects is created with different genders(Male/Female).
Group all the Male and Female separately into a Map where Gender is the key .
Use forEach over the entries in the Map and prints each gender group along with the list of persons belonging to that gender.

Male:
Person{name= Bob, age=30, gender=Male}
Person{name= Charlie , age=20, gender=Male}
Person{name=David, age=35, gender=Male}
Person{name=Frank, age=22, gender='Male}

Female:
Person{name=Alice, age=25, gender=Female}
Person{name=Eve, age=28, gender=Female}
Person{name=Grace, age=26, gender=Female}*/

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PersonTester 
{
	void main()
	{
		List<Person> persons = new ArrayList<>();

        persons.add(new Person("Alice", 25, "Female"));
        persons.add(new Person("Bob", 30, "Male"));
        persons.add(new Person("Charlie", 20, "Male"));
        persons.add(new Person("David", 35, "Male"));
        persons.add(new Person("Eve", 28, "Female"));
        persons.add(new Person("Frank", 22, "Male"));
        persons.add(new Person("Grace", 26, "Female"));
        
        Map<String, List<Person>> map = persons.stream().collect(Collectors.groupingBy(Person::gender));
        map.forEach((k,v)->IO.println(k+" : "+v));
	}

}

record Person(String name,Integer age, String gender)
{
	
}

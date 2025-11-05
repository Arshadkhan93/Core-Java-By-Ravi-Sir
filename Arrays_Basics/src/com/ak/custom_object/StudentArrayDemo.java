/*
 * Assignment 01 :
---------------
Develop an array for Custom class object.

Coding requirement :
--------------------
Create a BLC class called Student.

Attributes/Properties/Fields [tightly encapsulated]

id, name and marks

Take a parameetrized constructor to initialize all the fields.

Generate toString() method.

Take an ELC class called StudentArrayDemo with main method.

Create Student array with size 3 manually.

Assign Student objects to array elements using index manually.

Take a forEach() loop to retrieve and pring array data.

Sample Output :
----------------
Student [id=101, name=Ravi, marks=89.5]
Student [id=102, name=Anita, marks=92.0]
Student [id=103, name=Kiran, marks=85.75]

 */
package com.ak.custom_object;

public class StudentArrayDemo {

	public static void main(String[] args) 
	{
		Student student[]=new Student[3];
		Student s1= new Student(101,"Raj", 98);
		Student s2= new Student(102,"Ram", 85);
		Student s3= new Student(103,"Rahul", 70);
		student[0]=s1;
		student[1]=s2;
		student[2]=s3;
		for(Student s:student)
		{
			System.out.println(s);
		}
		
	}

}

package com.ak.library;
import module java.base;
public class LibraryManagement 
{
	
	void main()
	{
		Vector<Book> listOfBooks = new Vector<>(10,5);
		 listOfBooks.add(new Book(101,"Core Java","Mr James"));
		 listOfBooks.add(new Book(102,"Adv Java","Mr Robert"));
		 listOfBooks.add(new Book(103,"Head First Java","Miss Kathy Sierra"));
		 listOfBooks.add(new Book(104,"Programming in C","Mr Denis"));
		 
		 while(true)
		 {
			 IO.println("\nSelect from The Menu:");
			 IO.println("1) Display Books Available in the Library :\r\n"
					 + "2) Search a Book in the Library :\r\n"
					 + "3) Issue a Book from the Library :\r\n"
					 + "4) Exit from the application :");
			 int choice=Integer.parseInt(IO.readln());
			 Library library = new Library();
			 switch(choice) 
			 {
			 case 1->{
				 library.displayAvailableBooks(listOfBooks);
			 }
			 case 2->{
				 String search=IO.readln("Enter keyword to search by title or author: ");
				 library.searchBook(listOfBooks, search);
			 }
			 case 3->{
				 Integer id = Integer.parseInt(IO.readln("Enter Book id which for Book issue :"));
				 library.issueBook(listOfBooks, id);
			 }
			 case 4->{
				 IO.println("Thank you for Visiting..");
			 }
			 		default->IO.println("Invalid");
			 };
		 }
	}
}

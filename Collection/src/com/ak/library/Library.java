package com.ak.library;
import module java.base;

public class Library 
{
	public void displayAvailableBooks(Vector<Book> books)
	{
		for(Book book: books)
		{
			IO.println(book);
		}
	}
	
	public void issueBook(Vector<Book> books,Integer id)
	{
		boolean isFound=false;
		for(Book book:books)
		{
			if(book.id()==id)
			{
				isFound=true;
				IO.println("Issued :"+book);
				books.remove(book);
				break;
			}
		}
		if(!isFound)
		IO.println("Book with ID "+id+" not found.");
	}
	
	public void searchBook(Vector<Book> books,String search)
	{
		for(Book book:books)
		{
			if(book.author().equalsIgnoreCase(search) || book.title().equalsIgnoreCase(search))
			{
				IO.println(book);
			}
		}
	}

}

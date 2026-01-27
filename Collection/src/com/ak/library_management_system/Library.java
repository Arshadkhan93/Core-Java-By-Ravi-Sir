package com.ak.library_management_system;
import module java.base;
public class Library 
{
	private ArrayList<Book> books
	= new ArrayList<>();
	
	public Library() 
	{
		
	}
	
	public void addBook(Book book)
	{
		//books.add(book);
		//boolean isAvailable=false;
		if(books==null || searchBookByISBN(book.getIsbn())==null)
			books.add(book);
		else
			IO.println("Book with the same ISBN "+book.getIsbn()+" already exists.");
//		for(Book b: books)
//		{
//			if(b.getIsbn()==book.getIsbn())
//			{
//				isAvailable=true;
//			}
//		}
//		if(!isAvailable)
//		books.add(book);
//		else
//			IO.println("Book with the same ISBN "+book.getIsbn()+" already exists.");
//		
	}
	
	private Book searchBookByISBN(long isbn)
	{
		for(Book book:books)
		{
			if(book.getIsbn()==isbn)
				return book;
		}
		return null;
	}
	
	public void displayAllBooks()
	{
		for(Book book: books)
		{
			IO.println(book.displayBook());
		}
	}
	
	public void updateBookQuantityByISBN(long isbn)
	{
		boolean isFound=false;
		for(Book book: books)
		{
			if(book.getIsbn()==isbn)
			{
				isFound=true;
				IO.println("Updating quantity of book : ");
				int newQuantity = Integer.parseInt(IO.readln("Enter new Quantity: "));
				if(newQuantity>0) {
				book.setQuantity(newQuantity);
				IO.println("Quantity updated successfully.new quantity = "+newQuantity);
				}
				else
					IO.println("Quantity cannot be Negative");
			}
		}
		if(!isFound)
			IO.println("Book with ISBN "+isbn+" not found.");
	}
	
	public void deleteBookByTitle(String title)
	{
		if(title.isEmpty() || title==null)
		{
			IO.println("Book Title cannot be blank");
			System.exit(0);
		}
		for(Book book: books)
		{
			if(book.getTitle().equals(title))
			{
				if(books.remove(book))
				{
					IO.println(title+" book has removed successfully...");
					break;
				}
			}
		}
	}
}

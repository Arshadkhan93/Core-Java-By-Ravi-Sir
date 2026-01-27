package com.ak.library_management_system;

public class BookLibrary 
{

	public static void main(String[] args) 
	{
		Library library = new Library();
		while(true)
		{
			
			//library.addBook(new Book("java", "james", 124, 700, 4));
			IO.println("1. Add Book\r\n"
					+ "2. Display Books\r\n"
					+ "3. Update Quantity\r\n"
					+ "4. Delete Book\r\n"
					+ "5. Exit");
			int choice = Integer.parseInt(IO.readln());
			switch(choice)
			{
			case 1->
			{
				String title=IO.readln("Enter Title: ");
				String author=IO.readln("Enter Author: ");
				long isbn=Long.parseLong(IO.readln("Enter ISBN: "));
				double price=Double.parseDouble(IO.readln("Enter Price: "));
				int quantity=Integer.parseInt(IO.readln("Enter Quntity: "));
				library.addBook(new Book(title, author, isbn, price, quantity));
			}
			case 2->
			{
				library.displayAllBooks();
			}
			case 3->
			{
				long isbn=Long.parseLong(IO.readln("Enter ISBN: "));
				library.updateBookQuantityByISBN(isbn);
			}
			case 4->
			{
				String title = IO.readln("Enter Book Title :");
				library.deleteBookByTitle(title);
			}
			case 5->
			{
				IO.println("Exiting from the Application. Thank you!!!");
				System.exit(0);;
			}
			default->IO.println("Invalid choice");
			};
		}

	}

}

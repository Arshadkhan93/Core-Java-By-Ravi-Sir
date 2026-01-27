package com.ak.library_management_system;

public class Book 
{
	private String title; 
	private String author;
	private long isbn;
	private double price;
	private int quantity;
	public Book(String title, String author, long isbn, double price, int quantity) 
	{
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.price = price;
		this.quantity = quantity;
	}
	public String getTitle() 
	{
		return title;
	}
	
	public String getAuthor() 
	{
		return author;
	}
	
	public long getIsbn() 
	{
		return isbn;
	}
	
	public double getPrice() 
	{
		return price;
	}
	
	public int getQuantity() 
	{
		return quantity;
	}
	
	public void setTitle(String title) 
	{
		this.title = title;
	}
	
	public void setAuthor(String author) 
	{
		this.author = author;
	}
	
	public void setIsbn(long isbn) 
	{
		this.isbn = isbn;
	}
	
	public void setPrice(double price) 
	{
		this.price = price;
	}
	
	public void setQuantity(int quantity) 
	{
		this.quantity = quantity;
	}
	
	public String displayBook() {
		return "Book (title=" + title + ", author=" + author + ", isbn=" + isbn + ", price=" + price + ", quantity="
				+ quantity + ")";
	}
	
	
	
	

}

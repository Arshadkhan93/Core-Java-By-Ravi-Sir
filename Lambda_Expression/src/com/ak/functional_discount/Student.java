package com.ak.functional_discount;

public record Student(Integer id, String name,String course) 
{
	@Override
	public String toString()
	{
		return "Hello "+this.name+"! Welcome to the "+this.course+" course.";
	}
}

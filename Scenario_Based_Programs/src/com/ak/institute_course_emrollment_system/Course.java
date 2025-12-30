package com.ak.institute_course_emrollment_system;

public record Course(Integer id, String name,Double fee)
{

	@Override
	public String toString()
	{
		return id+" : "+name+" : "+fee;
	}
}

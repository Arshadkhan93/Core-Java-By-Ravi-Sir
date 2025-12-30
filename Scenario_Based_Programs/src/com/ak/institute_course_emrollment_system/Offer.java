package com.ak.institute_course_emrollment_system;

public record Offer(String offerText) 
{
	@Override
	public String toString()
	{
		return offerText;
	}

}

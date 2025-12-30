package com.ak.institute_course_emrollment_system;

public record Student(String name,EducationInstitute institute) 
{

	public void viewCoursesAndFees()
	{
		for(Course c: institute.courses())
		{
			IO.println(c);
		}
	}
	
	public void viewOffers()
	{
		for(Offer o:institute.offers())
		{
			IO.println(o);
		}
	}
	
	public void enrollInCourse(Integer courseId)
	{
		boolean isValid=false;
		for(Course c: institute.courses())
		{
			if(courseId==c.id())
			{
				isValid=true;
				institute.enrollStudentInCourse(courseId, name);
			}
		}
		if(!isValid)
			System.err.println("Course with ID "+courseId+" not found.");
	}
	
}

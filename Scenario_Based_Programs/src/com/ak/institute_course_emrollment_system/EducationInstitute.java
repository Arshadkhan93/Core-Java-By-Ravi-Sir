package com.ak.institute_course_emrollment_system;

import java.util.Vector;

public record EducationInstitute(Vector<Course> courses,Vector<Offer> offers) 
{

	

	public void enrollStudentInCourse(int courseId, String studentName)
	{
		for(Course c: courses)
		{
			if(courseId == c.id())
			{
				IO.println(studentName+" enrolled in: "+c.name());
			}
		}
	}
}

package com.ak.institute_course_emrollment_system;

import java.util.Vector;

public class StudentEnrollmentProcess 
{

	public static void main(String[] args) 
	{
		Vector<Course> courses= new Vector<>();
		//Course course[] = new Course[3];
		courses.add(new Course(1, "java", 35000.0));
		courses.add(new Course(2, ".Net", 30000.0));
		courses.add( new Course(3, "Python", 32000.0));
		Vector<Offer> offers = new Vector<>();				
		//Offer offer[] = new Offer[2];
		offers.add(new Offer("Special discount: Get 20% off on all courses!"));
		offers.add(new Offer("Limited time offer: Enroll in any two courses and get one course free!"));
		String name = IO.readln("Enter Student Name:");
		EducationInstitute institute = new EducationInstitute(courses, offers);
		Student student = new Student(name, institute);
		student.viewCoursesAndFees();
		student.viewOffers();
		Integer id= Integer.parseInt(IO.readln("Enter course ID to enroll: "));
		student.enrollInCourse(id);
		
		

	}

}

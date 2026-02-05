package lab.day1_04_02_assignment;

import java.util.ArrayList;

public class StudentPassCheck 
{
	void main()
	{
		ArrayList<Student> listOfStudent = new ArrayList<>();
		listOfStudent.add(new Student("raj", 86, "pass"));
		listOfStudent.add(new Student("smith", 44, "Fail"));
		listOfStudent.add(new Student("rahul", 77, "pass"));
		listOfStudent.add(new Student("alen", 55, "Fail"));
		listOfStudent.add(new Student("blake",60, "Fail"));
		listOfStudent.add(new Student("king", 89, "pass"));
		
		listOfStudent.stream().filter(s->s.score()>75).forEach(s->IO.println(s.name()));
	}

}

record Student(String name, double score, String status)
{
	
}
package com.ak.blc;

public class Student {
	public static String calculateGrade(double marks) {
		return marks>=90?  "A+"
				:marks>=75?  "A"
						:marks>=60? "B"
							:marks>=40? "C": "Fail";
		
		
	}

}

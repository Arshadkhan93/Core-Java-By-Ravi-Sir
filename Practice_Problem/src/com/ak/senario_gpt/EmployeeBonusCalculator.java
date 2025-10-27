package com.ak.senario_gpt;

public class EmployeeBonusCalculator {

	public static void main(String[] args) {
		Employee raj = new Employee("smith", 40000,9);
		EmployeeBonus bonus= CalculateEmployeeBonus.calculateBonus(raj);
		System.out.println(bonus);
		
		

	}

}

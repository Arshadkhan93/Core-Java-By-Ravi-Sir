package com.ak.senario_gpt;

public class CalculateEmployeeBonus {

    public static EmployeeBonus calculateBonus(Employee employee) {
        int exp = employee.getExperience();
        double salary = employee.getSalary();
        int bonusPercent;

        if (exp > 10) {
            bonusPercent = 20;
        } else if (exp >= 6) {
            bonusPercent = 10;
        } else if (exp >= 3) {
            bonusPercent = 5;
        } else {
            bonusPercent = 2;
        }

        double bonusAmount = salary * bonusPercent / 100;

        return new EmployeeBonus(employee, bonusAmount);
    }
}


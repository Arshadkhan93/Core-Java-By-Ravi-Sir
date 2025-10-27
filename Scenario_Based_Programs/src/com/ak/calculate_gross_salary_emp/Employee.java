package com.ak.calculate_gross_salary_emp;

public class Employee 
{
	private int employeeId;
	private String employeeName;
	private double basicSalary;
	private double HRaPer;
	private double DAPer;
	public Employee(int employeeId, String employeeName, double basicSalary, double hRaPer, double dAPer) 
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		HRaPer = hRaPer;
		DAPer = dAPer;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public double getHRaPer() {
		return HRaPer;
	}

	public double getDAPer() {
		return DAPer;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public void setHRaPer(double hRaPer) {
		HRaPer = hRaPer;
	}

	public void setDAPer(double dAPer) {
		DAPer = dAPer;
	}

	public double calculateGrossSalary() 
	{
		return (basicSalary+HRaPer+DAPer);
	}
}

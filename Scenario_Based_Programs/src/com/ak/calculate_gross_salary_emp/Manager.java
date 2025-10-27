package com.ak.calculate_gross_salary_emp;

public class Manager 
{
	private int managerId;
	private String managerName;
	private double basicSalary;
	private double HRaPer;
	private double DAPer;
	private double projectAllowance;
	
	
	public Manager(int managerId, String managerName, double basicSalary, double hRaPer, double dAPer,
			double projectAllowance) {
		super();
		this.managerId = managerId;
		this.managerName = managerName;
		this.basicSalary = basicSalary;
		HRaPer = hRaPer;
		DAPer = dAPer;
		this.projectAllowance = projectAllowance;
	}

	

	public int getManagerId() {
		return managerId;
	}



	public String getManagerName() {
		return managerName;
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



	public double getProjectAllowance() {
		return projectAllowance;
	}



	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}



	public void setManagerName(String managerName) {
		this.managerName = managerName;
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



	public void setProjectAllowance(double projectAllowance) {
		this.projectAllowance = projectAllowance;
	}



	public double calculateGrossSalary()
	{
		return (basicSalary+HRaPer+DAPer+projectAllowance);
	}
}

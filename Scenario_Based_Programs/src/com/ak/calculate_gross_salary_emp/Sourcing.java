package com.ak.calculate_gross_salary_emp;

public class Sourcing 
{
	private int sourceId;
	private String sourceName;
	private double basicSalary;
	private double DAPer;
	private double HRAPer;
	private int enrollmentTarget;
	private int enrollmentReached;
	private double perkPerEnrollment;
	
	
	
	public int getSourceId() {
		return sourceId;
	}



	public String getSourceName() {
		return sourceName;
	}



	public double getBasicSalary() {
		return basicSalary;
	}



	public double getDAPer() {
		return DAPer;
	}



	public double getHRAPer() {
		return HRAPer;
	}



	public int getEnrollmentTarget() {
		return enrollmentTarget;
	}



	public int getEnrollmentReached() {
		return enrollmentReached;
	}



	public double getPerkPerEnrollment() {
		return perkPerEnrollment;
	}



	public void setSourceId(int sourceId) {
		this.sourceId = sourceId;
	}



	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}



	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}



	public void setDAPer(double dAPer) {
		DAPer = dAPer;
	}



	public void setHRAPer(double hRAPer) {
		HRAPer = hRAPer;
	}



	public void setEnrollmentTarget(int enrollmentTarget) {
		this.enrollmentTarget = enrollmentTarget;
	}



	public void setEnrollmentReached(int enrollmentReached) {
		this.enrollmentReached = enrollmentReached;
	}



	public void setPerkPerEnrollment(double perkPerEnrollment) {
		this.perkPerEnrollment = perkPerEnrollment;
	}



	public Sourcing(int sourceId, String sourceName, double basicSalary, double dAPer, double hRAPer,
			int enrollmentTarget, int enrollmentReached, double perkPerEnrollment) {
		super();
		this.sourceId = sourceId;
		this.sourceName = sourceName;
		this.basicSalary = basicSalary;
		DAPer = dAPer;
		HRAPer = hRAPer;
		this.enrollmentTarget = enrollmentTarget;
		this.enrollmentReached = enrollmentReached;
		this.perkPerEnrollment = perkPerEnrollment;
	}



	public double calculateGrossSalary()
	{
		return (basicSalary +HRAPer +DAPer +(((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment));
	}

}

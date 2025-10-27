package com.ak.calculate_gross_salary_emp;

public class Trainer 
{
	private int trainerId;
	private String trainerName;
	private double basicSalary;
	private double HRaPer;
	private double DAPer;
	private int batchCount;
	private double perkPerBatch;
	
	
	public int getTrainerId() {
		return trainerId;
	}


	public String getTrainerName() {
		return trainerName;
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


	public int getBatchCount() {
		return batchCount;
	}


	public double getPerkPerBatch() {
		return perkPerBatch;
	}


	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}


	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
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


	public void setBatchCount(int batchCount) {
		this.batchCount = batchCount;
	}


	public void setPerkPerBatch(double perkPerBatch) {
		this.perkPerBatch = perkPerBatch;
	}


	public Trainer(int trainerId, String trainerName, double basicSalary, double hRaPer, double dAPer, int batchCount,
			double perkPerBatch) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		this.basicSalary = basicSalary;
		HRaPer = hRaPer;
		DAPer = dAPer;
		this.batchCount = batchCount;
		this.perkPerBatch = perkPerBatch;
	}


	public double calculateGrossSalary()
	{
		return (basicSalary+HRaPer+DAPer+(batchCount*perkPerBatch));
	}

}

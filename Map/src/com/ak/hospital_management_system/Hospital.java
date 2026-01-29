package com.ak.hospital_management_system;

import java.util.List;

public class Hospital {
	private int hospitalCode;
	private String hospitalName;
	private List<String> listOftreatments;
	private String contactPerson;
	private String contactNumber;
	private String location;
	
	

	public Hospital(String hospitalName, List<String> listOftreatments, String contactPerson, String contactNumber,
			String location) {
		super();
		this.hospitalName = hospitalName;
		this.listOftreatments = listOftreatments;
		this.contactPerson = contactPerson;
		this.contactNumber = contactNumber;
		this.location = location;
	}

	public int getHospitalCode() {
		return hospitalCode;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public List<String> getListOftreatments() {
		return listOftreatments;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public String getLocation() {
		return location;
	}

	public void setHospitalCode(int hospitalCode) {
		this.hospitalCode = hospitalCode;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public void setListOftreatments(List<String> listOftreatments) {
		this.listOftreatments = listOftreatments;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Hospital [hospitalCode=" + hospitalCode + ", hospitalName=" + hospitalName + ", listOftreatments="
				+ listOftreatments + ", contactPerson=" + contactPerson + ", contactNumber=" + contactNumber
				+ ", location=" + location + "]";
	}
	
	
	
}

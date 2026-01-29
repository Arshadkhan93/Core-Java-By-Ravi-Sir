package com.ak.hospital_management_system;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HospitalService {
	List<Hospital> hp = new ArrayList<>();
	int code = 100;

	public int addHospital(String hospitalName, List<String> listOftreatments, String contactPerson,
			String contactNumber, String location) {
		hp.add(new Hospital(hospitalName, listOftreatments, contactPerson, contactNumber, location));
		return code++;

	}
	public Map<Integer,String> getHospitals()
	{
		return null;
	}
	
	public Hospital getHospitalDetails(int code)
	{
		return null;
	}
	

}

package com.ak.hospital_management_system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HospitalService {
	List<Hospital> hp = new ArrayList<>();
	//int code = 100;

	public int addHospital(String hospitalName, List<String> listOftreatments, String contactPerson,
			String contactNumber, String location) 
	{
		Hospital hospital = new Hospital(hospitalName, listOftreatments, contactPerson, contactNumber, location);
		hp.add(hospital);
		return hospital.getHospitalCode();

	}
	public Map<Integer,String> getHospitals()
	{
		Map<Integer, String> hospitalMap = new HashMap<>();
		for(Hospital h : hp)
		{
			hospitalMap.put(h.getHospitalCode(), h.getHospitalName());
		}
		return hospitalMap;
	}
	
	public Hospital getHospitalDetails(int code)
	{
		for(Hospital hospital : hp)
		{
			if(hospital.getHospitalCode()==code)
				return hospital;
		}
		return null;
	}
	
	
	

}

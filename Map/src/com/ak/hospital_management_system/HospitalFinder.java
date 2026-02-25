package com.ak.hospital_management_system;

import java.util.List;
import java.util.Map;

public class HospitalFinder {
    public static void main(String[] args) {
        HospitalService service = new HospitalService();

        // Add hospitals
        List<String> treatments1 = List.of("Cardiac", "ENT", "Ortho", "Pediatric", "Gastro");
        List<String> treatments2 = List.of("Neurology", "Dermatology", "Oncology");
        List<String> treatments3 = List.of("Orthopedic", "ENT", "Dental");

        int code1 = service.addHospital("YASHODA", treatments1, "MATHEWS", "9848222222", "Sec");
        int code2 = service.addHospital("APOLLO", treatments2, "RAVI", "9876543210", "Hitech City");
        int code3 = service.addHospital("KIMS", treatments3, "SURESH", "9123456780", "Madhapur");

        System.out.println("Added Hospitals with Codes: " + code1 + ", " + code2 + ", " + code3);

        // Get all hospitals
        Map<Integer, String> hospitalMap = service.getHospitals();
        System.out.println("\nExisting Hospitals (Code -> Name):");
        hospitalMap.forEach((code, name) -> System.out.println(code + " -> " + name));

        // Get hospital details
        System.out.println("\nDetails of Hospital with Code " + code2 + ":");
        Hospital hospitalDetails = service.getHospitalDetails(code2);
        if (hospitalDetails != null) {
            System.out.println(hospitalDetails);
        } else {
            System.out.println("Hospital not found.");
        }

        // Try getting a hospital with a code that doesn't exist
        System.out.println("\nTrying to get details for non-existent code 999:");
        Hospital notFound = service.getHospitalDetails(999);
        System.out.println(notFound == null ? "Hospital not found." : notFound);
    }
}

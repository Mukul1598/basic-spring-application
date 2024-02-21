package com.acciojob.basicapilearning;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class PatientRepository {

    Map<Integer,Patient> patientDb = new HashMap<>();

    public String addToDb(Patient patient){

        Integer key = patient.getPatientId();
        patientDb.put(key,patient);
        return "Patient has been added to the DB";
    }


}

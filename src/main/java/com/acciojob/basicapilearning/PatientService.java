package com.acciojob.basicapilearning;


import org.springframework.stereotype.Service;

@Service
public class PatientService {

    PatientRepository patientRepository = new PatientRepository();

    public String addPatientToDb(Patient patient) {

        //Some computation incase its required

        String response = patientRepository.addToDb(patient);
        return response;
        //call Repository Layer method
        //that saves to the DB.
    }
}

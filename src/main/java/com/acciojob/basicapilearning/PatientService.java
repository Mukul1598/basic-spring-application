package com.acciojob.basicapilearning;


import org.springframework.stereotype.Service;

import java.util.List;

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


    public Patient findOldestPatient(){

        List<Patient> patientList = patientRepository.getAllPatients();

        Patient patientAns = null;
        int maxAge = 0;
        for(Patient patient : patientList) {

            if(patient.getAge()>maxAge){
                patientAns = patient;
                maxAge = patient.getAge();
            }
        }
        return patientAns;
    }


    public Patient getPatientInfo(Integer patientId){
        List<Patient> patients = patientRepository.getAllPatients();
        return patients.get(patientId);
    }

}

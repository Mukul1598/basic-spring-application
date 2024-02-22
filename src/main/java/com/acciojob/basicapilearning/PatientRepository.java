package com.acciojob.basicapilearning;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class PatientRepository {

    Map<Integer,Patient> patientDb = new HashMap<>();

    public String addToDb(Patient patient){

        Integer key = patient.getPatientId();
        patientDb.put(key,patient);
        return "Patient has been added to the DB";
    }

    public List<Patient> getAllPatients(){
            //Shortcut
//        return patientDb.values().stream().toList();

        //Long cut
        List<Patient> ansList = new ArrayList<>();
        for(Patient patient:patientDb.values()){
            ansList.add(patient);
        }
        return ansList;
    }





}

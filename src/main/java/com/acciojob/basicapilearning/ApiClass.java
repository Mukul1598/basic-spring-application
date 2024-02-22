package com.acciojob.basicapilearning;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
//@RequestMapping("v2")  :---> What is the benefit
public class ApiClass {

    Map<Integer,Patient> patientDb = new HashMap<>();

    @GetMapping("getWeatherInfo")
    public String weatherInformationMethod(){

        return "Hi the Temperature is 21 Deg, Wind speed is 10km/h "+
                "The humidity is 40% and feels like 18Deg, Night time";
    }


    @GetMapping("/findOldestPatient")
    public Patient findOldestPatient(){

        //Automatically figure out oldest patient from the DB and return

        int patientId = -1;
        int maxAge = 0;
        for(Patient patient : patientDb.values()) {

            if(patient.getAge()>maxAge){
                patientId = patient.getPatientId();
                maxAge = patient.getAge();
            }
        }
        return patientDb.get(patientId);
    }


    @GetMapping("/addPatient")
    public String addPatientToDb(@RequestParam("patientId")int patientId,
                                 @RequestParam("name")String name,
                                 @RequestParam("age")int age,
                                 @RequestParam("disease")String disease){

        Patient patient = new Patient(patientId,name,age,disease);
        int key = patientId;
        patientDb.put(key,patient);
        return "The patient has been added to the DB";
    }

    @PostMapping("/addPatientViaReqBody")
    public String addPatientToDbViaRequestBody(@RequestBody Patient patient){

        Integer key = patient.getPatientId();
        patientDb.put(key,patient);
        return "Patient has been added to the DB";
    }


    @GetMapping("/getPatientInfo")
    public Patient getPatientInfo(@RequestParam(value = "patientId", required = false)Integer patientId,
                                @RequestParam(value = "name",required = false)String name){


        if(name!=null){
            for(Patient patient:patientDb.values()){
                if(patient.getName().equals(name)){
                    return patient;
                }
            }
        }

        Integer key = patientId;
        Patient patient = patientDb.get(key);

        System.out.println(patient);
        return patient;
    }


    @GetMapping("/viewPatient/{patientId}/")
    public String viewPatient(@PathVariable("patientId")Integer patientId) {

        Patient patient = patientDb.get(patientId);
        return patient.toString();
    }



    @GetMapping("sum")
    public ResponseEntity calculateSum(@RequestParam("no1")int number1,
                                       @RequestParam("no2")int number2) {

        int finalSum = number1+number2;


        String ans =  "The sum of Entered numbers is "+finalSum;

        return new ResponseEntity(ans, HttpStatus.PAYMENT_REQUIRED);
    }





}

package com.acciojob.basicapilearning;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("patient")
public class PatientController {

    PatientService patientService = new PatientService();

    @PostMapping("/addPatientViaReqBody")
    public String addPatientToDbViaRequestBody(@RequestBody Patient patient) {

            //This class will have the endpoint majorly
            String ans = patientService.addPatientToDb(patient);
            return ans;

    }

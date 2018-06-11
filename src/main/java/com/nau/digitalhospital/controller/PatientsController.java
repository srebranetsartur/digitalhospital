package com.nau.digitalhospital.controller;

import com.nau.digitalhospital.document.MedicalCard;
import com.nau.digitalhospital.document.Patient;
import com.nau.digitalhospital.repository.HospitalRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PatientsController {
    @Autowired
    private HospitalRepository hospitalRepository;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloFromPatientController() {
        return "Hello from PatientController";
    }

    
}

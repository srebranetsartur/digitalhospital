package com.nau.digitalhospital.repository;

import com.nau.digitalhospital.document.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PatientRepository extends MongoRepository<Patient, String> {

}

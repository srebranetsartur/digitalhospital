package com.nau.digitalhospital.repository;

import com.nau.digitalhospital.document.Hospital;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface HospitalRepository extends MongoRepository<Hospital, String> {
    List<Hospital> findHospitalByTitle(String title);
}

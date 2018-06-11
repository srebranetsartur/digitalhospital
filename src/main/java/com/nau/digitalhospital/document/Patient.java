package com.nau.digitalhospital.document;

import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Document(collection = "patients")
public class Patient extends Person {
    private MedicalCard medicalCard;
    public Patient() {

    }

    public Patient(String name, String middleName, String secondName, LocalDate birthday, int age, Gender gender, Contacts contacts) {
        super(name, middleName, secondName, birthday, age, gender, contacts);
    }

    public MedicalCard getMedicalCard() {
        return medicalCard;
    }

    public void setMedicalCard(MedicalCard medicalCard) {
        this.medicalCard = medicalCard;
    }
}

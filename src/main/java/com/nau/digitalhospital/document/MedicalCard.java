package com.nau.digitalhospital.document;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "medical_card")
public class MedicalCard {
    @Id
    private ObjectId ID;
    private Patient patient;
    private List<MedicalExamination> medicalExaminations;

    public MedicalCard(Patient patient, List<MedicalExamination> medicalExaminations) {
        ID = new ObjectId();
        this.patient = patient;
        this.medicalExaminations = medicalExaminations;
    }

    public ObjectId getID() {
        return ID;
    }

    public void setID(ObjectId ID) {
        this.ID = ID;
    }

    public List<MedicalExamination> getMedicalExaminations() {
        return medicalExaminations;
    }

    public void setMedicalExaminations(List<MedicalExamination> medicalExaminations) {
        this.medicalExaminations = medicalExaminations;
    }
}

package com.nau.digitalhospital.document;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Document(collection = "medical_examination")
public class MedicalExamination {
    @Id
    private ObjectId ID;
    private LocalDateTime appointmentDate;
    private Doctor doctor;
    private List<String> symptoms;
    private String diagnosis;
    private LocalDateTime finishDate;
    private String comment;

    public MedicalExamination(LocalDateTime appointmentDate, Doctor doctor, List<String> symptoms, String diagnosis, LocalDateTime finishDate, String comment) {
        this.ID = new ObjectId();
        this.appointmentDate = appointmentDate;
        this.doctor = doctor;
        this.symptoms = symptoms;
        this.diagnosis = diagnosis;
        this.finishDate = finishDate;
        this.comment = comment;
    }

    public ObjectId getID() {
        return ID;
    }

    public void setID(ObjectId ID) {
        this.ID = ID;
    }

    public LocalDateTime getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDateTime appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public List<String> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(List<String> symptoms) {
        this.symptoms = symptoms;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public LocalDateTime getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(LocalDateTime finishDate) {
        this.finishDate = finishDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}

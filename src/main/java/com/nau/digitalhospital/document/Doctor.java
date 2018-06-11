package com.nau.digitalhospital.document;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;

@Document
public class Doctor extends Person {
    @Field("appointed_date")
    private LocalDate appointedDate;
    private List<String> certifications;
    private String degree;
    private List<String> educations;
    private List<Patient> patients;
    private String biography;

    public Doctor() {

    }

    public Doctor(LocalDate appointedDate, List<String> certifications, String degree, List<String> educations, List<Patient> patients) {
        this.appointedDate = appointedDate;
        this.certifications = certifications;
        this.degree = degree;
        this.educations = educations;
        this.patients = patients;
    }

    public LocalDate getAppointedDate() {
        return appointedDate;
    }

    public void setAppointedDate(LocalDate appointedDate) {
        this.appointedDate = appointedDate;
    }

    public List<String> getCertifications() {
        return certifications;
    }

    public void setCertifications(List<String> certifications) {
        this.certifications = certifications;
    }

    public String getDoctorDegree() {
        return degree;
    }

    public void setDoctorDegree(String degree) {
        this.degree = degree;
    }

    public List<String> getEducations() {
        return educations;
    }

    public void setEducations(List<String> educations) {
        this.educations = educations;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }
}



package com.nau.digitalhospital.document;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Date;

@Document
public class Account {
    @Id
    private ObjectId ID;
    private MedicalCard medicalCard;
    @Indexed(unique = true)
    private String login;
    private String password;
    private LocalDate registrationDate;

    public Account(MedicalCard medicalCard, String login, String password, LocalDate registrationDate) {
        this.ID = new ObjectId();
        this.medicalCard = medicalCard;
        this.login = login;
        this.password = password;
        this.registrationDate = registrationDate;
    }

    public ObjectId getId() {
        return ID;
    }

    public void setId(ObjectId ID) {
        this.ID = ID;
    }

    public MedicalCard getMedicalCard() {
        return medicalCard;
    }

    public void setMedicalCard(MedicalCard medicalCard) {
        this.medicalCard = medicalCard;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }
}

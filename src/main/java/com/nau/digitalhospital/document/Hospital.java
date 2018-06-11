package com.nau.digitalhospital.document;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Hospital {
    @Id
    private ObjectId ID;
    private String title;
    private List<Account> accounts;
    private List<Doctor> doctors;
    private Contacts contacts;

    public Hospital() {}

    public Hospital(String title, List<Account> accounts, List<Doctor> doctors, Contacts contacts) {
        this.title = title;
        this.accounts = accounts;
        this.doctors = doctors;
        this.contacts = contacts;
    }

    public Object getId() {
        return ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public Contacts getContacts() {
        return contacts;
    }

    public void setContacts(Contacts contacts) {
        this.contacts = contacts;
    }

}

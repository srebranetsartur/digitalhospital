package com.nau.digitalhospital.document;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Contacts {
    @Id
    private ObjectId ID;
    private String mail;
    private String phoneNumber;
    private Address address;

    public Contacts(String mail, String phoneNumber, Address address) {
        this.ID = new ObjectId();
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public ObjectId getID() {
        return ID;
    }

    public void setID(ObjectId ID) {
        this.ID = ID;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

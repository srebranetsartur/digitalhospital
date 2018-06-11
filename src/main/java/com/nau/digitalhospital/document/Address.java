package com.nau.digitalhospital.document;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Address {
    @Id
    private ObjectId ID;
    private String city;
    private String street;
    private int houseNumber;
    private int flatNumber;

    public Address() {}

    public Address(String city, String street, int houseNumber, int flatNumber) {
        this.ID = new ObjectId();
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
    }
}

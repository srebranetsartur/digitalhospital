package com.nau.digitalhospital.document;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;
import java.util.Date;

@Document(collection = "persons")
public abstract class Person {
    @Id
    private ObjectId ID;
    private String name;
    @Field("middle_name")
    private String middleName;
    @Field("second_name")
    private String secondName;
    private LocalDate birthday;
    private int age;
    private Gender gender;
    private Contacts contacts;

    public Person() {

    }
    public Person(String name, String middleName, String secondName, LocalDate birthday, int age, Gender gender, Contacts contacts) {
        this.ID = new ObjectId();
        this.name = name;
        this.middleName = middleName;
        this.secondName = secondName;
        this.birthday = birthday;
        this.age = age;
        this.gender = gender;
        this.contacts = contacts;
    }

    public ObjectId getId() {
        return ID;
    }

    public void setId(ObjectId ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Contacts getContacts() {
        return contacts;
    }

    public void setContacts(Contacts contacts) {
        this.contacts = contacts;
    }
}

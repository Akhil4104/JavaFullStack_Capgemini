package com.example;

import javax.persistence.*;

@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int personId;

    private String name;

    private int age;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "aadhar_id") // FK column in person table
    private Aadhar aadhar;

    public Person() {}

    public Person(String name, int age, Aadhar aadhar) {
        this.name = name;
        this.age = age;
        this.aadhar = aadhar;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Aadhar getAadhar() {
        return aadhar;
    }

    public void setAadhar(Aadhar aadhar) {
        this.aadhar = aadhar;
    }

    @Override
    public String toString() {
        return "Person [personId=" + personId + ", name=" + name + ", age=" + age + "]";
    }
}

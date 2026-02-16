package com.example;

import javax.persistence.*;

@Entity
@Table(name = "aadhar")
public class Aadhar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int aadharId;

    @Column(unique = true)
    private String aadharNumber;

    private String address;

    public Aadhar() {}

    public Aadhar(String aadharNumber, String address) {
        this.aadharNumber = aadharNumber;
        this.address = address;
    }

    public int getAadharId() {
        return aadharId;
    }

    public void setAadharId(int aadharId) {
        this.aadharId = aadharId;
    }

    public String getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Aadhar [aadharId=" + aadharId + ", aadharNumber=" + aadharNumber + ", address=" + address + "]";
    }
}

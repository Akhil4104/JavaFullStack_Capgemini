package com.example.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private LocalDate dob;
    private String bloodGroup;
    private String phone;

    @OneToOne(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            optional = true)
    @JoinColumn(name = "med_record_id")
    private MedicalRecord medicalRecord;

    @ManyToMany(mappedBy = "patients")
    private List<Doctor> doctors = new ArrayList<>();

    public int getAge() {
        return Period.between(dob, LocalDate.now()).getYears();
    }

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public LocalDate getDob() {
        return dob;
    }
    public String getBloodGroup() {
        return bloodGroup;
    }
    public String getPhone() {
        return phone;
    }
    public MedicalRecord getMedicalRecord() {
        return medicalRecord;
    }
    public List<Doctor> getDoctors() {
        return doctors;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setMedicalRecord(MedicalRecord medicalRecord) {
        this.medicalRecord = medicalRecord;
    }
}

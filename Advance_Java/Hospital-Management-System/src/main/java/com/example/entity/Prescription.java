package com.example.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Prescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String medicines;
    private String dosage;
    private LocalDate issuedDate;

    public boolean isActive() {
        return issuedDate != null;
    }

    public Long getId() {
        return id;
    }
    public String getMedicines() {
        return medicines;
    }
    public String getDosage() {
        return dosage;
    }
    public LocalDate getIssuedDate() {
        return issuedDate;
    }

    public void setMedicines(String medicines) {
        this.medicines = medicines;
    }
    public void setDosage(String dosage) {
        this.dosage = dosage;
    }
    public void setIssuedDate(LocalDate issuedDate) {
        this.issuedDate = issuedDate;
    }
}
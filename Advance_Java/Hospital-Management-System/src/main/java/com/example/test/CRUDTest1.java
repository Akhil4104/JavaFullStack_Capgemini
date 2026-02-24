package com.example.test;

import com.example.entity.*;
import com.example.util.JpaUtil;
import jakarta.persistence.EntityManager;

import java.time.LocalDate;

public class CRUDTest1 {

    public static void main(String[] args) {

        EntityManager em = JpaUtil.getFactory().createEntityManager();

        em.getTransaction().begin();

        MedicalRecord record = new MedicalRecord();
        record.setRecordDate(LocalDate.now());
        record.setDiagnosis("Flu");
        record.setNotes("Rest 3 days");

        Patient patient = new Patient();
        patient.setName("Akhil");
        patient.setDob(LocalDate.of(2002, 5, 10));
        patient.setBloodGroup("O+");
        patient.setPhone("9999999999");
        patient.setMedicalRecord(record);

        em.persist(patient);
        em.getTransaction().commit();

        Long patientId = patient.getId();
        em.clear();

        Patient p = em.find(Patient.class, patientId);
        System.out.println("Diagnosis: " + p.getMedicalRecord().getDiagnosis());

        em.getTransaction().begin();
        p.getMedicalRecord().setNotes("Updated: Follow-up required");
        em.getTransaction().commit();

        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();

        em.close();
        System.out.println("CRUDTest1 Completed");
    }
}
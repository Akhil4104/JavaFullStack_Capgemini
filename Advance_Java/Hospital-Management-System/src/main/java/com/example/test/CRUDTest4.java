package com.example.test;

import com.example.entity.*;
import com.example.util.JpaUtil;
import jakarta.persistence.EntityManager;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CRUDTest4 {

    public static void main(String[] args) {

        EntityManager em = JpaUtil.getFactory().createEntityManager();
        em.getTransaction().begin();

        Prescription pr = new Prescription();
        pr.setMedicines("Paracetamol");
        pr.setDosage("2 times");
        pr.setIssuedDate(LocalDate.now());

        Appointment ap1 = new Appointment();
        ap1.setAppointDate(LocalDateTime.now());
        ap1.setStatus("COMPLETED");
        ap1.setReason("Fever");
        ap1.setPrescription(pr);

        em.persist(ap1);

        Appointment ap2 = new Appointment();
        ap2.setAppointDate(LocalDateTime.now());
        ap2.setStatus("SCHEDULED");
        ap2.setReason("Cold");

        em.persist(ap2);

        em.getTransaction().commit();
        em.close();

        System.out.println("CRUDTest4 Completed");
    }
}
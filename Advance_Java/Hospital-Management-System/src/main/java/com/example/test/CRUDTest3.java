package com.example.test;

import com.example.entity.*;
import com.example.util.JpaUtil;
import jakarta.persistence.EntityManager;

import java.time.LocalDateTime;

public class CRUDTest3 {

    public static void main(String[] args) {

        EntityManager em = JpaUtil.getFactory().createEntityManager();
        em.getTransaction().begin();

        Doctor doctor = new Doctor();
        doctor.setName("Dr. Sharma");
        doctor.setSpecialization("General");

        Appointment a1 = new Appointment();
        a1.setAppointDate(LocalDateTime.now());
        a1.setStatus("SCHEDULED");
        a1.setReason("Checkup");

        doctor.getAppointments().add(a1);

        em.persist(doctor);
        em.getTransaction().commit();

        em.close();
        System.out.println("CRUDTest3 Completed");
    }
}
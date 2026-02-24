package com.example.test;

import com.example.entity.*;
import com.example.util.JpaUtil;
import jakarta.persistence.EntityManager;

import java.time.LocalDate;

public class CRUDTest5 {

    public static void main(String[] args) {

        EntityManager em = JpaUtil.getFactory().createEntityManager();
        em.getTransaction().begin();

        Doctor d1 = new Doctor();
        d1.setName("Dr. Mehta");

        Doctor d2 = new Doctor();
        d2.setName("Dr. Singh");

        Patient p1 = new Patient();
        p1.setName("Ali");
        p1.setDob(LocalDate.of(1995, 5, 5));

        Patient p2 = new Patient();
        p2.setName("Priya");
        p2.setDob(LocalDate.of(1998, 8, 8));

        d1.addPatient(p1);
        d1.addPatient(p2);
        d2.addPatient(p1);

        em.persist(d1);
        em.persist(d2);

        em.getTransaction().commit();

        Doctor doc = em.createQuery(
                        "SELECT d FROM Doctor d JOIN FETCH d.patients WHERE d.name = :name",
                        Doctor.class)
                .setParameter("name", "Dr. Mehta")
                .getSingleResult();

        System.out.println("Patients of Dr. Mehta:");
        doc.getPatients().forEach(p -> System.out.println(p.getName()));

        em.close();
        System.out.println("CRUDTest5 Completed");
    }
}
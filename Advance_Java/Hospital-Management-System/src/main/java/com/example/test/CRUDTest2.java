package com.example.test;

import com.example.entity.*;
import com.example.util.JpaUtil;
import jakarta.persistence.EntityManager;

public class CRUDTest2 {

    public static void main(String[] args) {

        EntityManager em = JpaUtil.getFactory().createEntityManager();
        em.getTransaction().begin();

        Department cardio = new Department();
        cardio.setName("Cardiology");
        cardio.setLocation("Block A");

        Department neuro = new Department();
        neuro.setName("Neurology");
        neuro.setLocation("Block B");

        Doctor d1 = new Doctor();
        d1.setName("Dr. Mehta");
        d1.setSpecialization("Heart");

        Doctor d2 = new Doctor();
        d2.setName("Dr. Singh");
        d2.setSpecialization("Brain");

        cardio.addDoctor(d1);
        neuro.addDoctor(d2);

        em.persist(cardio);
        em.persist(neuro);

        em.getTransaction().commit();

        System.out.println("Cardiology Doctors:");
        em.createQuery("SELECT d FROM Doctor d WHERE d.department.name = :name", Doctor.class)
                .setParameter("name", "Cardiology")
                .getResultList()
                .forEach(doc -> System.out.println(doc.getName()));

        em.close();
        System.out.println("CRUDTest2 Completed");
    }
}
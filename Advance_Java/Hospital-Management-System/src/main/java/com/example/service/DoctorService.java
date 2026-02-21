package com.example.service;

import com.example.entity.*;
import com.example.util.JpaUtil;
import jakarta.persistence.EntityManager;

import java.util.List;

public class DoctorService extends BaseService<Doctor> {

    public DoctorService() {
        super(Doctor.class);
    }

    // Assign patient to doctor (ManyToMany)
    public void assignPatient(Long doctorId, Long patientId) {

        EntityManager em = JpaUtil.getFactory().createEntityManager();
        em.getTransaction().begin();

        Doctor doctor = em.find(Doctor.class, doctorId);
        Patient patient = em.find(Patient.class, patientId);

        doctor.addPatient(patient);

        em.getTransaction().commit();
        em.close();
    }

    // Fetch doctor with patients using JOIN FETCH
    public Doctor getDoctorWithPatients(Long doctorId) {

        EntityManager em = JpaUtil.getFactory().createEntityManager();

        Doctor doctor = em.createQuery(
                        "SELECT d FROM Doctor d JOIN FETCH d.patients WHERE d.id = :id",
                        Doctor.class
                )
                .setParameter("id", doctorId)
                .getSingleResult();

        em.close();
        return doctor;
    }

    // Add appointment to doctor (Uni 1:N)
    public void addAppointment(Long doctorId, Appointment appointment) {

        EntityManager em = JpaUtil.getFactory().createEntityManager();
        em.getTransaction().begin();

        Doctor doctor = em.find(Doctor.class, doctorId);
        doctor.getAppointments().add(appointment);

        em.getTransaction().commit();
        em.close();
    }
}
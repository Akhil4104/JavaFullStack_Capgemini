package com.example.service;

import com.example.entity.*;
import com.example.util.JpaUtil;
import jakarta.persistence.EntityManager;

import java.util.List;

public class DoctorService extends BaseService<Doctor> {

    public DoctorService() {
        super(Doctor.class);
    }
    public void assignPatient(Long doctorId, Long patientId) {

        EntityManager em = JpaUtil.getFactory().createEntityManager();
        em.getTransaction().begin();

        Doctor doctor = em.find(Doctor.class, doctorId);
        Patient patient = em.find(Patient.class, patientId);

        doctor.addPatient(patient);

        em.getTransaction().commit();
        em.close();
    }
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
    public void addAppointment(Long doctorId, Appointment appointment) {

        EntityManager em = JpaUtil.getFactory().createEntityManager();
        em.getTransaction().begin();

        Doctor doctor = em.find(Doctor.class, doctorId);
        doctor.getAppointments().add(appointment);

        em.getTransaction().commit();
        em.close();
    }
}

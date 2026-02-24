package com.example.service;
import com.example.entity.Appointment;
import com.example.entity.Prescription;
import com.example.util.JpaUtil;
import jakarta.persistence.EntityManager;

public class AppointmentService extends BaseService<Appointment> {

    public AppointmentService() {
        super(Appointment.class);
    }
    public void addPrescription(Long appointmentId, Prescription prescription) {

        EntityManager em = JpaUtil.getFactory().createEntityManager();
        em.getTransaction().begin();

        Appointment appt = em.find(Appointment.class, appointmentId);
        appt.setPrescription(prescription);

        em.getTransaction().commit();
        em.close();
    }
}
package com.example;
import com.example.entity.*;
import com.example.service.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class App {

    public static void main(String[] args) {

        PatientService patientService = new PatientService();
        DoctorService doctorService = new DoctorService();
        DepartmentService departmentService = new DepartmentService();
        AppointmentService appointmentService = new AppointmentService();

        MedicalRecord record = new MedicalRecord();
        record.setRecordDate(LocalDate.now());
        record.setDiagnosis("Flu");
        record.setNotes("Take rest for 3 days");

        Patient patient = new Patient();
        patient.setName("Akhil");
        patient.setBloodGroup("O+");
        patient.setDob(LocalDate.of(2004, 4, 10));
        patient.setMedicalRecord(record);

        patientService.save(patient);

        System.out.println("Patient + MedicalRecord saved!");

        Department cardiology = new Department();
        cardiology.setName("Cardiology");
        cardiology.setLocation("Block A");

        Doctor doctor1 = new Doctor();
        doctor1.setName("Dr. Mehta");
        doctor1.setSpecialization("Heart Specialist");

        cardiology.addDoctor(doctor1);

        departmentService.save(cardiology);

        System.out.println("Department + Doctor saved!");

        Appointment appointment1 = new Appointment();
        appointment1.setAppointDate(LocalDateTime.now());
        appointment1.setStatus("SCHEDULED");

        doctorService.addAppointment(doctor1.getId(), appointment1);

        System.out.println("Appointment added to Doctor!");

        Prescription prescription = new Prescription();
        prescription.setMedicines("Paracetamol");
        prescription.setDosage("2 times daily");
        prescription.setIssuedDate(LocalDate.now());

        appointmentService.addPrescription(appointment1.getId(), prescription);

        System.out.println("Prescription added to Appointment!");

        doctorService.assignPatient(doctor1.getId(), patient.getId());

        System.out.println("Patient assigned to Doctor!");

        System.out.println("All tasks executed successfully!");
    }
}

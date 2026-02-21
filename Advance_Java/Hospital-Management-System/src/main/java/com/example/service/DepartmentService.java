package com.example.service;
import com.example.entity.Department;
import com.example.entity.Doctor;
import com.example.util.JpaUtil;
import jakarta.persistence.EntityManager;

public class DepartmentService extends BaseService<Department> {

    public DepartmentService() {
        super(Department.class);
    }

    public void addDoctorToDepartment(Long deptId, Doctor doctor) {

        EntityManager em = JpaUtil.getFactory().createEntityManager();
        em.getTransaction().begin();

        Department dept = em.find(Department.class, deptId);
        dept.addDoctor(doctor);

        em.persist(doctor);

        em.getTransaction().commit();
        em.close();
    }
}
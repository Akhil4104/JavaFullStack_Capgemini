package com.example;

import com.example.persistence.CustomPersistenceUnitInfo;
import com.example.persistence.HikariCPConfig;
import org.hibernate.jpa.HibernatePersistenceProvider;
import org.hibernatejpa.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        EntityManagerFactory emf = null;
        EntityManager em = null;

        try {
            DataSource dataSource = HikariCPConfig.getDataSource();
            Map<String, Object> props = new HashMap<>();
            props.put("hibernate.connection.datasource", dataSource);
            props.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
            props.put("hibernate.hbm2ddl.auto", "create");
            props.put("hibernate.show_sql", "true");
            props.put("hibernate.format_sql", "true");
            CustomPersistenceUnitInfo info = new CustomPersistenceUnitInfo();

            emf = new HibernatePersistenceProvider()
                    .createContainerEntityManagerFactory(info, props);

            em = emf.createEntityManager();

            em.getTransaction().begin();

            Student student = new Student();
            student.setName("Ah");
            student.setStudentFees(1000);

            em.persist(student);

            em.getTransaction().commit();

            System.out.println("Student saved successfully using HikariCP!");

        } catch (Exception e) {
            e.printStackTrace();

            if (em != null && em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        } finally {
            if (em != null) em.close();
            if (emf != null) emf.close();
        }
    }
}
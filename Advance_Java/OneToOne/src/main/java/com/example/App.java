package com.example;
import org.hibernate.Session;
import org.hibernate.Transaction;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.Aadhar;
import com.example.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Load Hibernate Configuration file
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");  // redirecting config file

        // Create SessionFactory
        SessionFactory factory = cfg.buildSessionFactory();

        // Open Session
        Session session = factory.openSession();

        // Begin Transaction
        Transaction tx = session.beginTransaction();

        // Create objects
        Aadhar aadhar = new Aadhar("1254-2142-3563", "Mandi, HP");
        Person person = new Person("Akhil Rana", 22, aadhar);

        // Save person (aadhar auto save due to cascade)
        session.save(person);

        // Commit transaction
        tx.commit();

        // Close session + factory
        session.close();
        factory.close();

        System.out.println("Data Inserted Successfully!");
    }
}

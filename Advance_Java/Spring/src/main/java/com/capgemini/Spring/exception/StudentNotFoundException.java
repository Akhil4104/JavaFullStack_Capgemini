package com.capgemini.Spring.exception;

public class StudentNotFoundException extends RuntimeException {

    public StudentNotFoundException(String message) {
        super(message);
    }

    public StudentNotFoundException(Integer id) {
        super("Student not found with id: " + id);
    }
}

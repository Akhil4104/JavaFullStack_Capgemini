package com.capgemini.basicspringboot;

public class EmployeeNotFoundException extends RuntimeException{
    EmployeeNotFoundException(String message){
        super(message);
    }
}

package com.capgemini.Spring.dto;

import lombok.Getter;

@Getter
public class StudentRequestDto {

    private String name;

    public StudentRequestDto() {
    }

    public StudentRequestDto(String name) {
        this.name = name;
    }

}
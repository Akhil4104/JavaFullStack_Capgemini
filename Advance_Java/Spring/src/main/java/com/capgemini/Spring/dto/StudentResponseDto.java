package com.capgemini.Spring.dto;

import lombok.Getter;

@Getter
public class StudentResponseDto {

    private int id;
    private String name;

    public StudentResponseDto() {
    }

    public StudentResponseDto(int id, String name) {
        this.id = id;
        this.name = name;
    }

}
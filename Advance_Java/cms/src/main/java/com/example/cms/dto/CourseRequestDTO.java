package com.example.cms.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseRequestDTO {

    @NotBlank(message="Title is required")
    private String title;

    private String description;

    @NotBlank(message="Instructor name is required")
    private String instructor;

    @Min(value=1,message="Duration must be atleast 1 hour")
    private int duration;

    @PositiveOrZero(message="Price cannot be negative")
    private Double price;
}

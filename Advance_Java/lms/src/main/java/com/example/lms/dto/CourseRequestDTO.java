package com.example.lms.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseRequestDTO {
    @NotBlank(message="Title required")
    private String title;

    private String description;

    @PositiveOrZero
    private Double price;

    @Min(1)
    private int duration;

    @NotNull
    private Long instructorId;
}

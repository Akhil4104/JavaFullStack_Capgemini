package com.library.Library_Management_System.dto;

import jakarta.validation.constraints.*;
        import lombok.Data;
@Data
public class BookRequestDTO {

    @NotBlank
    private String title;

    private String author;

    @Pattern(regexp="^\\d{13}$")
    private String isbn;

    @Min(1)
    private Double price;

    private Integer publishedYear;

    private String category;

    private String description;
}
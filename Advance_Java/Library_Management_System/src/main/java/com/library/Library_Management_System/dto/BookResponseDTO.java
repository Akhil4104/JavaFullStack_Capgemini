package com.library.Library_Management_System.dto;

import lombok.Data;

@Data
public class BookResponseDTO {
    private Long id;
    private String title;
    private String author;
    private String isbn;
    private Double price;
    private Integer publishedYear;
    private String category;
    private String description;
}

package com.library.Library_Management_System.dto;
import lombok.Data;

import java.time.LocalDateTime;
public class BookCoverResponseDTO {

    private String fileName;
    private String fileType;
    private Long fileSize;
    private LocalDateTime uploadDate;
}

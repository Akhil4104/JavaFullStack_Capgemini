package com.library.Library_Management_System.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class BookCover {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String fileName;

    private String fileType;

    private Long fileSize;

    @Lob
    @Column(columnDefinition ="LONGBLOB")
    private byte[]fileData;

    private LocalDateTime uploadDate;

    @OneToOne
    @JoinColumn(name="book_id")
    private Book book;
}

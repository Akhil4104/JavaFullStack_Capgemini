package com.library.Library_Management_System.repository;

import com.library.Library_Management_System.entity.BookCover;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookCoverRepository extends JpaRepository<BookCover,Long> {
}

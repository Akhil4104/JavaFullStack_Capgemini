package com.library.Library_Management_System.repository;
import com.library.Library_Management_System.entity.Book;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Long> {

    List<Book> findByCategory(String category);

    @Query(value =
            "SELECT * FROM book WHERE price BETWEEN :min AND :max",
            nativeQuery = true)
    List<Book> findBooksByPriceRange(
            @Param("min") Double min,
            @Param("max") Double max);
}
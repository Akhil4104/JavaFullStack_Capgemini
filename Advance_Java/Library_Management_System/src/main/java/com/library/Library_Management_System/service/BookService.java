package com.library.Library_Management_System.service;

import com.library.Library_Management_System.dto.*;

public interface BookService {

    BookResponseDTO createBook(BookRequestDTO dto);

    PageResponseDTO<BookResponseDTO> getAllBooks(int page,int size,String sortBy);

    BookResponseDTO getBookById(Long id);

    BookResponseDTO updateBook(Long id,BookRequestDTO dto);

    void deleteBook(Long id);
}
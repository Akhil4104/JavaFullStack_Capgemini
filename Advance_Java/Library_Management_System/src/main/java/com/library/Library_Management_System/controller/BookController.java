package com.library.Library_Management_System.controller;

import com.library.Library_Management_System.dto.*;
        import com.library.Library_Management_System.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
public class BookController {

    private final BookService service;

    @PostMapping
    public BookResponseDTO createBook(@RequestBody BookRequestDTO dto){
        return service.createBook(dto);
    }

    @GetMapping
    public PageResponseDTO<BookResponseDTO> getAllBooks(
            @RequestParam int page,
            @RequestParam int size,
            @RequestParam String sortBy){

        return service.getAllBooks(page,size,sortBy);
    }

    @GetMapping("/{id}")
    public BookResponseDTO getBook(@PathVariable Long id){
        return service.getBookById(id);
    }

    @PutMapping("/{id}")
    public BookResponseDTO updateBook(
            @PathVariable Long id,
            @RequestBody BookRequestDTO dto){

        return service.updateBook(id,dto);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id){
        service.deleteBook(id);
    }
}
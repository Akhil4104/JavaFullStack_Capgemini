package com.library.Library_Management_System.service;

import com.library.Library_Management_System.dto.*;
import com.library.Library_Management_System.entity.Book;
import com.library.Library_Management_System.exception.BookNotFoundException;
import com.library.Library_Management_System.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final ModelMapper mapper;

    public BookResponseDTO createBook(BookRequestDTO dto){

        Book book = mapper.map(dto,Book.class);

        Book saved = bookRepository.save(book);

        return mapper.map(saved,BookResponseDTO.class);
    }

    public PageResponseDTO<BookResponseDTO> getAllBooks(int page,int size,String sortBy){

        Pageable pageable = PageRequest.of(page,size,Sort.by(sortBy));

        Page<Book> books = bookRepository.findAll(pageable);

        PageResponseDTO<BookResponseDTO> response = new PageResponseDTO<>();

        response.setContent(
                books.getContent()
                        .stream()
                        .map(b->mapper.map(b,BookResponseDTO.class))
                        .toList());

        response.setPageNo(books.getNumber());
        response.setPageSize(books.getSize());
        response.setTotalElements(books.getTotalElements());
        response.setTotalPages(books.getTotalPages());
        response.setLast(books.isLast());

        return response;
    }

    public BookResponseDTO getBookById(Long id){

        Book book = bookRepository.findById(id)
                .orElseThrow(()-> new BookNotFoundException("Book not found "+id));

        return mapper.map(book,BookResponseDTO.class);
    }

    public BookResponseDTO updateBook(Long id,BookRequestDTO dto){

        Book book = bookRepository.findById(id)
                .orElseThrow(()-> new BookNotFoundException("Book not found"));

        book.setTitle(dto.getTitle());
        book.setAuthor(dto.getAuthor());
        book.setPrice(dto.getPrice());
        book.setCategory(dto.getCategory());
        book.setDescription(dto.getDescription());

        Book updated = bookRepository.save(book);

        return mapper.map(updated,BookResponseDTO.class);
    }

    public void deleteBook(Long id){

        Book book = bookRepository.findById(id)
                .orElseThrow(()-> new BookNotFoundException("Book not found"));

        bookRepository.delete(book);
    }
}
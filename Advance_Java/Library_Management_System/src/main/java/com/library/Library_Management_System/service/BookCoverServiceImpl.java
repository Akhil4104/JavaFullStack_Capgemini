package com.library.Library_Management_System.service;
import com.library.Library_Management_System.entity.*;
import com.library.Library_Management_System.exception.*;
import com.library.Library_Management_System.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.*;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class BookCoverServiceImpl implements BookCoverService {

    private final BookRepository bookRepository;
    private final BookCoverRepository coverRepository;

    public void uploadCover(Long bookId, MultipartFile file){

        try{

            Book book = bookRepository.findById(bookId)
                    .orElseThrow(()-> new BookNotFoundException("Book not found"));

            BookCover cover = new BookCover();

            cover.setFileName(file.getOriginalFilename());
            cover.setFileType(file.getContentType());
            cover.setFileSize(file.getSize());
            cover.setFileData(file.getBytes());
            cover.setUploadDate(LocalDateTime.now());

            cover.setBook(book);

            coverRepository.save(cover);

        }catch(Exception e){
            throw new FileStorageException("File upload failed");
        }
    }

    public Resource downloadCover(Long bookId){

        Book book = bookRepository.findById(bookId)
                .orElseThrow(()-> new BookNotFoundException("Book not found"));

        byte[] data = book.getCover().getFileData();

        return new ByteArrayResource(data);
    }
}
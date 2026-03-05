package com.library.Library_Management_System.controller;


import com.library.Library_Management_System.service.BookCoverService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
public class BookCoverController {

    private final BookCoverService service;

    @PostMapping(value = "/{id}/cover", consumes = "multipart/form-data")
    public String uploadCover(
            @PathVariable Long id,
            @RequestParam("file") MultipartFile file) {

        service.uploadCover(id, file);

        return "File uploaded successfully";
    }

    @GetMapping("/{id}/cover")
    public ResponseEntity<Resource> getCover(@PathVariable Long id){

        Resource file = service.downloadCover(id);

        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .body(file);
    }
}

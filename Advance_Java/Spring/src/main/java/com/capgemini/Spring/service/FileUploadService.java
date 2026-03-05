package com.capgemini.Spring.service;

import com.capgemini.Spring.entity.FileUpload;
import com.capgemini.Spring.repository.FileUploadRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class FileUploadService {

    private final FileUploadRepository fileUploadRepository;

    public FileUploadService(FileUploadRepository fileUploadRepository) {
        this.fileUploadRepository = fileUploadRepository;
    }

    public FileUpload uploadFile(MultipartFile file) throws IOException {
        FileUpload fileUpload = new FileUpload(
                file.getOriginalFilename(),
                file.getContentType(),
                file.getBytes()
        );
        return fileUploadRepository.save(fileUpload);
    }

    public FileUpload getFile(Long id) {
        return fileUploadRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("File not found with id: " + id));
    }
}

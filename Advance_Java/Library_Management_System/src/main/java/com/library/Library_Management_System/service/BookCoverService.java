package com.library.Library_Management_System.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface BookCoverService {

    void uploadCover(Long bookId, MultipartFile file);

    Resource downloadCover(Long bookId);
}
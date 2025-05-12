package com.hibernate.example_h2.controller;

import com.hibernate.example_h2.service.GCSImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/images")
public class ImageController {

    @Autowired
    private GCSImageService imageService;

    @PostMapping("/upload")
    public ResponseEntity<String> upload(@RequestParam("file") MultipartFile file) throws Exception {
        String url = imageService.uploadImage(file);
        return ResponseEntity.ok(url);
    }

    @GetMapping(value = "/{fileName}", produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<byte[]> download(@PathVariable String fileName) {
        byte[] image = imageService.downloadImage(fileName);
        return image != null ? ResponseEntity.ok(image) : ResponseEntity.notFound().build();
    }
}


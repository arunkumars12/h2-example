package com.hibernate.example_h2.config;

import jakarta.annotation.PostConstruct;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.Files;

@Component
public class GCPAuthInitializer {

//    @PostConstruct
//    public void init() throws Exception {
//        ClassPathResource resource = new ClassPathResource("gcpauth.json");
//
//        // Create temp file
//        File tempFile = Files.createTempFile("gcp_auth", ".json").toFile();
//        tempFile.deleteOnExit();
//
//        // Copy contents from classpath resource
//        try (InputStream in = resource.getInputStream();
//             FileOutputStream out = new FileOutputStream(tempFile)) {
//            in.transferTo(out);
//        }
//
//        // Set environment variable for GCP SDK
//        System.setProperty("GOOGLE_APPLICATION_CREDENTIALS", tempFile.getAbsolutePath());
//    }
}

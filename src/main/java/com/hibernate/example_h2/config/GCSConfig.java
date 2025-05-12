package com.hibernate.example_h2.config;

import com.google.auth.oauth2.ServiceAccountCredentials;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;

@Configuration
public class GCSConfig {

    @Bean
    public Storage storage() throws IOException {
        
//        GOOGLE_APPLICATION_CREDENTIALS=/Users/arun/Downloads/example-h2/src/main/resources/gcpauth.json
//        ClassPathResource resource = new ClassPathResource("gcpauth.json");
//        try (InputStream inputStream = resource.getInputStream()) {
//            return StorageOptions.newBuilder()
//                    .setCredentials(ServiceAccountCredentials.fromStream(inputStream))
//                    .build()
//                    .getService();
//        }
        return StorageOptions.getDefaultInstance().getService();
    }
}

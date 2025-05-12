package com.hibernate.example_h2.service;

import com.google.cloud.storage.Blob;
import com.google.cloud.storage.BlobId;
import com.google.cloud.storage.BlobInfo;
import com.google.cloud.storage.Storage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class GCSImageService {

    @Autowired
    private Storage storage;

    private final String BUCKET_NAME = "my-springboot-bucket";

    public String uploadImage(MultipartFile file) throws IOException {
        String fileName = file.getOriginalFilename();
        BlobId blobId = BlobId.of(BUCKET_NAME, fileName);
        BlobInfo blobInfo = BlobInfo.newBuilder(blobId).setContentType(file.getContentType()).build();
        storage.create(blobInfo, file.getBytes());
        return String.format("https://storage.googleapis.com/%s/%s", BUCKET_NAME, fileName);
    }

    public byte[] downloadImage(String fileName) {
        Blob blob = storage.get(BlobId.of(BUCKET_NAME, fileName));
        return blob != null ? blob.getContent() : null;
    }
}

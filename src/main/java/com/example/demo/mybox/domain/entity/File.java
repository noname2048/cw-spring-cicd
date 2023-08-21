package com.example.demo.mybox.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Entity
@Data
public class File {

    @Id @GeneratedValue()
    private UUID uuid;

    private String name;

    private boolean isDir;

    private Long storageId;

    private Date createdAt;

    private Date uploadedAt;

    private String path;
}

package com.example.demo.user.domain.entity;

//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.Id;

import java.util.Date;

public class User {

//    @Id
//    @GeneratedValue
    private Long id;

    private String usernae;

    private String hashedPassword;

    private Date joinedAt;
}

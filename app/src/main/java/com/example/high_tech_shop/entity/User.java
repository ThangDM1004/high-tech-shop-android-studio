package com.example.high_tech_shop.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String email;
    private String phone;
    private String image;
    private String dob;
    private boolean status;
    private String password;
    private String fullName;


}


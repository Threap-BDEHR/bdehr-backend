package com.bdehr.backend.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="hospital_table")
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="password")
    private String password;
    @Column(name="auth_password")
    private String apassword;
    @Column(name="dob")
    private String dob;
    @Column(name="longitude")
    private String longitude;
    @Column(name="latitude")
    private String latitude;
    @Column(name="photo")
    private String photo;
    @Column(name="phone")
    private String phone;
    @Column(name="email")
    private String email;

    public Hospital(String name, String password, String apassword,String dob, String longitude, String latitude, String photo, String phone,String email) {
        this.name = name;
        this.password = password;
        this.apassword = apassword;
        this.dob = dob;
        this.longitude = longitude;
        this.latitude = latitude;
        this.photo = photo;
        this.phone = phone;
        this.email = email;
    }

    public Hospital(String name, String password, String apassword,String dob, String longitude, String latitude, String phone,String email) {
        this.name = name;
        this.password = password;
        this.apassword = apassword;
        this.dob = dob;
        this.longitude = longitude;
        this.latitude = latitude;
        this.phone = phone;
        this.email = email;
    }

}

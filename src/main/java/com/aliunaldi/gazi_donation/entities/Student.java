package com.aliunaldi.gazi_donation.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private String studentNumber;
    private String faculty;
    private String department;
    private String phone;
    private String address;
    private String iban;
}

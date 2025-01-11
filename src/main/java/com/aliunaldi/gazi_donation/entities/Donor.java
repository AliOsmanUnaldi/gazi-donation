package com.aliunaldi.gazi_donation.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Table(name = "donors")
@Entity
@Data
public class Donor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private String phone;
    private String address;
    private BigDecimal donationAmount;
}

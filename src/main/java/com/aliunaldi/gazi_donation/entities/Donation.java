package com.aliunaldi.gazi_donation.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Table(name = "donations")
@Entity
@Data
public class Donation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long studentId;
    private Long donorId;
    private String description;
    private BigDecimal amount;
    private LocalDate createdAt;
    private String status;
}

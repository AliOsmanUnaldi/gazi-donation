package com.aliunaldi.gazi_donation.repository;

import com.aliunaldi.gazi_donation.entities.Donor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonorRepository extends JpaRepository<Donor, Long> {
    Donor findByEmail(String email);
    boolean existsByEmailAndPassword(String email, String password);
}

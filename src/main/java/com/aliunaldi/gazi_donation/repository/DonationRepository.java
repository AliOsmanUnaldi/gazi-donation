package com.aliunaldi.gazi_donation.repository;

import com.aliunaldi.gazi_donation.entities.Donation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonationRepository extends JpaRepository<Donation, Long> {
    Page<Donation> findAllByDonorIdIsNullAndStatusOrderByCreatedAtDesc(String status, Pageable pageable);
    Page<Donation> findAllByDonorIdIsNullAndStatusOrderByCreatedAtAsc(String status, Pageable pageable);
    Page<Donation> findAllByDonorIdOrderByCreatedAt(Long donorId, Pageable pageable);
    Page<Donation> findAllByStatusOrderByAmountDesc(String status, Pageable pageable);
}

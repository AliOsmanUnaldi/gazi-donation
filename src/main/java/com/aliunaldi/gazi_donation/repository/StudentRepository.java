package com.aliunaldi.gazi_donation.repository;

import com.aliunaldi.gazi_donation.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByEmail(String email);
    boolean existByEmail(String email);
    boolean existsByEmailAndPassword(String email, String password);
}

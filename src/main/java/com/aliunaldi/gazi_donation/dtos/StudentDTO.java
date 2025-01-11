package com.aliunaldi.gazi_donation.dtos;

import com.aliunaldi.gazi_donation.entities.Student;

public record StudentDTO(
        Long id,
        String name,
        String surname,
        String email,
        String password,
        String studentNumber,
        String department,
        String faculty,
        String phone,
        String address,
        String iban
) {
}

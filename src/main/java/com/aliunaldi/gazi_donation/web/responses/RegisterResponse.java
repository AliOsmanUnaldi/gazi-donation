package com.aliunaldi.gazi_donation.web.responses;

import com.aliunaldi.gazi_donation.dtos.StudentDTO;

public record RegisterResponse(
        String message,
        boolean success,
        StudentDTO studentDTO
) {
}

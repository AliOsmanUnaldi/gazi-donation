package com.aliunaldi.gazi_donation.web.responses;

public record LoginResponse(
        String message,
        boolean success,
        String token
) {
}

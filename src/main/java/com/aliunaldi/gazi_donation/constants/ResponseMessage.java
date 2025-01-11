package com.aliunaldi.gazi_donation.constants;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ResponseMessage {
    SUCCESS("Success"),
    ERROR("Error"),
    TEST_TOKEN("Test token"),
    STUDENT_REGISTERED("Student registered successfully");

    private final String message;
}

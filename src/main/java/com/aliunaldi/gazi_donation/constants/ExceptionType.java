package com.aliunaldi.gazi_donation.constants;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ExceptionType {
    EMAIL_AND_PASSWORD_NOT_MATCH(1, "Email and password do not match"),
    EMAIL_ALREADY_EXISTS(2, "Email already exists"),
    STUDENT_NOT_EXIST(3, "Student not found");
    private final int code;
    private final String message;
}

package com.aliunaldi.gazi_donation.exceptions;

import com.aliunaldi.gazi_donation.constants.ExceptionType;

public class BusinessException extends RuntimeException {
    public BusinessException(ExceptionType exceptionType) {
        super(exceptionType.getMessage());
    }
}

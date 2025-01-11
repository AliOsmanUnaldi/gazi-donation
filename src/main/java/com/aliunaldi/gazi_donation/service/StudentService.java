package com.aliunaldi.gazi_donation.service;

import com.aliunaldi.gazi_donation.dtos.StudentDTO;
import com.aliunaldi.gazi_donation.web.requests.LoginRequest;
import com.aliunaldi.gazi_donation.web.responses.LoginResponse;
import com.aliunaldi.gazi_donation.web.responses.RegisterResponse;

public interface StudentService {
    RegisterResponse registerStudent(StudentDTO studentDTO);
    LoginResponse loginStudent(LoginRequest LoginRequest);
    StudentDTO getStudentByEmail(String email);
}

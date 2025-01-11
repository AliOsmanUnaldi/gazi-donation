package com.aliunaldi.gazi_donation.web.controllers;

import com.aliunaldi.gazi_donation.service.StudentService;
import com.aliunaldi.gazi_donation.web.requests.LoginRequest;
import com.aliunaldi.gazi_donation.web.responses.LoginResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentsController {
    private final StudentService studentService;

    public StudentsController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest loginRequest) {
        return studentService.loginStudent(loginRequest);
    }
}

package com.aliunaldi.gazi_donation.service;

import com.aliunaldi.gazi_donation.constants.ExceptionType;
import com.aliunaldi.gazi_donation.dtos.StudentDTO;
import com.aliunaldi.gazi_donation.exceptions.BusinessException;
import com.aliunaldi.gazi_donation.repository.StudentRepository;
import com.aliunaldi.gazi_donation.web.requests.LoginRequest;
import com.aliunaldi.gazi_donation.web.responses.LoginResponse;
import com.aliunaldi.gazi_donation.web.responses.RegisterResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

import static com.aliunaldi.gazi_donation.constants.ExceptionType.EMAIL_ALREADY_EXISTS;
import static com.aliunaldi.gazi_donation.constants.ResponseMessage.*;
import static com.aliunaldi.gazi_donation.mappers.Mapper.toStudent;
import static com.aliunaldi.gazi_donation.mappers.Mapper.toStudentDTO;


@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService{
    private final StudentRepository studentRepository;

    @Override
    public RegisterResponse registerStudent(StudentDTO studentDTO) {
        if (studentRepository.existByEmail(studentDTO.email())) {
            return new RegisterResponse(EMAIL_ALREADY_EXISTS.getMessage(), false, null);
        }
        var savedStudent = studentRepository.save(toStudent(studentDTO));
        return new RegisterResponse(STUDENT_REGISTERED.getMessage(), true, toStudentDTO(savedStudent));
    }

    @Override
    public LoginResponse loginStudent(LoginRequest loginRequest) {
        var studentDTO = getStudentByEmail(loginRequest.email());
        try {
            checkIfStudentDTOIsNull(studentDTO);
            checkIfEmailAndPasswordMatch(studentDTO, loginRequest);
        } catch (BusinessException e) {
            return new LoginResponse(e.getMessage(), false, null);
        }
        var exists = studentRepository.existsByEmailAndPassword(loginRequest.email(), loginRequest.password());
        return new LoginResponse(SUCCESS.getMessage(), exists, TEST_TOKEN.getMessage());
    }

    @Override
    public StudentDTO getStudentByEmail(String email) {
        var student = studentRepository.findByEmail(email);
        return toStudentDTO(student);
    }

    private void checkIfStudentDTOIsNull(StudentDTO studentDTO) {
        if (Objects.isNull(studentDTO)) {
            throw new BusinessException(ExceptionType.STUDENT_NOT_EXIST);
        }
    }

    private void checkIfEmailAndPasswordMatch(StudentDTO studentDTO, LoginRequest loginRequest) {
        if (!studentDTO.password().equals(loginRequest.password())) {
            throw new BusinessException(ExceptionType.EMAIL_AND_PASSWORD_NOT_MATCH);
        }
    }
}

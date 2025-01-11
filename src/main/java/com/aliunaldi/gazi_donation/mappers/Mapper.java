package com.aliunaldi.gazi_donation.mappers;

import com.aliunaldi.gazi_donation.dtos.StudentDTO;
import com.aliunaldi.gazi_donation.entities.Student;

public class Mapper {
    public static StudentDTO toStudentDTO(Student student){
        return new StudentDTO(
                student.getId(),
                student.getName(),
                student.getSurname(),
                student.getEmail(),
                student.getPassword(),
                student.getStudentNumber(),
                student.getDepartment(),
                student.getFaculty(),
                student.getPhone(),
                student.getAddress(),
                student.getIban()
        );
    }

    public static Student toStudent(StudentDTO studentDTO){
        var student = new Student();
        student.setId(studentDTO.id());
        student.setName(studentDTO.name());
        student.setSurname(studentDTO.surname());
        student.setEmail(studentDTO.email());
        student.setPassword(studentDTO.password());
        student.setStudentNumber(studentDTO.studentNumber());
        student.setDepartment(studentDTO.department());
        student.setFaculty(studentDTO.faculty());
        student.setPhone(studentDTO.phone());
        student.setAddress(studentDTO.address());
        student.setIban(studentDTO.iban());
        return student;
    }
}

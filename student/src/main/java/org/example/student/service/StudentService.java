package org.example.student.service;

import org.example.student.dto.StudentDTO;

import java.util.Date;
import java.util.List;

public interface StudentService {
    List<StudentDTO> getStudentByDateNaissance(Date dateNaissance);
    StudentDTO saveStudent(StudentDTO studentDTO);
    List<StudentDTO> saveStudents(List<StudentDTO> studentsDTO);
//    public List<StudentDTO> getAllStudent();
}

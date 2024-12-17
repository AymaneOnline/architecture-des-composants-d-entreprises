package org.example.student.web;

import lombok.AllArgsConstructor;
import org.example.student.dto.StudentDTO;
import org.example.student.service.StudentService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Date;
import java.util.List;

@Controller
@AllArgsConstructor
public class StudentGraphQLController {
    private StudentService studentService;

    @MutationMapping
    public StudentDTO saveStudent(@Argument StudentDTO studentDTO) {
        if (studentDTO == null) {
            throw new IllegalArgumentException("L'étudiant ne peut pas être null");
        }
        return studentService.saveStudent(studentDTO);
    }

    @QueryMapping
    public List<StudentDTO> getStudentByDateNaissance(@Argument @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateNaissance) {
        return studentService.getStudentByDateNaissance(dateNaissance);
    }
}

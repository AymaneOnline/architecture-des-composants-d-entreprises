package org.example.student.service;

import lombok.AllArgsConstructor;
import org.example.student.dao.entities.Student;
import org.example.student.dao.repositories.StudentRepository;
import org.example.student.dto.StudentDTO;
import org.example.student.mapper.StudentMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class StudentManager implements StudentService {

    private StudentMapper studentMapper;
    private StudentRepository studentRepository;

    @Override
    public List<StudentDTO> getStudentByDateNaissance(Date dateNaissance) {
        List<Student> students = studentRepository.findByDateNaissance(dateNaissance);
        List<StudentDTO> studentsDTO = new ArrayList<>();
        for (Student student : students) {
            studentsDTO.add(studentMapper.toStudentDTO(student));
        }
        return studentsDTO;
    }

    @Override
    public StudentDTO saveStudent(StudentDTO studentDTO) {
        Student student = studentMapper.toStudent(studentDTO);
        student = studentRepository.save(student);
        return studentMapper.toStudentDTO(student);
    }

    @Override
    public List<StudentDTO> saveStudents(List<StudentDTO> studentsDTO) {

        List<Student> students = new ArrayList<>();
        for (StudentDTO studentDTO : studentsDTO) {
            students.add(studentMapper.toStudent(studentDTO));
        }

        students = studentRepository.saveAll(students);

        studentsDTO = new ArrayList<>();
        for (Student student : students) {
            studentsDTO.add(studentMapper.toStudentDTO(student));
        }
        return studentsDTO;
    }
}

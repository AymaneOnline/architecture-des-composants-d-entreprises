package org.example.student.dao.repositories;

import org.example.student.dao.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    public List<Student> findByDateNaissance(Date dateNaissance);
}

package org.example.student;

import org.example.student.dto.StudentDTO;
import org.example.student.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class StudentApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentApplication.class, args);
    }

    @Bean
    CommandLineRunner start(StudentService studentService) {
        return args -> {
            studentService.saveStudents(
                    List.of(
                            StudentDTO.builder().name("aymane1").email("aymane1@example.com").dateNaissance(new Date()).build(),
                            StudentDTO.builder().name("aymane2").email("aymane2@example.com").dateNaissance(new Date()).build(),
                            StudentDTO.builder().name("aymane3").email("aymane3@example.com").dateNaissance(new Date()).build(),
                            StudentDTO.builder().name("aymane4").email("aymane4@example.com").dateNaissance(new Date()).build()
                    )
            );
        };
    }
}

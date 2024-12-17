package org.example.student.dto;

import lombok.*;
import org.example.student.dao.entities.Student;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class StudentDTO {
    private String name;
    private String email;
    private Date dateNaissance;
}

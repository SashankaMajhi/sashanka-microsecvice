package com.example.student.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student")
public class Student {

    @Id
    private String id;
    private String name;
    private int age;
    private String gender;
    private Integer schoolId;

}

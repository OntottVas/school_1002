package com.example.school_1002.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "class")
public class SchoolClass {
    @Id
    private Long id;
    private String name;
    private String teacher;

    @OneToMany(mappedBy = "schoolClass")
    @JsonManagedReference
    private List<Student> students;


}

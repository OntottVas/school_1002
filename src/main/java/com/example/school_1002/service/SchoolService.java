package com.example.school_1002.service;

import com.example.school_1002.model.SchoolClass;
import com.example.school_1002.model.Student;
import com.example.school_1002.repository.SchoolClassRepository;
import com.example.school_1002.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SchoolService {

    private SchoolClassRepository schoolClassRepository;
    private StudentRepository studentRepository;

    public List<SchoolClass> getAllClasses() {
        return schoolClassRepository.findAll();
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}

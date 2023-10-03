package com.example.school_1002.controller;

import com.example.school_1002.model.SchoolClass;
import com.example.school_1002.model.Student;
import com.example.school_1002.service.SchoolService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class SchoolController {
    private SchoolService schoolService;

    @GetMapping("/classes")
    public List<SchoolClass> getAllClasses() {
        return schoolService.getAllClasses();
    }

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return schoolService.getAllStudents();
    }


}

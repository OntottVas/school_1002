package com.example.school_1002.repository;

import com.example.school_1002.model.SchoolClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.*;

@Repository
public interface SchoolClassRepository extends JpaRepository<SchoolClass,Long> {
}

package com.example.demo.repo;

import com.example.demo.data.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepository extends JpaRepository<Faculty, Integer> {
}
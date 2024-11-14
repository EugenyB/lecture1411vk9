package com.example.demo.service;

import com.example.demo.data.Faculty;
import com.example.demo.repo.FacultyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class FacultyService {

    private final FacultyRepository facultyRepository;

    public List<Faculty> getList() {
        return facultyRepository.findAll();
    }

    public void addFaculty(String faculty) {
        Faculty f = new Faculty();
        f.setName(faculty);
        facultyRepository.save(f);
    }
}

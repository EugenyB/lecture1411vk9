package com.example.demo.controller;

import com.example.demo.data.Faculty;
import com.example.demo.service.FacultyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class FacultyController {

    private final FacultyService facultyService;

    @GetMapping("/faculties")
    public String getFaculties(Model model) {
        model.addAttribute("faculties", facultyService.getList());
        return "faculties";
    }

    @PostMapping("/add_faculty")
    public String addFaculty(@RequestParam String faculty) {
        facultyService.addFaculty(faculty);
        return "redirect:/faculties";
    }
}


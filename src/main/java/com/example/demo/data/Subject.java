package com.example.demo.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "subject")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "title", nullable = false, length = 150)
    private String title;

    @Column(name = "length")
    private Integer length;

    @ManyToMany(mappedBy = "subjects")
    private Set<Teacher> teachers = new LinkedHashSet<>();

}
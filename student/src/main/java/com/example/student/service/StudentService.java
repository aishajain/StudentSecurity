package com.example.student.service;

import java.util.List;

import com.example.student.entities.Student;

public interface StudentService {
	Student save(Student student);
	List<Student> getAll();
	Student findById(Integer id);
}

package com.example.student.service;

import java.util.List;

import com.example.student.entities.Project;

public interface ProjectService {
	Project save(Project project);

	List<Project> getAll();
}

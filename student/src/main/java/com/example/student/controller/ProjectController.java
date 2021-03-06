package com.example.student.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.entities.Project;
import com.example.student.repository.ProjectRepository;
import com.example.student.service.ProjectService;

@CrossOrigin
@RestController
public class ProjectController {
	@Autowired
	private ProjectService projectService;

	@PostMapping(value = "/project")
	public Project saveuser(@RequestBody @Valid Project project) {
		return projectService.save(project);
	}

	@GetMapping(value = "/project/all")
	public List<Project> getUser() {
		return projectService.getAll();
	}
}

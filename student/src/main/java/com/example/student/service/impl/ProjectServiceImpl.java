package com.example.student.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student.entities.Project;
import com.example.student.repository.ProjectRepository;
import com.example.student.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectRepository projectRepository;

	@Override
	public Project save(Project project) {
		return projectRepository.save(project);
	}

	@Override
	public List<Project> getAll() {
		return projectRepository.findAll();
	}

}

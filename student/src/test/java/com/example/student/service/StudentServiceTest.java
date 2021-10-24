package com.example.student.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.student.repository.StudentRepository;
import com.example.student.service.impl.StudentServiceImpl;

@ExtendWith(MockitoExtension.class)
public class StudentServiceTest {

	@Mock
	private StudentRepository studentRepository;

	@InjectMocks
	private StudentServiceImpl studentService;

	@Test
	void testSave() {

	}

	@Test
	void testStudentById() {

	}

	@Test
	void testGetAll() {

	}

}

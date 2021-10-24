package com.example.student.service;

import com.example.student.entities.SystemUser;

public interface UserService {
	SystemUser save(SystemUser user);

	SystemUser getUserByName(String name);

}

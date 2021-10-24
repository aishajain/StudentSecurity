package com.example.student.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.student.config.SystemUserDetail;
import com.example.student.entities.SystemUser;
import com.example.student.repository.SystemUserRepository;
import com.example.student.service.UserService;

@Service
public class UserServiceImpl implements UserDetailsService, UserService {

	@Autowired
	private SystemUserRepository systemUserRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		SystemUser user = systemUserRepository.findByUsername(username);

		if (user == null) {
			throw new UsernameNotFoundException("Could not find user");
		}

		return new SystemUserDetail(user);
	}

	@Override
	public SystemUser save(SystemUser user) {
		return systemUserRepository.save(user);
	}

	@Override
	public SystemUser getUserByName(String name) {
		return systemUserRepository.findByUsername(name);
	}
}
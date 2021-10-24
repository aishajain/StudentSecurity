package com.example.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.student.entities.SystemUser;

@Repository
public interface SystemUserRepository extends JpaRepository<SystemUser, Integer> {
	SystemUser findByUsername(String userName);
}

package com.ajaxdev.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajaxdev.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
	
}

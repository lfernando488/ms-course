package com.ajaxdev.hroauth.services;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajaxdev.hroauth.entities.User;
import com.ajaxdev.hroauth.feignclients.UserFeignClient;

@Service
public class UserService {

	Logger logger = org.slf4j.LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private UserFeignClient userFeignClient;
	
	public User findByEmail(String email){
		User user = userFeignClient.findByEmail(email).getBody();
		if(user == null) {
			logger.error("Email " + email + " not found!");
			throw new IllegalArgumentException("Email not found");
		}
		return user;
	}
	
}

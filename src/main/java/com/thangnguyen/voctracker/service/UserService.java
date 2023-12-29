package com.thangnguyen.voctracker.service;

import org.springframework.stereotype.Service;

import com.thangnguyen.voctracker.bean.User;
import com.thangnguyen.voctracker.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	
	private final UserRepository userRepository;
	
	public User createUser(User user) {
		return userRepository.save(user);
	}
	

}

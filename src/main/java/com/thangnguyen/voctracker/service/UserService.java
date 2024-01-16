package com.thangnguyen.voctracker.service;

import org.springframework.stereotype.Service;

import com.thangnguyen.voctracker.bean.AppUser;
import com.thangnguyen.voctracker.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	
	private final UserRepository userRepository;
	
	public AppUser createUser(AppUser appUser) {
		return userRepository.save(appUser);
	}

}

package com.thangnguyen.voctracker.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thangnguyen.voctracker.bean.User;
import com.thangnguyen.voctracker.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {

	private final UserService userService;
	
	@PostMapping("/user")
	public User createUser (@RequestBody User user) {
		return userService.createUser(user);
	}
	
}

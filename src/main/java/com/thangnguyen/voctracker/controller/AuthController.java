package com.thangnguyen.voctracker.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.thangnguyen.voctracker.bean.AppUser;
import com.thangnguyen.voctracker.service.TokenService;

@RestController
@RequestMapping("/auth")
public class AuthController {

	private static final Logger LOG = LoggerFactory.getLogger(AuthController.class);

	
	private final TokenService tokenService;
//	private final UserService userService;
//	
//	public AuthController(UserService userService) {
//		this.userService = userService;
//	}
	
	public AuthController(TokenService  tokenService)  {
		this.tokenService = tokenService;
	}
	
	@PostMapping("token")
	public String token(Authentication authentication) {
		LOG.debug("Token requested for user: '{}'", authentication.getName());
		String  token = tokenService.generateToken(authentication);
		LOG.debug("Token granted {}",  token);
		return token;
	}
	
//	@PostMapping("/register")
//	public AppUser registerUser(@RequestBody AppUser user  ) {
//		return userService.createUser(user);
//	}
}

package com.springboot.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.entity.User;
import com.springboot.demo.services.*;

@RestController
@RequestMapping("/user-api")
public class UserController {
	@Autowired
	private UserService userService;

	// Get all users
	@GetMapping("/users")
	public List<User> getAllUsers() {
		return this.userService.getAllUsers();
	}

	// Get single user
	@GetMapping("/users/{username}")
	public User getUser(@PathVariable("username") String username) {
		return this.userService.getUser(username);
	}

	// Insert user
	@PostMapping("/users")
	public User insertUser(@RequestBody User user) {
		return this.userService.insertUser(user);
	}

}
package com.zensarspringbootdemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensarspringbootdemo.entity.Details;
import com.zensarspringbootdemo.service.UserService;

@RestController
//@RequestMapping(value = "/run-api", produces = { MediaType.APPLICATION_JSON_VALUE,
// MediaType.APPLICATION_XML_VALUE }, consumes = {
// MediaType.APPLICATION_JSON_VALUE,
// MediaType.APPLICATION_XML_VALUE })//*
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("/run1")
	public Details getDetails(@PathVariable("userId") int userId) {

		return userService.getDetails(userId);
	}

	@GetMapping("/getAlldata")
	public List<Details> getAllDetails() {
		List<Details> list = new ArrayList<Details>();
		list = userService.getAllDetails();
		
		return list;
	}

	@PostMapping
	public Details addDetails(@RequestBody Details details) {
		return userService.insertDetails(details);
	}

	@DeleteMapping
	public Details deleteDetails(@PathVariable("userId") int userId) {

		return userService.deleteDetails(userId);
	}
}

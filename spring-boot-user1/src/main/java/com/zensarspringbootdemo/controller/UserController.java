package com.zensarspringbootdemo.controller;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.repository.UserRepository;
import com.zensarspringbootdemo.entity.Address;
import com.zensarspringbootdemo.entity.Details;
import com.zensarspringbootdemo.entity.PC;
import com.zensarspringbootdemo.entity.Status;

@RestController
@RequestMapping(value = "/run-api", produces = { MediaType.APPLICATION_JSON_VALUE,
		MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
				MediaType.APPLICATION_XML_VALUE })
public class UserController {
	@Autowired
	private UserRepository userRepository;

	@GetMapping("/run")
	public String getDetails() {
		Details details = new Details(46186, "Ashish");

		return "details";
	}
}

package com.zensarspringbootdemo.controller;

import java.util.ArrayList;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zensarspringbootdemo.entity.Details;
import com.zensarspringbootdemo.service.UserService;

@RestController
@RequestMapping
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("/home")
	public String home() {
		return "home";
	}

	@GetMapping("/getAlldata")
	public List<Details> getAllDetails() {
		List<Details> list = new ArrayList<Details>();
		list = userService.getAllDetails();
		return list;
	}

	@GetMapping("/getAlldata/{userId}")
	public Details getDetails(@PathVariable("userId") Integer userId) {
		System.out.println("controller" + userId);

		return userService.getDetails(userId);
	}

	@PostMapping("/getAlldata")
	public Details addDetails(@RequestBody Details details) {

		return this.userService.addDetails(details);
	}

	@PutMapping("/getAlldata")
	public Details updateDetails(@RequestBody Details details) {

		return userService.updateDetails(details);
	}

	// Delete operation
	@DeleteMapping("/getAlldata/{userId}")
	public ResponseEntity<String> deleteDetails(@PathVariable("userId") int userId) {
		userService.deleteDetails(userId);
		return new ResponseEntity<String>("delete details", HttpStatus.OK);
	}

}

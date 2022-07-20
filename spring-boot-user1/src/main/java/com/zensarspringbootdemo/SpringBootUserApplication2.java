package com.zensarspringbootdemo;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

@SpringBootApplication
public class SpringBootUserApplication2 {

	@Autowired
	private User user;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootUserApplication2.class, args);
		System.out.println("hiii");
	}

	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}

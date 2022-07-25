package com.zensarspringbootdemo.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.zensarspringbootdemo.entity.Details;

public interface UserService {

	public List<Details> getAllDetails();

	public Details addDetails(Details details);

	public Details updateDetails(Details details);

	public Details getDetails(Integer userId);

	void deleteDetails(int userId);

}

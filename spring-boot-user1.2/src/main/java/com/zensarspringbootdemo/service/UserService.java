package com.zensarspringbootdemo.service;

import java.util.List;

import com.zensarspringbootdemo.entity.Details;

public interface UserService {

	public Details getDetails(int userId);

	public List<Details> getAllDetails();

	public Details deleteDetails(int userId);

	public Details insertDetails(Details details);

}

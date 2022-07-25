package com.zensarspringbootdemo.service;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.zensarspringbootdemo.entity.Details;
import com.zensarspringbootdemo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<Details> getAllDetails() {
		List<Details> list = new ArrayList<Details>();
		list = userRepository.findAll();
		System.out.println("impl " + list);

		return list;
	}

	// getbydata
	@Override
	public Details getDetails(Integer userId) {
		System.out.println("hlo" + userId);
		Optional<Details> details = userRepository.findById(userId);

		return details.isPresent() ? details.get() : null;
	}

	// post
	@Override
	public Details addDetails(Details details) {
		userRepository.save(details);
		return details;
	}

	@Override
	public Details updateDetails(Details details) {
		userRepository.save(details);
		return details;
	}

	@Override
	public void deleteDetails(int userId) {
		userRepository.deleteById(userId);

	}

}

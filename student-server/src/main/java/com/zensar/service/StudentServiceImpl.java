package com.zensar.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zensar.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return student;
	}

	@Override
	public List<Student> fetchStudentList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student updateStudent(Student student, Long studentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteStudentById(Long studentId) {
		// TODO Auto-generated method stub

	}

}
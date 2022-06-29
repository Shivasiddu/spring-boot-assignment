package com.zensar.service;

import java.util.List;

import com.zensar.entity.Student;

public interface StudentService {

	// Save operation
	Student saveStudent(Student student);

	// Read operation
	List<Student> fetchStudentList();

	// Update operation
	Student updateStudent(Student student, Long studentId);

	// Delete operation
	void deleteStudentById(Long studentId);

}
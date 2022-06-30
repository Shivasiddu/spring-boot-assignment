package com.zensar.jdbc.dto;

import java.util.List;

import com.zensar.jdbc.entity.Student;

public interface StudentDto {

	public Student getStudent(int StudentId);

	public List<Student> getAllStudents();

	public int insertStudent(Student student);

	public int updateStudent(Student student);

	public int deleteStudent(int StudentId);

}
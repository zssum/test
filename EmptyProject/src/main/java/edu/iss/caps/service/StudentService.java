package edu.iss.caps.service;

import java.util.ArrayList;

import edu.iss.caps.model.StudentDetails;

public interface StudentService {
	StudentDetails findStudentById(String studentId);

	ArrayList<StudentDetails> findAllStudents();

	StudentDetails createStduent(StudentDetails student);

	StudentDetails changeStudent(StudentDetails student);

	void removeStudent(StudentDetails student);


}

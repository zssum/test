package edu.iss.caps.service;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import edu.iss.caps.model.StudentDetails;
import edu.iss.caps.repository.StudentDetailsRepository;


@Service
public class StudentServiceImpl implements StudentService{
	
	@Resource
	private StudentDetailsRepository sdRepository;

	@Override
	public StudentDetails findStudentById(String studentId) {
		// TODO Auto-generated method stub
		return sdRepository.findOne(studentId);
	}

	@Override
	public ArrayList<StudentDetails> findAllStudents() {
		// TODO Auto-generated method stub
	    ArrayList<StudentDetails> studentList=(ArrayList<StudentDetails>)sdRepository.findAll();
		return studentList;
	}

	@Override
	public StudentDetails createStduent(StudentDetails student) {
		// TODO Auto-generated method stub
		return sdRepository.saveAndFlush(student);
	}

	@Override
	public StudentDetails changeStudent(StudentDetails student) {
		// TODO Auto-generated method stub
		return sdRepository.saveAndFlush(student);
	}

	@Override
	public void removeStudent(StudentDetails student) {
		// TODO Auto-generated method stub
		sdRepository.delete(student);
	}

}

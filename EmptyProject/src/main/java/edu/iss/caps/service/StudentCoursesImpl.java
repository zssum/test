package edu.iss.caps.service;

import java.util.ArrayList;

import edu.iss.caps.model.StudentCourses;
import edu.iss.caps.repository.StudentCoursesRepository;

public class StudentCoursesImpl implements StudentCoursesService {
	
	private StudentCoursesRepository scRepository;

	@Override
	public StudentCourses findCourseAttending(String studentId) {
		// TODO Auto-generated method stub
		return scRepository.findOne(studentId);
	}

	@Override
	public ArrayList<StudentCourses> findAllCoursesAttending() {
		// TODO Auto-generated method stub
		ArrayList<StudentCourses> scList = (ArrayList<StudentCourses>)scRepository.findAll();
		return scList;
	}

	@Override
	public void enrollCourse(String studentId, int courseId) {
		// TODO Auto-generated method stub
		scRepository.enrollCourse(studentId, courseId);
	}

	@Override
	public void removeCourse(String studentId, int courseId) {
		// TODO Auto-generated method stub
		scRepository.deleteCoursebyStudentID(studentId,courseId);
		
	}

	@Override
	public String getGrades(String studentId, int courseId) {
		// TODO Auto-generated method stub
		return scRepository.getGrades(studentId, courseId);
	}

	@Override
	public StudentCourses calcGPA(String studentId) {
		// TODO Auto-generated method stub
		return scRepository.findOne(studentId);
	}

	@Override
	public int getEarnedCredit(String studentId, int courseId) {
		// TODO Auto-generated method stub
		return scRepository.getEarnedCredit(studentId,courseId);
	}

}

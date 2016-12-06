package edu.iss.caps.service;

import java.util.ArrayList;


import edu.iss.caps.model.StudentCourses;

public interface StudentCoursesService {
	
	StudentCourses findCourseAttending(String studentId);

	ArrayList<StudentCourses> findAllCoursesAttending();

	void enrollCourse(String studentId, int courseId);

	//StudentCourses editCourse(StudentCourses student);

	void removeCourse(String studentId, int courseId);
	
	String getGrades(String studentId, int courseId);

	StudentCourses calcGPA(String studentId);
	
	int getEarnedCredit(String studentId, int courseId);

}

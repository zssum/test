package edu.iss.caps.service;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.data.jpa.repository.Temporal;

import edu.iss.caps.model.Courses;

public interface CourseService {
	
	ArrayList<Courses> findAllCourses();

	Courses findCourse(int courseId);
	
	Courses createCourse(Courses course);

	Courses changeCourse(Courses course);

	void removeCourse(Courses course);
	
	
}

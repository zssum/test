package edu.iss.caps.service;

import java.sql.Date;
import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.iss.caps.model.Courses;
import edu.iss.caps.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Resource
	private CourseRepository cr;
	
	@Override
	@Transactional
	public ArrayList<Courses> findAllCourses() {
		ArrayList<Courses> l = (ArrayList<Courses>) cr.findAll();
		return l;
	}

	@Override
	public Courses findCourse(int courseId) {
		// TODO Auto-generated method stub
		return cr.findOne(courseId);
	}
	
	@Override
	public Courses createCourse(Courses course) {
		// TODO Auto-generated method stub
		return cr.saveAndFlush(course);
	}

	@Override
	public Courses changeCourse(Courses course) {
		// TODO Auto-generated method stub
		return cr.saveAndFlush(course);
	}

	@Override
	public void removeCourse(Courses course) {
		// TODO Auto-generated method stub
		 cr.delete(course);
	}

	
}

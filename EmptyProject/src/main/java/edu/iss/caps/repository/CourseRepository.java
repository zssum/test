package edu.iss.caps.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import edu.iss.caps.model.Courses;

public interface CourseRepository extends JpaRepository <Courses, Integer>{

}

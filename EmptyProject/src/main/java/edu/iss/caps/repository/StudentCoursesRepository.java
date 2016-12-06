package edu.iss.caps.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import edu.iss.caps.model.Courses;
import edu.iss.caps.model.StudentCourses;

public interface StudentCoursesRepository extends JpaRepository<StudentCourses, String>{

	@Query("SELECT sc from studentcourses sc WHERE sc.studentId = :sid AND sc.courseid = :cid")
	ArrayList<Courses> findCoursesBySID(@Param("sid") String StudentID, @Param("cid") int cid);
	
	@Query("SELECT sc.grade from studentcourses sc WHERE sc.studentId = :sid AND sc.courseid = :cid")
	String getGrades(@Param("sid") String StudentID, @Param("cid") int cid);
	
	@Query("insert into studentcourses (studentid, courseid) VALUES (?1, ?2)")
	void enrollCourse(String studentid, int courseid);
	
	@Query("SELECT sc.credits from studentcourses sc WHERE sc.studentId = :sid AND sc.courseid = :cid")
	int getEarnedCredit(@Param("sid") String sid, @Param("cid") int cid);
	
	@Modifying
	@Transactional
	@Query(value="delete from studentcourses c where c.studentid = ?1 AND c.courseid = ?2")
	void deleteCoursebyStudentID(String StudentID, int courseid);
	
	
}

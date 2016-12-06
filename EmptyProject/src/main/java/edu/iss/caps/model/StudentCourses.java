package edu.iss.caps.model;


import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "StudentCourses")

public class StudentCourses {
	@Id
	@Column(name = "StudentId")
	private String studentId;
	@Basic(optional = false)
	@Id
	@Column(name = "CourseId")
	private int courseId;
	@Column(name = "Grade")
	private String grade;
	@Column(name = "EarnedCredit")
	private int earnedCredit;

	@OneToOne Courses courses;
	
	@OneToOne StudentDetails studentDetails;
	
	public StudentCourses(){
		
	}

	public StudentCourses(String studentId, int courseId, String grade, int earnedCredit, Courses courses,
			StudentDetails studentDetails) {
		super();
		this.studentId = studentId;
		this.courseId = courseId;
		this.grade = grade;
		this.earnedCredit = earnedCredit;
		this.courses = courses;
		this.studentDetails = studentDetails;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getEarnedCredit() {
		return earnedCredit;
	}

	public void setEarnedCredit(int earnedCredit) {
		this.earnedCredit = earnedCredit;
	}

	public Courses getCourses() {
		return courses;
	}

	public void setCourses(Courses courses) {
		this.courses = courses;
	}

	public StudentDetails getStudentDetails() {
		return studentDetails;
	}

	public void setStudentDetails(StudentDetails studentDetails) {
		this.studentDetails = studentDetails;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + courseId;
		result = prime * result + ((studentId == null) ? 0 : studentId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentCourses other = (StudentCourses) obj;
		if (courseId != other.courseId)
			return false;
		if (studentId == null) {
			if (other.studentId != null)
				return false;
		} else if (!studentId.equals(other.studentId))
			return false;
		return true;
	}

	
	
}

package edu.iss.caps.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import edu.iss.caps.model.Courses;

@Entity
@Table(name = "LecturerDetails")
public class LecturerDetails {

	@Id
	@Column(name = "LecturerId")
	private String lecturerId;
	@Basic(optional = false)
	@Column(name = "FirstName")
	private String firstName;
	@Column(name = "LastName")
	private String lastName;

//	@OneToMany
//	List<Courses> course = new ArrayList<Courses>();

	@OneToOne
	User user;

	public LecturerDetails() {

	}

	public LecturerDetails(String lecturerId, String firstName, String lastName) {
		super();
		this.lecturerId = lecturerId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getLecturerId() {
		return lecturerId;
	}

	public void setLecturerId(String lecturerId) {
		this.lecturerId = lecturerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lecturerId == null) ? 0 : lecturerId.hashCode());
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
		LecturerDetails other = (LecturerDetails) obj;
		if (lecturerId == null) {
			if (other.lecturerId != null)
				return false;
		} else if (!lecturerId.equals(other.lecturerId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "LecturerDetails [lecturerId=" + lecturerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", user=" + user + "]";
	}

	
	

}

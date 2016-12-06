package edu.iss.caps.service;

import java.util.ArrayList;

import edu.iss.caps.model.LecturerDetails;

public interface LecturerService {


	LecturerDetails findLecturerById(String lecturerId);

	ArrayList<LecturerDetails> findAllLecturers();

	LecturerDetails findLecturerByFirstName(String firstName);

	LecturerDetails createLecturer(LecturerDetails lecturer);

	LecturerDetails changeLecturer(LecturerDetails lecturer);

	void removeLecturer(LecturerDetails lecturer);
	

}

package edu.iss.caps.service;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.iss.caps.model.LecturerDetails;
import edu.iss.caps.repository.LecturerDetailsRepository;

@Service
public class LecturerServiceImpl implements LecturerService{

	@Resource
	private LecturerDetailsRepository ldRepository;
	
	@Override
	public LecturerDetails findLecturerById(String lecturerId) {
		// TODO Auto-generated method stub
		return ldRepository.findOne(lecturerId);
	}

	@Override
	@Transactional
	public ArrayList<LecturerDetails> findAllLecturers() {
		// TODO Auto-generated method stub
		ArrayList<LecturerDetails> lecList=(ArrayList<LecturerDetails>) ldRepository.findAll();
		return lecList;
	}

	@Override
	public LecturerDetails findLecturerByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return ldRepository.findOne(firstName);
	}

	@Override
	public LecturerDetails createLecturer(LecturerDetails lecturer) {
		// TODO Auto-generated method stub
		return ldRepository.saveAndFlush(lecturer);
	}

	@Override
	public LecturerDetails changeLecturer(LecturerDetails lecturer) {
		// TODO Auto-generated method stub
		return ldRepository.saveAndFlush(lecturer);
	}

	@Override
	public void removeLecturer(LecturerDetails lecturer) {
		// TODO Auto-generated method stub
		ldRepository.delete(lecturer);
	}


}

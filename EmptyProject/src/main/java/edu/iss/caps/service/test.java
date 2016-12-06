package edu.iss.caps.service;

import java.util.ArrayList;

import edu.iss.caps.model.LecturerDetails;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LecturerServiceImpl dd = new LecturerServiceImpl();
		ArrayList<LecturerDetails> list = dd.findAllLecturers();
		for (LecturerDetails ldetails : list)
			ldetails.toString();

	}

}

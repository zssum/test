package edu.iss.caps.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.iss.caps.model.StudentDetails;

public interface StudentDetailsRepository extends JpaRepository<StudentDetails, String>{

}

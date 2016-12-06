package edu.iss.caps.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.iss.caps.model.User;

public interface UserRepository extends JpaRepository<User, String>{

}

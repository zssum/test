package edu.iss.caps.service;

import java.util.ArrayList;

import edu.iss.caps.model.User;

public interface UserService {
	
	User findUserById(String userId);
	
	User findUserByRole(String role);

	ArrayList<User> findAllUsers();

	User createUser(User user);

	User editUser(User user);

	void removeUser(User user);


}

package edu.iss.caps.service;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import edu.iss.caps.model.User;
import edu.iss.caps.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Resource
	private UserRepository uRepository;

	@Override
	public User findUserById(String userId) {
		// TODO Auto-generated method stub
		return uRepository.findOne(userId);
	}

	@Override
	public User findUserByRole(String role) {
		// TODO Auto-generated method stub
		return uRepository.findOne(role);
	}

	@Override
	public ArrayList<User> findAllUsers() {
		// TODO Auto-generated method stub
		ArrayList<User> uList = (ArrayList<User>)uRepository.findAll();
		return uList;
	}

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return uRepository.saveAndFlush(user);
	}

	@Override
	public User editUser(User user) {
		// TODO Auto-generated method stub
		return uRepository.saveAndFlush(user);
	}

	@Override
	public void removeUser(User user) {
		// TODO Auto-generated method stub
		uRepository.delete(user);
	}



}

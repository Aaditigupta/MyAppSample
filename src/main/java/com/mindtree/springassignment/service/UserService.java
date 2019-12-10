package com.mindtree.springassignment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.springassignment.entity.User;
import com.mindtree.springassignment.repository.UserRepository;

@Service
public class UserService implements UserI {
	@Autowired
	UserRepository userrepo;

	@Override
	public void registerAllUsers(User user) {
		// TODO Auto-generated method stub
		userrepo.save(user);
	}

	@Override
	public void deleteRecordInDb(int userId) {
		userrepo.deleteById(userId);
	}


}

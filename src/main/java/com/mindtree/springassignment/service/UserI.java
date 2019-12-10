package com.mindtree.springassignment.service;

import com.mindtree.springassignment.entity.User;

public interface UserI {

	//void registerAllUsers(int id, String name, String email);

	void registerAllUsers(User user);

	void deleteRecordInDb(int id);


}

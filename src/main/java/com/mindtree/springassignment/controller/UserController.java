package com.mindtree.springassignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mindtree.springassignment.entity.User;
import com.mindtree.springassignment.service.UserI;

@Controller
public class UserController {
	@Autowired
	UserI service;

	@RequestMapping("/")
	public String getIndexPage() {
		return "Index";
	}
	
	@PostMapping("/postData")
	public String registerUsers(User user) {
		service.registerAllUsers(user);
		return "Index";		
	}
	
	@PostMapping("/deletedata")
	public String deleteRecord(int userId) {		
	//	System.out.println(userId);
    	service.deleteRecordInDb(userId);
		return "Index";
	}
}

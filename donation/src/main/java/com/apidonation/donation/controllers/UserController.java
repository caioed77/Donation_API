package com.apidonation.donation.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apidonation.donation.entities.User;
import com.apidonation.donation.services.UserServices;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	private UserServices userservice;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User> list = userservice.findAll();
		return ResponseEntity.ok().body(list);
		
	}
	
	
	@GetMapping(value = "/{id}")
	public User findById(@PathVariable Long id) {
		User result = userservice.findById(id);
		return result;
	
	}
}

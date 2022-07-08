package com.apidonation.donation.services;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apidonation.donation.entities.User;
import com.apidonation.donation.repository.UserRepository;


@Service
public class UserServices {
	
	
	
	@Autowired
	private UserRepository repository;
	
	@Transactional
	public List<User> findAll() {
		return repository.findAll();
		
	}
	
	@Transactional
	public User findById(Long id) {
		User result = repository.findById(id).get();
		return result;
	}
}

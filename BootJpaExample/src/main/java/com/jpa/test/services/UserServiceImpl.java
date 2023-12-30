package com.jpa.test.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.test.Entities.User;
import com.jpa.test.dao.UserRepository;

@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	UserRepository repository;
	
	public Optional<User> getUserById(int id) {
		Optional<User> byId = repository.findById(id);
		if(byId.isEmpty()) {
			
		}
		return byId;
	}
	public boolean createUser(User user) {
		Optional<User> user2=repository.findById(user.getId());
		if(!user2.isEmpty()) {
			return false;
		}
		repository.save(user);
		return true;
	}
}

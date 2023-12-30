package com.jpa.test.services;

import java.util.Optional;

import com.jpa.test.Entities.User;

public interface UserService {
	public Optional<User> getUserById(int id);
	
	public boolean createUser(User user);

}

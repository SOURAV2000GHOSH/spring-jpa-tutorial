package com.jpa.test.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.test.Entities.User;
import com.jpa.test.services.UserService;

@RestController
@RequestMapping("/myuser")
@CrossOrigin
public class UserController {
	@Autowired
	UserService service;
	
	@GetMapping("user/{id}")
	public ResponseEntity<User> getUser(@PathVariable("id") int id){
		Optional<User> userById = service.getUserById(id);
		if(userById.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(userById);
	}
	
	@PostMapping("/registeruser")
	public ResponseEntity<Boolean> createUser(@RequestBody User user){
		boolean user2 = service.createUser(user);
		return new ResponseEntity<>(user2,HttpStatus.CREATED);
		
	}

}

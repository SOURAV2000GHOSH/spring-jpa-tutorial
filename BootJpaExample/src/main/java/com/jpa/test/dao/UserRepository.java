package com.jpa.test.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;

import com.jpa.test.Entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {
//	public List<User> findByName(String name);
//	
//	public List<User> findByNameAndCity(String name, String city);
//	
//	// Java Persistence Query
//	@Query("select u from user u")
//	public List<User> getAllUser();
//	
//	@Query("select u from user u where u.name=?1")
//	public List<User> getUserByName(String name);
//	
//	// sql native query / sql normal query adding formats
//	@Query(value = "Select * from user", nativeQuery = true)
//	public List<User> getUsers();
}

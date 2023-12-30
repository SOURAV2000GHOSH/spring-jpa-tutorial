package com.jpa.test;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.Entities.User;
import com.jpa.test.dao.UserRepository;

@SpringBootApplication
public class BootJpaExampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootJpaExampleApplication.class, args);
		
//		UserRepository repository= context.getBean(UserRepository.class);
//		
//		User user=new User();
//		user.setName("Sourav Ghosh");
//		user.setCity("Kharagpur");
//		user.setStatus("I am a java programmer");
//		
//		User user2 = repository.save(user);
//		
//		System.out.println(user2);
//		
//		//example of @Query
//		List<User> userByName = repository.getUserByName("Sourav Ghosh");
//		userByName.forEach(user -> System.out.println(user));
	}

}

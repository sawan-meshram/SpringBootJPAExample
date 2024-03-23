package com.jpa.test;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class SpringJsaExampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJsaExampleApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
/*		User user = new User();
		user.setName("Sawan Meshram");
		user.setCity("Nagpur");
		user.setStatus("I am Java Developer");
		
		User u1 = userRepository.save(user);
		System.out.println(u1);
*/		
		//create object of user
/*		User u1 =  new User();
		u1.setName("Ram");
		u1.setCity("Pune");
		u1.setStatus("Python Programmer");

		User u2 =  new User();
		u2.setName("Shyam");
		u2.setCity("Mumbai");
		u2.setStatus("C# Programmer");

		//Saving single user
//		User ru2 = userRepository.save(u2);
//		System.out.println(ru2);
		
		//Save multiple objects
		List<User> users = new ArrayList<>();
		users.add(u1);
		users.add(u2);
		Iterable<User> resultIt = userRepository.saveAll(users);
		resultIt.forEach(System.out::println);
*/
		//Update user details
//		Optional<User> op1 = userRepository.findById(3); //how to get data
//		User user = op1.get();
//		user.setName("Shyam Tiwari");
//		User u3 = userRepository.save(user);
//		System.out.println(u3);
		
		//find all user from dataset
//		Iterable<User> it2 = userRepository.findAll();
//		it2.forEach(System.out::println);
		
		//Deleting the user element
//		userRepository.deleteById(1);
//		System.out.println("User deleted");
		
//		Iterable<User> it2 = userRepository.findAll();
//		it2.forEach(System.out::println);
//		
//		userRepository.deleteAll(it2);
//		System.out.println("All deleted.");
		
//		List<User> users = userRepository.findByName("Ram");
//		users.forEach(System.out::println);
//		
//		users = userRepository.findByNameAndCity("Ram", "Pune");
//		users.forEach(System.out::println);
		
		List<User> users = userRepository.getAllUser();
		users.forEach(System.out::println);
		
		List<User> users1 = userRepository.getUserByName("Ram");
		users1.forEach(System.out::println);
		
		List<User> users2 = userRepository.getUserByNameAndCity("Shyam", "Mumbai");
		users2.forEach(System.out::println);
		
		
		List<User> users3 = userRepository.getUsers();
		users3.forEach(System.out::println);
	
	}

}

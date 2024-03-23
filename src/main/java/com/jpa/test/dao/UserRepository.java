package com.jpa.test.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jpa.test.entities.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	//Custom finder methods
	public List<User> findByName(String name);
	public List<User> findByNameAndCity(String name, String city);
	
	//Examples on JPQL

	@Query("select u FROM User u")
	public List<User> getAllUser();
	
	@Query("select u FROM User u WHERE u.name=:n")
	public List<User> getUserByName(@Param("n") String name);
	
	@Query("select u FROM User u WHERE u.name=:n and u.city=:m")
	public List<User> getUserByNameAndCity(@Param("n") String name, @Param("m") String city);
	
	//Example of Native query
	@Query(value="select * from user", nativeQuery = true)
	public List<User> getUsers();
}

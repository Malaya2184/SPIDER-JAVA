package com.spring.data.jpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.spring.data.jpa.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	public List<User> findByName(String name);
	public List<User> findByNameAndCity(String name,String city);
	
	@Query("select u from User u")
	public List<User> findAllUser();
	
	@Query("select u from User u where u.name =:n")
	public List<User> findUserByName(@Param("n") String name);
	
	
}

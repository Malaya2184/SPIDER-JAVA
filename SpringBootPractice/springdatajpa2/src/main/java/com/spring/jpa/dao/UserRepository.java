package com.spring.jpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.spring.jpa.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	public List<User> findByCompany(String companyName);
	
	public int countByAge(int age);
	
	public List<User> findByCompanyAndAge(String company, int age);
	
	public List<User> findByCompanyIgnoreCase(String Company);
	
	@Query("select u FROM User u")
	public List<User> getAllUsers();
	
	@Query("select u FROM User u where u.name= :n")
	public List<User> getUserByName(@Param("n") String name);
	
	@Query(value="select * FROM User u where u.name= :name",nativeQuery = true)
	public List<User> getByName(@Param("name") String name);
	
}

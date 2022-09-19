package com.spring.jpa.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.stereotype.Service;

import com.spring.jpa.dao.UserRepository;
import com.spring.jpa.entity.User;

@Service
public class UserService {
	@Autowired
	UserRepository ripo;
	
	@PostConstruct
	public void initDb() {
		
		List<User> userList = new ArrayList<>();
		userList.add(new User(1, "spider", "aider",20));
		userList.add(new User(2, "tpider", "bider",20));
		userList.add(new User(3, "upider", "cider",21));
		userList.add(new User(4, "vpider", "dider",21));
		userList.add(new User(5, "wpider", "eider",22));
		userList.add(new User(6, "xpider", "fider",22));
		
		ripo.saveAll(userList);
	}
	
	public List<User> getAllUser(){
		return ripo.findAll();
	}
	
	public List<User> findUserByCompany(String companyName){
		
		return ripo.findByCompany(companyName);
	}
	
	public int countByAge(int age) {
		return ripo.countByAge(age);
	}
	
	public List<User> findByComapnyAndAge(String company, int age){
		
		return ripo.findByCompanyAndAge(company, age);
	}
	
	public List<User> findUserFromCompanyIgnoreCase(String company) {
		
		return ripo.findByCompanyIgnoreCase(company);
	}
	
//	public List<User> findSortedUser(String fieldName){
//		return ripo.findAll(new Sort9)
//	}
	
//	public List<User> findByPagignation(){
//		return ripo.findAll(new PageRequest(1, 3));
//	}
	
	public List<User> getAllUsers(){
		List<User> allUsers = ripo.getAllUsers();
//		System.out.println(allUsers);
		return allUsers;
	}
	
	public List<User> getUserByName(String name) {
		return ripo.getUserByName(name);
		
	}
	
	public List<User> getByName(String name){
		
		return ripo.getByName(name);
	}

}

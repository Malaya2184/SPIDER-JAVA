package com.spring.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jpa.entity.User;
import com.spring.jpa.service.UserService;

@RestController
@RequestMapping("/spring.data.jpa2")
public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping("/alluser")
	public List<User> allUser(){
		
		return service.getAllUser();
	}
	
	@GetMapping("/userbycomapny/{cName}")
	public List<User> findUserByCompany(@PathVariable String cName){
		System.out.println(cName);
		
		return service.findUserByCompany(cName);
	}
	
	@GetMapping("/countbyage/{age}")
	public int countByAge(@PathVariable int age) {
		return service.countByAge(age);
	}
	
	@GetMapping("/findbycompanyandage/{company}/{age}")
	public List<User> findByCompanyAndAge(@PathVariable String company, @PathVariable int age){
		
		return service.findByComapnyAndAge(company, age);
	}
	@GetMapping("/findbycompanyignorecase/{company}")
	public List<User> findbyCompIgnoreCase(@PathVariable String company){
		return service.findUserFromCompanyIgnoreCase(company);
	}
	
	@GetMapping("/getAllUser")
	public List<User> getAllUsers(){
		
		return service.getAllUser();
		
	}
	
	@GetMapping("/getuserbyname/{name}")
	public List<User> getAllUsers(@PathVariable String name){
		
		return service.getUserByName(name);
		
	}
	
	@GetMapping("/getByName/{name}")
	public List<User> getByName(@PathVariable("name") String name){
		return service.getByName(name);
	}
}

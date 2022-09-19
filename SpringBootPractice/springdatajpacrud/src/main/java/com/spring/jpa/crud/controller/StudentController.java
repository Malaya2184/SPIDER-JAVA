package com.spring.jpa.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jpa.crud.dao.StudentRepository;
import com.spring.jpa.crud.entity.Student;
import com.spring.jpa.crud.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService service;
	
	@Autowired
	StudentRepository repo;
	
	@GetMapping("/allstudents")
	public List<Student> allStudents(){
		
//		List<Student> allStudents = repo.findAll();
		List<Student> allStudents = service.allStudents();
		System.out.println(allStudents);
		return allStudents;
	}
	
	@GetMapping("/findbyname/{name}")
	public List<Student> findByName(@PathVariable String name){
		
		System.out.println("-----------------------------");
		List<Student> byName = service.findByName(name);
		return byName;
	}

	@GetMapping("/findbynameandage/{name}/{age}")
	public List<Student> findByNameAndAge(@PathVariable String name,@PathVariable int age){
		
		return service.findByNameAndAge(name, age);
	}
	
	@PostMapping("/savestudnet")
	public Student saveNewStudent(@RequestBody Student student) {
		System.out.println(student);
		return service.saveNewStudent(student);
	}
	
	@PostMapping("/savestudents")
	public List<Student> saveStudents(@RequestBody List<Student> students){
		
		return service.saveStudents(students);
	}
	
	@DeleteMapping("/deletestudent/{id}")
	public void deleteStudentById(@PathVariable int id) {
		service.deleteStudentById(id);
	}
	
	@DeleteMapping("/deletebyroll/{roll}")
	public Long deleteByRoll(@PathVariable int roll) {
		return service.deleteByRoll(roll);
	}
	
	@DeleteMapping("/deletebyname/{name}")
	public Long deleteByName(@PathVariable String name) {
		
		return service.deleteByName(name);
	}
	
	
}

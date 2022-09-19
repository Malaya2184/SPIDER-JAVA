package com.spring.jpa.crud.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.jpa.crud.dao.StudentRepository;
import com.spring.jpa.crud.entity.Student;

@Service
public class StudentService {

	@Autowired
	StudentRepository ripo;
	
//	@PostConstruct
//	public void initDb() {
//		List<Student> studentData = new ArrayList<>();
//		studentData.add(new Student(1, "malaya", 10, 18));
//		studentData.add(new Student(2, "nalaya", 20, 28));
//		studentData.add(new Student(3, "malaya", 30, 38));
//		studentData.add(new Student(4, "nalaya", 40, 48));
//		studentData.add(new Student(5, "talaya", 50, 58));
//		this.ripo.saveAll(studentData);
//	}
	
	public List<Student> allStudents(){
			
		return ripo.findAll();
	}
	
	public List<Student> findByName(String name){
		
		return ripo.findByName(name);
	}
	
	public List<Student> findByNameAndAge(String name, int age){
		return ripo.findByNameAndAge(name, age);
	}
	
	public Student saveNewStudent(Student student) {
		
		return ripo.save(student);
	}
	
	public List<Student> saveStudents(List<Student> students) {
		return ripo.saveAll(students);
	}
	
	public void deleteStudentById(int id) {
		
		ripo.deleteById(id);
	}
	
	@Transactional
	public Long deleteByRoll(int roll) {
		
		return ripo.deleteByRoll(roll);
	}
	
	@Transactional
	public Long deleteByName(String name) {
		return ripo.deleteByName(name);
	}
	
	
}

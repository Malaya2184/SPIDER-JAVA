package com.spring.jpa.crud.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.jpa.crud.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	public List<Student> findByName(String name);
	
	public List<Student> findByNameAndAge(String name , int age);
	
	public Long deleteByRoll(int roll);
	
	public Long deleteByName(String name);
}

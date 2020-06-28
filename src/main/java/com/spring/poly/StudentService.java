package com.spring.poly;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StudentService {
	@Autowired
	private StudentRepository repo;
	
	public List<Student> listAll(){
		return repo.findAll();
	}
	
	public void save(Student stu) {
		repo.save(stu);
	}
	
	public Student getId(String id) {
		return repo.findById(id).get();
	}
	
	public void delete(String id) {
		repo.deleteById(id);
	}
	
	
}
